import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.addon.ColorHTSensor;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.navigation.Navigator;
import lejos.robotics.navigation.Waypoint;

public class Otto {

	// Sensoren
	UltrasonicSensor us;
	ColorHTSensor cs;
	TouchSensor ts;
	// Motoren
	RegulatedMotor leftMotor;
	RegulatedMotor rightMotor;
	// Eigenschaften des Fahrzeuges
	double wheelDiameter;
	double trackWidth;
	boolean reverse;
	// Spielfeldgröße
	int LEANGE = 75;
	int BREITE = 75;
	// Zielfarbe
	int tarColor;
	// Pilot und Navigator
	DifferentialPilot pilot;
	Navigator nav;
	// Ziel
	Waypoint ziel;

	
	
	public Otto() {
		this.us = new UltrasonicSensor(SensorPort.S4);
		this.cs = new ColorHTSensor(SensorPort.S3);
		this.ts = new TouchSensor(SensorPort.S2);
		
		leftMotor = Motor.A;
		rightMotor = Motor.C;
		
		wheelDiameter = 4.4;
		trackWidth = 9.5;
		reverse = false;
		
		pilot = new DifferentialPilot(wheelDiameter, trackWidth, leftMotor, rightMotor);
		nav = new Navigator(pilot);
		
		
	}
	
	public void setFarbe(int c){
		tarColor = c;
	}
}
