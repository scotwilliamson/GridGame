package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	static Button SmallBoatbtn = new Button("Small Boat Game");
	static Button TicTacToe = new Button("Tic Tac Toe");
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			StackPane root = new StackPane();
			
			
			
			SmallBoatbtn.setMaxWidth(200);
			SmallBoatbtn.setMaxHeight(200);
			SmallBoatbtn.setTranslateX(100);
			SmallBoatbtn.setTranslateY(0);
			
			
			
			TicTacToe.setMaxWidth(200);
			TicTacToe.setMaxHeight(200);
			TicTacToe.setTranslateX(-100);
			TicTacToe.setTranslateY(0);
			
			
			
			SmallBoatbtn.setOnAction((event) -> {
			    SmallBoatGame SBG = new SmallBoatGame();
			    root.getChildren().removeAll(TicTacToe, SmallBoatbtn);
			    SBG.setBoard();
			    Scene newScene = new Scene(SBG.setBoard(), 1250, 750);
			    primaryStage.setScene(newScene);
				primaryStage.show();
			});
			
			
			
			TicTacToe.setOnAction((event) -> {
			    TicTacToe TTT = new TicTacToe();
			    root.getChildren().removeAll(TicTacToe, SmallBoatbtn);
			    TTT.setBoard();
			    Scene newScene = new Scene(TTT.setBoard(), 1250, 750);
			    primaryStage.setScene(newScene);
				primaryStage.show();
			});
			
			
			root.getChildren().addAll(SmallBoatbtn, TicTacToe);
			
			
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
