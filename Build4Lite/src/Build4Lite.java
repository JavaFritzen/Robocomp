import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Build4Lite {

	public static void main(String[] args) {
		Otto otto = new Otto();
		
		//TODO: Farbe einstellen
		
		LCD.clear();
		LCD.drawString("Start", 0, 0);
		Button.waitForAnyPress();
		
		Behavior[] b = {new Fahren(otto),new Ausweichen(otto),new Stop(otto),new Kill(otto),new Ausschalten()};
		Arbitrator a = new Arbitrator(b);
		Button.waitForAnyPress();
		a.start();
	}

}
