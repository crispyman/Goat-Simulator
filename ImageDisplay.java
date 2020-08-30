
public class ImageDisplay implements Observer, DisplayElement{
	int score;
	private Goat goat;

	public ImageDisplay(Goat goat) {
		this.goat = goat;
		score = goat.getPoints();
		goat.registerObserver(this);
	}

	public void update() {
		score = this.goat.getPoints();
		

		display();
	}

	public void display() {
		System.out.printf("%s got bigger.\n", goat.getName());
	}
}
