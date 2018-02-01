package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public abstract class Game {
	static int turn=0;
	Button end = new Button("END GAME");
	static Label GG = new Label("GG"); 
	
	
	public abstract int switchTurns();

}
