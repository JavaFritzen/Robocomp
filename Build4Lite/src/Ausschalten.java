import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class Ausschalten implements Behavior {

	public Ausschalten() {
	}
	@Override
	public boolean takeControl() {
		
		return Button.ESCAPE.isDown();
	}

	@Override
	public void action() {
		System.exit(0);
	}

	@Override
	public void suppress() {
		
	}

}
