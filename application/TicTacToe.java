package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class TicTacToe implements Grid{
	int turn=0;
	
	public TicTacToe(){}
	

	public boolean CheckForWin(){
		
		if(true){
			return true;
		}
		else {
			return false;
		}
		}
		

		public void Win(){
			
		}
		
		
		public boolean SwitchTurns(){
			turn++;
			if(turn%2==1){
				return false;
			}
			else{
				return true;
			}
			
		}
	}
