package de.darklila.auto;

public class Bremspedal extends Pedal {

	Auto auto;
	
	public Bremspedal(Auto auto) {
		this.auto = auto;
	}
	
	@Override
	void druecken() {
		if (this.auto.getGeschwindigkeit() > 0) {
			this.auto.setGeschwindigkeit(this.auto.getGeschwindigkeit()-1);
		}

	}

}
