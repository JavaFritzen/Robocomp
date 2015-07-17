import lejos.nxt.LCD;
import lejos.robotics.subsumption.Behavior;

public class Fahren implements Behavior {

	private Otto o;
	boolean suppressed = false;
	
	public Fahren(Otto o) {
		this.o = o;
	}

	@Override
	public boolean takeControl() {
		return true;
	}

	@Override
	public void action() {
		LCD.clear();
		LCD.drawString("Fahren", 0, 5);
		suppressed = false;
		
		if(!suppressed){
			//TODO: zum Ziel fahren
			//o.nav.goTo();
		}
	}

	@Override
	public void suppress() {
		o.nav.stop();
	}

}
