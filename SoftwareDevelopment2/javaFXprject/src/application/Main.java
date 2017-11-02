package application;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;




public class Main extends Application {
	
	Button button;
	//@Override
//	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle(" Tiitle of the window!");
		button =new Button();
		button.setText("click me");
		
		StackPane layout=new StackPane();
		layout.getChildren().add(button);
		
		Scene scene= new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
