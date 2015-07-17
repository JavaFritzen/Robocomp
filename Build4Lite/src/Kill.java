import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Kill implements Behavior{

	private Otto o;
	boolean suppressed = false;
	
	public Kill(Otto o) {
		this.o = o;
	}

	@Override
	public boolean takeControl() {
		return o.cs.getColorID() == o.tarColor;
	}

	@Override
	public void action() {
		LCD.clear();
		LCD.drawString("Kill", 0, 5);
		suppressed = false;
		
		if(!suppressed){
			//TODO: Gegnerbase berühren
		}
		
		Motor.A.stop();
		Motor.C.stop();
	}

	@Override
	public void suppress() {
		suppressed = true;
		o.nav.stop();
	}

}
