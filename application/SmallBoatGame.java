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
			}
		}
		
		
		StackPane newBoard = new StackPane();
		
		grid[0][0].setMaxWidth(150);
		grid[0][0].setMaxHeight(150);
		grid[0][0].setTranslateX(-300);
		grid[0][0].setTranslateY(-300);
		
		grid[0][1].setMaxWidth(150);
		grid[0][1].setMaxHeight(150);
		grid[0][1].setTranslateX(-300);
		grid[0][1].setTranslateY(-150);
		
		grid[0][2].setMaxWidth(150);
		grid[0][2].setMaxHeight(150);
		grid[0][2].setTranslateX(-300);
		grid[0][2].setTranslateY(0);
		
		grid[0][3].setMaxWidth(150);
		grid[0][3].setMaxHeight(150);
		grid[0][3].setTranslateX(-300);
		grid[0][3].setTranslateY(150);
		
		grid[0][4].setMaxWidth(150);
		grid[0][4].setMaxHeight(150);
		grid[0][4].setTranslateX(-300);
		grid[0][4].setTranslateY(300);
		
		grid[1][0].setMaxWidth(150);
		grid[1][0].setMaxHeight(150);
		grid[1][0].setTranslateX(-150);
		grid[1][0].setTranslateY(-300);
		
		grid[1][1].setMaxWidth(150);
		grid[1][1].setMaxHeight(150);
		grid[1][1].setTranslateX(-150);
		grid[1][1].setTranslateY(-150);
		
		grid[1][2].setMaxWidth(150);
		grid[1][2].setMaxHeight(150);
		grid[1][2].setTranslateX(-150);
		grid[1][2].setTranslateY(0);
		
		grid[1][3].setMaxWidth(150);
		grid[1][3].setMaxHeight(150);
		grid[1][3].setTranslateX(-150);
		grid[1][3].setTranslateY(150);
		
		grid[1][4].setMaxWidth(150);
		grid[1][4].setMaxHeight(150);
		grid[1][4].setTranslateX(-150);
		grid[1][4].setTranslateY(300);
		
		
		grid[2][0].setMaxWidth(150);
		grid[2][0].setMaxHeight(150);
		grid[2][0].setTranslateX(0);
		grid[2][0].setTranslateY(-300);
		
		grid[2][1].setMaxWidth(150);
		grid[2][1].setMaxHeight(150);
		grid[2][1].setTranslateX(0);
		grid[2][1].setTranslateY(-150);
		
		grid[2][2].setMaxWidth(150);
		grid[2][2].setMaxHeight(150);
		grid[2][2].setTranslateX(0);
		grid[2][2].setTranslateY(0);
		
		grid[2][3].setMaxWidth(150);
		grid[2][3].setMaxHeight(150);
		grid[2][3].setTranslateX(0);
		grid[2][3].setTranslateY(150);
		
		grid[2][4].setMaxWidth(150);
		grid[2][4].setMaxHeight(150);
		grid[2][4].setTranslateX(0);
		grid[2][4].setTranslateY(300);
		
		grid[3][0].setMaxWidth(150);
		grid[3][0].setMaxHeight(150);
		grid[3][0].setTranslateX(150);
		grid[3][0].setTranslateY(-300);
		
		grid[3][1].setMaxWidth(150);
		grid[3][1].setMaxHeight(150);
		grid[3][1].setTranslateX(150);
		grid[3][1].setTranslateY(-150);
		
		grid[3][2].setMaxWidth(150);
		grid[3][2].setMaxHeight(150);
		grid[3][2].setTranslateX(150);
		grid[3][2].setTranslateY(0);
		
		grid[3][3].setMaxWidth(150);
		grid[3][3].setMaxHeight(150);
		grid[3][3].setTranslateX(150);
		grid[3][3].setTranslateY(150);
		
		grid[3][4].setMaxWidth(150);
		grid[3][4].setMaxHeight(150);
		grid[3][4].setTranslateX(150);
		grid[3][4].setTranslateY(300);
		
		grid[4][0].setMaxWidth(150);
		grid[4][0].setMaxHeight(150);
		grid[4][0].setTranslateX(300);
		grid[4][0].setTranslateY(-300);
		
		grid[4][1].setMaxWidth(150);
		grid[4][1].setMaxHeight(150);
		grid[4][1].setTranslateX(300);
		grid[4][1].setTranslateY(-150);
		
		grid[4][2].setMaxWidth(150);
		grid[4][2].setMaxHeight(150);
		grid[4][2].setTranslateX(300);
		grid[4][2].setTranslateY(0);
		
		grid[4][3].setMaxWidth(150);
		grid[4][3].setMaxHeight(150);
		grid[4][3].setTranslateX(300);
		grid[4][3].setTranslateY(150);
		
		grid[4][4].setMaxWidth(150);
		grid[4][4].setMaxHeight(150);
		grid[4][4].setTranslateX(300);
		grid[4][4].setTranslateY(300);
		
		
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