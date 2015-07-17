import lejos.nxt.LCD;
import lejos.robotics.subsumption.Behavior;

public class Ausweichen implements Behavior{
	
	Otto o;
	boolean suppressed = false;
	
	public Ausweichen(Otto o) {
		this.o = o;
	}

	@Override
	public boolean takeControl() {
		return o.us.getDistance() < 15;
	}

	@Override
	public void action() {
		LCD.clear();
		LCD.drawString("Ausweichen", 0, 5);
		suppressed = false;
		
		if(!suppressed){
			//TODO: Ausweichen
		}
	}

	@Override
	public void suppress() {
		o.nav.stop();
	}

}
