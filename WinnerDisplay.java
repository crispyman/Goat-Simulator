
public class WinnerDisplay implements Observer, DisplayElement{
	int score;
	private Goat goat;

	public WinnerDisplay(Goat goat) {
		this.goat = goat;
		score = goat.getPoints();
		goat.registerObserver(this);
	}

	public void update() {


		display();
	}

	public void display() {
		if (goat.getPoints() > 1000) {
		System.out.printf("%s wins.", goat.getName());
		}
	}
}
