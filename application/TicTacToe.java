package application;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class TicTacToe implements Game {
	static int turn = 0;
	Button[][] ticTacGrid = new Button[3][3];
	Button end = new Button("END GAME");
	Label rules1 = new Label("O starts first! If game ends in a tie");
	Label rules2 = new Label("click 'End Game'!");
	

	public TicTacToe() {
	}

	
	public boolean checkForWin() {

		if (true) {
			return true;
		} else {
			return false;
		}
	}

	public void win() {

	}

	public int switchTurns() {
		turn++;	
		return turn;
	}


	public StackPane setBoard() {
		TicTacToe button1 = new TicTacToeButton();
		TicTacToe button2 = new TicTacToeButton();
		TicTacToe button3 = new TicTacToeButton();
		TicTacToe button4 = new TicTacToeButton();
		TicTacToe button5 = new TicTacToeButton();
		TicTacToe button6 = new TicTacToeButton();
		TicTacToe button7 = new TicTacToeButton();
		TicTacToe button8 = new TicTacToeButton();
		TicTacToe button9 = new TicTacToeButton();
		StackPane newBoard = new StackPane();
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				ticTacGrid[i][k] = new Button();
				ticTacGrid[i][k].setMaxHeight(250);
				ticTacGrid[i][k].setMaxWidth(250);
				ticTacGrid[i][k].setTranslateX(-250 + i * 250);
				ticTacGrid[i][k].setTranslateY(-250 + k * 250);
	
				newBoard.getChildren().add(ticTacGrid[i][k]);
			}
		}

		
		
		ticTacGrid[0][0].setOnAction((event) -> {
			if (((TicTacToeButton) button1).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton)button1).pressCheck=false;
				if ((((TicTacToeButton) button1).chooseXO())==true) {
					ticTacGrid[0][0].setText("X");
				} 	
					else {
					ticTacGrid[0][0].setText("O");
				}
			} 
			else {
			}
		});
		
		ticTacGrid[0][1].setOnAction((event) -> {
			if (((TicTacToeButton) button2).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton)button2).pressCheck=false;
					if ((((TicTacToeButton) button2).chooseXO())==true) {
					ticTacGrid[0][1].setText("X");
				} 	
					else {
					ticTacGrid[0][1].setText("O");
				}
			} 
			else {
			}
		});
		
		ticTacGrid[0][2].setOnAction((event) -> {
			if (((TicTacToeButton) button3).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton)button3).pressCheck=false;
					if ((((TicTacToeButton) button3).chooseXO())==true) {
					ticTacGrid[0][2].setText("X");
				} 	
					else {
					ticTacGrid[0][2].setText("O");
				}
			} 
			else {
			}
		});
		
		ticTacGrid[1][0].setOnAction((event) -> {
			if (((TicTacToeButton) button4).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button4).pressCheck = false;
					if ((((TicTacToeButton) button4).chooseXO())==true) {
					ticTacGrid[1][0].setText("X");
				} 	
					else {
					ticTacGrid[1][0].setText("O");
				}
			} 
			else {
			}
		});
		
		ticTacGrid[1][1].setOnAction((event) -> {
			if (((TicTacToeButton) button5).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button5).pressCheck = false;
					if ((((TicTacToeButton) button5).chooseXO())==true) {
					ticTacGrid[1][1].setText("X");
				} 	
					else {
					ticTacGrid[1][1].setText("O");
				}
			} 
			else {
			}
		});
		
		ticTacGrid[1][2].setOnAction((event) -> {
			if (((TicTacToeButton) button6).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button6).pressCheck = false;
					if ((((TicTacToeButton) button6).chooseXO())==true) {
					ticTacGrid[1][2].setText("X");
				} 	
					else {
					ticTacGrid[1][2].setText("O");
				}
			} 
			else {
			}
		});
		
		ticTacGrid[2][0].setOnAction((event) -> {
			if (((TicTacToeButton) button7).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button7).pressCheck = false;
					if ((((TicTacToeButton) button7).chooseXO())==true) {
					ticTacGrid[2][0].setText("X");
				} 	
					else {
					ticTacGrid[2][0].setText("O");
				}
			} 
			else {
			}
		});
		
		ticTacGrid[2][1].setOnAction((event) -> {
			if (((TicTacToeButton) button8).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button8).pressCheck = false;
					if ((((TicTacToeButton) button8).chooseXO())==true) {
					ticTacGrid[2][1].setText("X");
				} 	
					else {
					ticTacGrid[2][1].setText("O");
				}
			} 
			else {
			}
		});
		
		ticTacGrid[2][2].setOnAction((event) -> {
			if (((TicTacToeButton) button9).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button9).pressCheck = false;
					if ((((TicTacToeButton) button9).chooseXO())==true) {
					ticTacGrid[2][2].setText("X");
					System.out.println(turn);
				} 	
					else {
					ticTacGrid[2][2].setText("O");
				}
			} 
			else {
			}
		});
		
		end.setOnAction((event) -> {
			newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0], ticTacGrid[0][1],
					ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1], 
					ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2);
			newBoard.getChildren().addAll(Main.SmallBoat, Main.TicTacToe);
		});
		
		end.setMaxSize(250, 250);
		end.setTranslateX(-500);
		
		rules1.setMaxSize(250, 250);
		rules1.setTranslateX(500);
		
		rules2.setMaxSize(250, 250);
		rules2.setTranslateX(500);
		rules2.setTranslateY(25);
		

		newBoard.getChildren().addAll(end, rules1, rules2);

		return newBoard;
	}

}
