package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	String javaVersion = System.getProperty("java.version");
	String javafxVersion = System.getProperty("javafx.version");
	Label l = new Label ("Olá, JavaFX" + javafxVersion + " , rodando no Java " + javaVersion);
	Scene scene = new Scene (new StackPane(l), 640, 480);
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
