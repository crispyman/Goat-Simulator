
import java.util.*;

@SuppressWarnings("deprecation")
public class Goat implements Subject {
	String name = "";
	int score = 0;
	private List<Observer> observers;

	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	void addPoints(int x) {
		if (x > 0) {
			this.score += x;
			notifyObservers();
		}
	}
	
	int getPoints() {
		return score;
	}
	
	public Goat() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
