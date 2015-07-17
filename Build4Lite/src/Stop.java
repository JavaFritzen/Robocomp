
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Stop implements Behavior {

	private Otto o;
	boolean suppressed = false;
	
	public Stop(Otto o) {
		this.o = o;
	}

	@Override
	public boolean takeControl() {
		return o.ts.isPressed();
	}

	@Override
	public void action() {
		LCD.clear();
		LCD.drawString("Stop", 0, 5);
		suppressed = false;
		
		if(!suppressed){
			//TODO: Ausweichen
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
