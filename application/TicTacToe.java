package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class TicTacToe implements Grid{
	int turn=0;
	
	public TicTacToe(){}
	

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
