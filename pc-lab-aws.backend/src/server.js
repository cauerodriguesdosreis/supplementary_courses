import express from "express";
import cors from "cors";
import dotenv from "dotenv";
import pool from "./config/db.js";

dotenv.config();
const app = express();
const port = process.env.PORT || 3000;

app.use(cors());
app.use(express.json());

// 📌 Criar uma nova Task
app.post("/tasks", async (req, res) => {
  try {
    const { title } = req.body;
    const [result] = await pool.execute(
      "INSERT INTO tasks (title) VALUES (?)",
      [title]
    );
    res.status(201).json({ id: result.insertId, title, completed: false });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

// 📌 Listar todas as Tasks
app.get("/tasks", async (req, res) => {
  try {
    const [rows] = await pool.execute("SELECT * FROM tasks");
    res.json(rows);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

// 📌 Atualizar uma Task (marcar como concluída)
app.put("/tasks/:id", async (req, res) => {
  try {
    const { id } = req.params;
    const { completed } = req.body;
    const [result] = await pool.execute(
      "UPDATE tasks SET completed = ? WHERE id = ?",
      [completed, id]
    );
    if (result.affectedRows === 0) {
      return res.status(404).json({ error: "Task não encontrada" });
    }
    res.json({ id, completed });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

// 📌 Deletar uma Task
app.delete("/tasks/:id", async (req, res) => {
  try {
    const { id } = req.params;
    const [result] = await pool.execute("DELETE FROM tasks WHERE id = ?", [id]);
    if (result.affectedRows === 0) {
      return res.status(404).json({ error: "Task não encontrada" });
    }
    res.json({ message: "Task deletada!" });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

app.listen(port, () => {
  console.log(`🔥 Servidor rodando na porta ${port}`);
});
