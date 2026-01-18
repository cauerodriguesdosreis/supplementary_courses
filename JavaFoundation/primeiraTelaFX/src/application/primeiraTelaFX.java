package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.Group;


public class primeiraTelaFX extends Application {
	@Override
	public void start(Stage estagio1) throws Exception {    //Criar o método start
		Group raiz = new Group();							// Group vai preparar a Scene 
		Scene cena = new Scene(raiz, 600, 300);
		cena.setFill(Color.DARKVIOLET);
		estagio1.setTitle("Exemplo com JavaFX");			//Definir o título da janela
		estagio1.setScene(cena);							// Definir a cena a ser exibida na janela
		estagio1.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
