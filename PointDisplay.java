
public class PointDisplay implements Observer, DisplayElement {
	private Goat goat;

	public PointDisplay(Goat goat) {
		this.goat = goat;
		goat.registerObserver(this);
	}

	public void update() {

		display();
	}

	public void display() {
		System.out.printf("%s ate something and now has %d.\n", goat.getName(), goat.getPoints());
		
	}
}
