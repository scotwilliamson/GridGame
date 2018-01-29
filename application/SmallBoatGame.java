package application;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SmallBoatGame implements Grid {
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
		
		for(int i= 0; i<5; i++){
			for(int k=0; k<5; k++){
				grid[i][k]= new Button();
				grid[i][k].setMaxHeight(150);
				grid[i][k].setMaxWidth(150);
				grid[i][k].setTranslateX(-300+i*150);
				grid[i][k].setTranslateY(-300+k*150);
			}
		}
	
		
		
		StackPane newBoard = new StackPane();
		
		
		newBoard.getChildren().addAll(grid[0][0], grid[0][1], grid[0][2], grid[0][3], 
				grid[0][4], grid[1][0], grid[1][1], grid[1][2], grid[1][3], grid[1][4], 
				grid[2][0], grid[2][1], grid[2][2], grid[2][3], grid[2][4], grid[3][0],
				grid[3][1], grid[3][2], grid[3][3], grid[3][4], grid[4][0], grid[4][1],
				grid[4][2], grid[4][3], grid[4][4]);
		return newBoard;
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