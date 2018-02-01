package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public abstract class Game {
	static int turn = 0;// used by all classes
	Button end = new Button("END GAME");// used by all classes
	static Label GG = new Label("GG"); // used by all classes

	public abstract int switchTurns(); // used by all classes

}
