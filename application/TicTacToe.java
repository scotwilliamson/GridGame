package application;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class TicTacToe extends Game {

	Button[][] ticTacGrid = new Button[3][3]; // grid
	Label rules1 = new Label("O starts first!"); // rules
	Label rules2 = new Label("Next Game the Opposite Starts First!");
	Label rules3 = new Label("If game ends in a tie click 'End Game'!");

	public TicTacToe() {
	}

	public boolean checkForWin() { // check for win
		if (((ticTacGrid[0][0].getText() == ticTacGrid[0][1].getText()
				&& ticTacGrid[0][1].getText() == ticTacGrid[0][2].getText()) && ticTacGrid[0][0].getText() != "")
				|| ((ticTacGrid[0][0].getText() == ticTacGrid[1][0].getText()
						&& ticTacGrid[1][0].getText() == ticTacGrid[2][0].getText())
						&& ticTacGrid[0][0].getText() != "")
				|| ((ticTacGrid[0][0].getText() == ticTacGrid[1][1].getText()
						&& ticTacGrid[1][1].getText() == ticTacGrid[2][2].getText())
						&& ticTacGrid[0][0].getText() != "")
				|| ((ticTacGrid[1][0].getText() == ticTacGrid[1][1].getText()
						&& ticTacGrid[1][1].getText() == ticTacGrid[1][2].getText())
						&& ticTacGrid[1][0].getText() != "")
				|| ((ticTacGrid[2][0].getText() == ticTacGrid[2][1].getText()
						&& ticTacGrid[2][1].getText() == ticTacGrid[2][2].getText())
						&& ticTacGrid[2][0].getText() != "")
				|| ((ticTacGrid[0][1].getText() == ticTacGrid[1][1].getText()
						&& ticTacGrid[1][1].getText() == ticTacGrid[2][1].getText())
						&& ticTacGrid[0][1].getText() != "")
				|| ((ticTacGrid[0][2].getText() == ticTacGrid[1][2].getText()
						&& ticTacGrid[1][2].getText() == ticTacGrid[2][2].getText())
						&& ticTacGrid[0][2].getText() != "")
				|| ((ticTacGrid[0][2].getText() == ticTacGrid[1][1].getText()
						&& ticTacGrid[1][1].getText() == ticTacGrid[2][0].getText())
						&& ticTacGrid[0][2].getText() != "")) {
			return true;
		} else
			return false;
	}

	public int switchTurns() {
		turn++;
		return turn;
	}

	public StackPane setBoard() {
		TicTacToe button1 = new TicTacToeButton(); // create new objects
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
			for (int k = 0; k < 3; k++) { // create grid
				ticTacGrid[i][k] = new Button();
				ticTacGrid[i][k].setMaxHeight(250);
				ticTacGrid[i][k].setMaxWidth(250);
				ticTacGrid[i][k].setTranslateX(-250 + i * 250);
				ticTacGrid[i][k].setTranslateY(-250 + k * 250);
				newBoard.getChildren().add(ticTacGrid[i][k]);
			}
		}

		ticTacGrid[0][0].setOnAction((event) -> { // creating on action event
													// handlers
			if (((TicTacToeButton) button1).pressCheck == true) { // lots of
																	// downcasting
				turn = switchTurns(); // increment turn
				((TicTacToeButton) button1).pressCheck = false; // cant reclick
																// button now
				if ((((TicTacToeButton) button1).chooseXO(((TicTacToeButton) button1))) == true) { // choose
																									// x
																									// or
																									// o
					ticTacGrid[0][0].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[0][0].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		ticTacGrid[0][1].setOnAction((event) -> {
			if (((TicTacToeButton) button2).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button2).pressCheck = false;
				if ((((TicTacToeButton) button2).chooseXO(((TicTacToeButton) button1))) == true) {
					ticTacGrid[0][1].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[0][1].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		ticTacGrid[0][2].setOnAction((event) -> {
			if (((TicTacToeButton) button3).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button3).pressCheck = false;
				if ((((TicTacToeButton) button3).chooseXO()) == true) {
					ticTacGrid[0][2].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[0][2].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		ticTacGrid[1][0].setOnAction((event) -> {
			if (((TicTacToeButton) button4).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button4).pressCheck = false;
				if ((((TicTacToeButton) button4).chooseXO(((TicTacToeButton) button1))) == true) {
					ticTacGrid[1][0].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[1][0].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		ticTacGrid[1][1].setOnAction((event) -> {
			if (((TicTacToeButton) button5).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button5).pressCheck = false;
				if ((((TicTacToeButton) button5).chooseXO()) == true) {
					ticTacGrid[1][1].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[1][1].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		ticTacGrid[1][2].setOnAction((event) -> {
			if (((TicTacToeButton) button6).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button6).pressCheck = false;
				if ((((TicTacToeButton) button6).chooseXO()) == true) {
					ticTacGrid[1][2].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[1][2].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		ticTacGrid[2][0].setOnAction((event) -> {
			if (((TicTacToeButton) button7).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button7).pressCheck = false;
				if ((((TicTacToeButton) button7).chooseXO()) == true) {
					ticTacGrid[2][0].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[2][0].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		ticTacGrid[2][1].setOnAction((event) -> {
			if (((TicTacToeButton) button8).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button8).pressCheck = false;
				if ((((TicTacToeButton) button8).chooseXO()) == true) {
					ticTacGrid[2][1].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[2][1].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		ticTacGrid[2][2].setOnAction((event) -> {
			if (((TicTacToeButton) button9).pressCheck == true) {
				turn = switchTurns();
				((TicTacToeButton) button9).pressCheck = false;
				if ((((TicTacToeButton) button9).chooseXO(((TicTacToeButton) button1))) == true) {
					ticTacGrid[2][2].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				} else {
					ticTacGrid[2][2].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0],
								ticTacGrid[0][1], ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1],
								ticTacGrid[1][2], ticTacGrid[2][2], end, rules1, rules2, rules3);
						newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe, GG);
					} else {
					}
				}
			} else {
			}
		});

		end.setOnAction((event) -> { // end on action event handler
			newBoard.getChildren().removeAll(ticTacGrid[0][0], ticTacGrid[1][0], ticTacGrid[2][0], ticTacGrid[0][1],
					ticTacGrid[0][2], ticTacGrid[1][1], ticTacGrid[2][1], ticTacGrid[1][2], ticTacGrid[2][2], end,
					rules1, rules2, rules3, GG);
			newBoard.getChildren().addAll(Main.SmallBoatbtn, Main.TicTacToe);
		});

		end.setMaxSize(250, 250); // dimensions
		end.setTranslateX(-500);

		rules1.setMaxSize(250, 250);
		rules1.setTranslateX(500);

		rules2.setMaxSize(250, 250);
		rules2.setTranslateX(500);
		rules2.setTranslateY(25);

		rules3.setMaxSize(250, 250);
		rules3.setTranslateX(500);
		rules3.setTranslateY(50);

		GG.setMaxSize(250, 250);
		GG.setTranslateX(125);
		GG.setTranslateY(-150);

		newBoard.getChildren().addAll(end, rules1, rules2, rules3);

		return newBoard;
	}

}
