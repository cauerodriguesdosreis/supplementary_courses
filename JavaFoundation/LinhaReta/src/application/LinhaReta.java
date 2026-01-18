package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LinhaReta extends Application {
	@Override
	public void start(Stage estagio2) {
		Line linha = new Line();
		
		linha.setStartX(100.0);
		linha.setStartY(150.0);
		linha.setEndX(500.0);
		linha.setEndY(150.0);
		linha.setStroke(Color.BEIGE);
		linha.setStrokeWidth(50);
		
		Label texto = new Label ("Heitor é viado");
		texto.setLayoutX((linha.getStartX() + linha.getEndX() / 2 - 100));
		texto.setLayoutY(linha.getStartY() - 10);
		texto.setTextFill(Color.BLACK);
		texto.setFont(Font.font(null, FontWeight.BOLD, 16));
		
		Group raiz = new Group(linha, texto);						// Group vai preparar a Scene 
		Scene cena = new Scene(raiz, 600, 300);
		cena.setFill(Color.DARKVIOLET);
		estagio2.setTitle("Novo exemplo com JavaFX");		//Definir o título da janela
		estagio2.setScene(cena);							// Definir a cena a ser exibida na janela
		estagio2.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
