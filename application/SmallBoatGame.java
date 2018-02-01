package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SmallBoatGame extends Game {
	Button quit = new Button("Be a quitter");
	boolean[] clicked = new boolean[25];
	boolean winClick = true;
	Button[][] grid = new Button[5][5];
	Label turnCounter = new Label();
	Label rules1 = new Label("Try and find the Boat!");
	Label rules2 = new Label("X means you missed,");
	Label rules3 = new Label("Try to do it with the");
	Label rules4 = new Label("least amount of clicks!");

	public SmallBoatGame() {
	}

	public StackPane setBoard() {
		StackPane newBoard = new StackPane();
		for (int a = 0; a < 25; a++) {
			clicked[a] = true;
		}
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				grid[i][k] = new Button();
				grid[i][k].setMaxHeight(150);
				grid[i][k].setMaxWidth(150);
				grid[i][k].setTranslateX(-300 + i * 150);
				grid[i][k].setTranslateY(-300 + k * 150);
				grid[i][k].setText("?");
				newBoard.getChildren().add(grid[i][k]);
			}
		}
		grid[0][0].setOnAction((event) -> {
			if (clicked[0] == true) {
				grid[0][0].setText("X");
				switchTurns();
				clicked[0] = false;
			}
		});
		grid[0][1].setOnAction((event) -> {
			if (clicked[1] == true) {
				grid[0][1].setText("X");
				switchTurns();
				clicked[1] = false;
			}
		});
		grid[0][2].setOnAction((event) -> {
			if (clicked[2] == true) {
				grid[0][2].setText("X");
				switchTurns();
				clicked[2] = false;
			}
		});
		grid[0][3].setOnAction((event) -> {
			if (clicked[3] == true) {
				grid[0][3].setText("X");
				switchTurns();
				clicked[3] = false;
			}
		});
		grid[0][4].setOnAction((event) -> {
			if (clicked[4] == true) {
				grid[0][4].setText("X");
				switchTurns();
				clicked[4] = false;
			}
		});
		grid[1][0].setOnAction((event) -> {
			if (clicked[5] == true) {
				grid[1][0].setText("X");
				switchTurns();
				clicked[5] = false;
			}
		});
		grid[1][1].setOnAction((event) -> {
			if (clicked[6] == true) {
				grid[1][1].setText("X");
				switchTurns();
				clicked[6] = false;
			}
		});
		grid[1][2].setOnAction((event) -> {
			if (clicked[7] == true) {
				grid[1][2].setText("X");
				switchTurns();
				clicked[7] = false;
			}
		});
		grid[1][3].setOnAction((event) -> {
			if (clicked[8] == true) {
				grid[1][3].setText("X");
				switchTurns();
				clicked[8] = false;
			}
		});
		grid[1][4].setOnAction((event) -> {
			if (clicked[9] == true) {
				grid[1][4].setText("X");
				switchTurns();
				clicked[9] = false;
			}
		});
		grid[2][0].setOnAction((event) -> {
			if (clicked[10] == true) {
				grid[2][0].setText("X");
				switchTurns();
				clicked[10] = false;
			}
		});
		grid[2][1].setOnAction((event) -> {
			if (clicked[11] == true) {
				grid[2][1].setText("X");
				switchTurns();
				clicked[11] = false;
			}
		});
		grid[2][2].setOnAction((event) -> {
			if (clicked[12] == true) {
				grid[2][2].setText("X");
				switchTurns();
				clicked[12] = false;
			}
		});
		grid[2][3].setOnAction((event) -> {
			if (clicked[13] == true) {
				grid[2][3].setText("X");
				switchTurns();
				clicked[13] = false;
			}
		});
		grid[2][4].setOnAction((event) -> {
			if (clicked[14] == true) {
				grid[2][4].setText("X");
				switchTurns();
				clicked[14] = false;
			}
		});
		grid[3][0].setOnAction((event) -> {
			if (clicked[15] == true) {
				grid[3][0].setText("X");
				switchTurns();
				clicked[15] = false;
			}
		});
		grid[3][1].setOnAction((event) -> {
			if (clicked[16] == true) {
				grid[3][1].setText("X");
				switchTurns();
				clicked[16] = false;
			}
		});
		grid[3][2].setOnAction((event) -> {
			if (clicked[17] == true) {
				grid[3][2].setText("X");
				switchTurns();
				clicked[17] = false;
			}
		});
		grid[3][3].setOnAction((event) -> {
			if (clicked[18] == true) {
				grid[3][3].setText("X");
				switchTurns();
				clicked[18] = false;
			}
		});
		grid[3][4].setOnAction((event) -> {
			if (clicked[19] == true) {
				grid[3][4].setText("X");
				switchTurns();
				clicked[19] = false;
			}
		});
		grid[4][0].setOnAction((event) -> {
			if (clicked[20] == true) {
				grid[4][0].setText("X");
				switchTurns();
				clicked[20] = false;
			}
		});
		grid[4][1].setOnAction((event) -> {
			if (clicked[21] == true) {
				grid[4][1].setText("X");
				switchTurns();
				clicked[21] = false;
			}
		});
		grid[4][2].setOnAction((event) -> {
			if (clicked[22] == true) {
				grid[4][2].setText("X");
				switchTurns();
				clicked[22] = false;
			}
		});
		grid[4][3].setOnAction((event) -> {
			if (clicked[23] == true) {
				grid[4][3].setText("X");
				switchTurns();
				clicked[23] = false;
			}
		});
		grid[4][4].setOnAction((event) -> {
			if (clicked[24] == true) {
				grid[4][4].setText("X");
				switchTurns();
				clicked[24] = false;
			}
		});
		int x = ((int) (Math.random() / 2 * 10));
		int y = ((int) (Math.random() / 2 * 10));
		grid[x][y].setOnAction((event) -> {
			if (winClick == true) {
				grid[x][y].setText("YOU FOUND IT");
				winClick = false;
				newBoard.getChildren().add(end);
			}
		});
		end.setOnAction((event) -> {
			newBoard.getChildren().removeAll(grid[0][0], grid[0][1], grid[0][2], grid[0][3], grid[0][4], grid[1][0],
					grid[1][1], grid[1][2], grid[1][3], grid[1][4], grid[2][0], grid[2][1], grid[2][2], grid[2][3],
					grid[2][4], grid[3][0], grid[3][1], grid[3][2], grid[3][3], grid[3][4], grid[4][0], grid[4][1],
					grid[4][2], grid[4][3], grid[4][4], rules1, rules2, rules3, turnCounter, rules4, end, quit);
			newBoard.getChildren().addAll(Main.TicTacToe, Main.SmallBoatbtn, GG);
		});
		quit.setOnAction((event) -> {
			newBoard.getChildren().removeAll(grid[0][0], grid[0][1], grid[0][2], grid[0][3], grid[0][4], grid[1][0],
					grid[1][1], grid[1][2], grid[1][3], grid[1][4], grid[2][0], grid[2][1], grid[2][2], grid[2][3],
					grid[2][4], grid[3][0], grid[3][1], grid[3][2], grid[3][3], grid[3][4], grid[4][0], grid[4][1],
					grid[4][2], grid[4][3], grid[4][4], rules1, rules2, rules3, turnCounter, rules4, end, quit);
			newBoard.getChildren().addAll(Main.TicTacToe, Main.SmallBoatbtn);
		});
		GG.setMaxSize(250, 250);
		GG.setTranslateX(125);
		GG.setTranslateY(-150);
		rules1.setMaxSize(150, 150);
		rules1.setTranslateX(500);
		rules2.setMaxSize(150, 150);
		rules2.setTranslateX(500);
		rules2.setTranslateY(25);
		rules3.setMaxSize(150, 150);
		rules3.setTranslateX(500);
		rules3.setTranslateY(50);
		rules4.setMaxSize(150, 150);
		rules4.setTranslateX(500);
		rules4.setTranslateY(75);
		turnCounter.setMaxSize(150, 150);
		turnCounter.setTranslateX(-500);
		end.setMaxSize(150, 150);
		end.setTranslateX(-500);
		end.setTranslateY(100);
		quit.setMaxSize(150, 150);
		quit.setTranslateX(-500);
		quit.setTranslateY(-200);

		newBoard.getChildren().addAll(rules1, rules2, rules3, rules4, turnCounter, quit);

		return newBoard;
	}

	public int switchTurns() {
		turn++;
		turnCounter.setText("Turn Count: " + turn);
		return turn;
	}

}