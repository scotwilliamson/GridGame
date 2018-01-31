package application;

import javafx.scene.control.Button;

public class TicTacToeButton extends TicTacToe{
	boolean pressCheck= true;
	public TicTacToeButton(){}
	
	public boolean chooseXO(){
		
		if(turn%2==0){
			return true;
		}
		else if (turn%2==1){
			return false;
		}
		else return (Boolean) null;
	}
}
