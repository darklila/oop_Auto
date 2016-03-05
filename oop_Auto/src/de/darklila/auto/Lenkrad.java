package de.darklila.auto;

public class Lenkrad {
	Auto auto;
	
	public Lenkrad ( Auto auto) {
		this.auto=auto;
	}
	

	public void dreheLinks() {
		int richtung=this.auto.getVorderradLinks().getLinks();
		this.auto.getVorderradLinks().setRichtung(richtung);
		this.auto.getVorderradRechts().setRichtung(richtung);
	}

	public void dreheRechts() {
		int richtung=this.auto.getVorderradLinks().getRechts();
		this.auto.getVorderradLinks().setRichtung(richtung);
		this.auto.getVorderradRechts().setRichtung(richtung);
		
	}

	public void dreheGeradeaus() {
		int richtung=this.auto.getVorderradLinks().getGeradeaus();
		this.auto.getVorderradLinks().setRichtung(richtung);
		this.auto.getVorderradRechts().setRichtung(richtung);
	}
	
	

}
