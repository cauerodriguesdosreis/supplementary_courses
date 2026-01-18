package form_de_login;

import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppDeLogin extends Application {

	@Override
	public void start(Stage estagio) throws Exception {
		AnchorPane painel = new AnchorPane();
		painel.setPrefSize(400, 300);

		TextField txlogin = new TextField();
		txlogin.setPromptText("Digite seu login ");
		PasswordField txSenha = new PasswordField();
		txSenha.setPromptText("Digite aqui sua senha ");
		Button btEntrar = new Button("Entrar");
		Button btSair = new Button("Sair");

		painel.getChildren().addAll(txlogin, txSenha, btEntrar, btSair);
		painel.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");

		Scene cena = new Scene(painel);
		estagio.setScene(cena);
		estagio.show();

		txlogin.setLayoutX((painel.getWidth() - txlogin.getWidth()) / 2);
		txlogin.setLayoutY(50);
		txSenha.setLayoutX((painel.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(100);
		btEntrar.setLayoutX((painel.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((painel.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);

	}

	public static void main(String[] args) {
		launch();
	}
}
