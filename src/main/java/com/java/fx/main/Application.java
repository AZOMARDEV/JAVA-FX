package com.java.fx.main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main2-view.fxml"));
		Scene scene = new Scene(fxmlLoader.load());
		primaryStage.setTitle("Hello!");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		System.out.println("main 2 ");
		launch();
	}
}
