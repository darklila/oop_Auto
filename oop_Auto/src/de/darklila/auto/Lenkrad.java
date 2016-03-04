package de.darklila.auto;

public class Lenkrad {

	public void dreheLinks(Vorderrad vorderradLinks, Vorderrad vorderradRechts) {
		vorderradLinks.setRichtung(vorderradLinks.getLinks());
		vorderradRechts.setRichtung(vorderradLinks.getLinks());
	}

	public void dreheRechts(Vorderrad vorderradLinks, Vorderrad vorderradRechts) {
		vorderradLinks.setRichtung(vorderradLinks.getRechts());
		vorderradRechts.setRichtung(vorderradLinks.getRechts());
		
	}

	public void dreheGeradeaus(Vorderrad vorderradLinks, Vorderrad vorderradRechts) {
		vorderradLinks.setRichtung(vorderradLinks.getGeradeaus());
		vorderradRechts.setRichtung(vorderradLinks.getGeradeaus());
		
	}
	
	

}
