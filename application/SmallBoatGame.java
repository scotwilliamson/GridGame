package application;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SmallBoatGame implements Game {
	int turn=0;
	Button[][] grid = new Button[5][5]; 
	
	
	
	public SmallBoatGame(){}

	public boolean checkForWin(){
		
		if(true){
			return true;
		}
		else {
			return false;
		}
		}
		
	public StackPane setBoard(){
	
		StackPane newBoard = new StackPane();
		for(int i= 0; i<5; i++){
			for(int k=0; k<5; k++){
				grid[i][k]= new Button();
				grid[i][k].setMaxHeight(150);
				grid[i][k].setMaxWidth(150);
				grid[i][k].setTranslateX(-300+i*150);
				grid[i][k].setTranslateY(-300+k*150);
				newBoard.getChildren().add(grid[i][k]);
			}
		}
		
		
		return newBoard;
	}
	
		public boolean win(){
			return true;
		}
		
		
		public int switchTurns(){
			turn++;
			if(turn%2==1){
				
			}
			else{
				
			}
			return turn;
		}

}