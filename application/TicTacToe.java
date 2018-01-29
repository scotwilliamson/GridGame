package application;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TicTacToe implements Grid{
	int turn=0;
	Button L1 = new Button("");
	Button L2 = new Button("");
	Button L3 = new Button("");
	Button M1 = new Button("");
	Button M2 = new Button("");
	Button M3 = new Button("");
	Button R1 = new Button("");
	Button R2 = new Button("");
	Button R3 = new Button("");
	
	public TicTacToe(){}
	
	public StackPane setBoard(){
		StackPane newBoard = new StackPane();
		
		L1.setMaxWidth(250);
		L1.setMaxHeight(250);
		L1.setTranslateX(-250);
		L1.setTranslateY(-250);
		
		L2.setMaxWidth(250);
		L2.setMaxHeight(250);
		L2.setTranslateX(-250);
		L2.setTranslateY(0);
		
		L3.setMaxWidth(250);
		L3.setMaxHeight(250);
		L3.setTranslateX(-250);
		L3.setTranslateY(250);
		
		M1.setMaxWidth(250);
		M1.setMaxHeight(250);
		M1.setTranslateX(0);
		M1.setTranslateY(-250);
		
		M2.setMaxWidth(250);
		M2.setMaxHeight(250);
		M2.setTranslateX(0);
		M2.setTranslateY(0);
		
		M3.setMaxWidth(250);
		M3.setMaxHeight(250);
		M3.setTranslateX(0);
		M3.setTranslateY(250);
		
		R1.setMaxWidth(250);
		R1.setMaxHeight(250);
		R1.setTranslateX(250);
		R1.setTranslateY(-250);
		
		R2.setMaxWidth(250);
		R2.setMaxHeight(250);
		R2.setTranslateX(250);
		R2.setTranslateY(0);
		
		R3.setMaxWidth(250);
		R3.setMaxHeight(250);
		R3.setTranslateX(250);
		R3.setTranslateY(250);
		
		newBoard.getChildren().addAll(L1, L2, L3, M1, M2, M3, R1, R2, R3);
		return newBoard;
	}
	
	public boolean checkForWin(){
		
		if(true){
			return true;
		}
		else {
			return false;
		}
	}
		

		public void win(){
			
		}
		
		
		public boolean switchTurns(){
			turn++;
			if(turn%2==1){
				return false;
			}
			else{
				return true;
			}
			
		}
	}
