package application;

public interface Game {
	public abstract boolean checkForWin();
	public abstract int switchTurns();
	public abstract boolean win();
}