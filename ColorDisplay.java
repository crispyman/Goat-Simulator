
public class ColorDisplay implements Observer, DisplayElement{
	private static String color = "Green";
	private Goat goat;

	public ColorDisplay(Goat goat) {
		this.goat = goat;
		goat.registerObserver(this);
	}

	public void update() {

		display();
	}

	public void display() {
		int score = this.goat.getPoints();
		if (color == "Green" && score >= 500 && score < 900) {
			color = "Yellow";
			System.out.println("The new color scheme is Yellow.");
		} else if (color != "Red" && score >= 900) {
			color = "Red";
			System.out.println("The new color scheme is Red.");
		} 
	}
}
