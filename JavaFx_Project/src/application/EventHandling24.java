package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventHandling24  extends Application {

	@Override
	public void start(Stage primaryStage) {
		TextField t1 = new TextField();
		BorderPane bp = new BorderPane();
		bp.setTop(t1);
		System.out.println(t1);
		


	Scene scene = new Scene(bp,600,200);							
	primaryStage.setTitle("Bem Vindo ao Mundo Java!");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
