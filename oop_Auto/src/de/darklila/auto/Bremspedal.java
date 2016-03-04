package de.darklila.auto;

public class Bremspedal extends Pedal {

	Auto auto;
	
	public Bremspedal(Auto auto) {
		this.auto = auto;
	}
	
	@Override
	void druecken() {
		this.auto.bremsen();

	}

}
