import java.util.*;

public class GoatSimulator{

	
	
	public static void main(String[] args) {
		Goat goat1 = new Goat();
		Goat goat2 = new Goat();
		
		goat1.setName("goat1");
		goat2.setName("goat2");

		
		ImageDisplay imageDisplay1 = new ImageDisplay(goat1);
		PointDisplay PointDisplay1 = new PointDisplay(goat1);
		WinnerDisplay WinnerDisplay1 = new WinnerDisplay(goat1);
		ColorDisplay colorDisplay1 = new ColorDisplay(goat1);
		
		ImageDisplay imageDisplay2 = new ImageDisplay(goat2);
		PointDisplay PointDisplay2 = new PointDisplay(goat2);
		WinnerDisplay WinnerDisplay2 = new WinnerDisplay(goat2);
		ColorDisplay colorDisplay2 = new ColorDisplay(goat2);

		
		Random rand = new Random();
		
		while (true)
		{
			goat1.addPoints(rand.nextInt(11));
			if(goat1.getPoints() >= 1000) {
				return;
			}
			goat2.addPoints(rand.nextInt(11));
			if(goat2.getPoints() >= 1000) {
				return;
			}
			

		}
		//goat.setMeasurements(80, 65, 30.4f);
		//goat.setMeasurements(82, 70, 29.2f);
		//goat.setMeasurements(78, 90, 29.2f);
		
		//weatherData.removeObserver(forecastDisplay);
		//weatherData.setMeasurements(62, 90, 28.1f);
	}


}
