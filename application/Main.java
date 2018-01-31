package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	static Button SmallBoat = new Button("Small Boat Game");
	static Button TicTacToe = new Button("Tic Tac Toe");
	
	@Override
	public void start(Stage primaryStage) {
		try {
			StackPane root = new StackPane();
			
			
			
			SmallBoat.setMaxWidth(200);
			SmallBoat.setMaxHeight(200);
			SmallBoat.setTranslateX(100);
			SmallBoat.setTranslateY(0);
			
			
			
			TicTacToe.setMaxWidth(200);
			TicTacToe.setMaxHeight(200);
			TicTacToe.setTranslateX(-100);
			TicTacToe.setTranslateY(0);
			
			
			
			SmallBoat.setOnAction((event) -> {
			    SmallBoatGame SBG = new SmallBoatGame();
			    root.getChildren().removeAll(TicTacToe, SmallBoat);
			    SBG.setBoard();
			    Scene newScene = new Scene(SBG.setBoard(), 750, 750);
			    primaryStage.setScene(newScene);
				primaryStage.show();
			});
			
			
			
			TicTacToe.setOnAction((event) -> {
			    TicTacToe TTT = new TicTacToe();
			    root.getChildren().removeAll(TicTacToe, SmallBoat);
			    TTT.setBoard();
			    Scene newScene = new Scene(TTT.setBoard(), 1250, 750);
			    primaryStage.setScene(newScene);
				primaryStage.show();
			});
			
			
			root.getChildren().addAll(SmallBoat, TicTacToe);
			
			
			Scene scene = new Scene(root,1250,750);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
