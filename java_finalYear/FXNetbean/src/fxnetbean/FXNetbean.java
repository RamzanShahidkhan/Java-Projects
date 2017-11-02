/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxnetbean;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Shahidkhan
 */
public class FXNetbean extends Application {
    
    private static StackPane pane = new StackPane();

    @Override
    public void start(Stage stage) {
        
        Parent root;
        root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("/Source Packages/fxnetbean/demoFXML.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pane.getChildren().add(root);

		Scene scene = new Scene(pane);
                
		stage.setTitle("Sudo Timer");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setFullScreen(false);
		stage.show();
        /*
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();**/
    }

   //* @param args the command line arguments
     
    public static void main(String[] args) {
        launch(args);
    }
    
}
