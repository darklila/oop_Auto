package de.darklila.auto;

public class Gaspedal extends Pedal {
	
	Auto auto;
	
	/**
	 * @param auto
	 */
	public Gaspedal(Auto auto) {
		this.auto = auto;
	}



	@Override
	void druecken() {
		this.auto.setGeschwindigkeit(this.auto.getGeschwindigkeit()+1);
	}

}
