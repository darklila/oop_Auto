package de.darklila.auto;

import com.sun.javafx.scene.text.HitInfo;

public class Auto {
	private String name;
	private int geschwindigkeit;
	private Gaspedal gaspedal;
	private Bremspedal bremspedal;
	private Lenkrad lenkrad;
	private Vorderrad vorderradLinks;
	private Vorderrad vorderradRechts;
	private Rad hinterradLinks;
	private Rad hinterradRechts;

	public Auto(String name) {
		this.name=name;
		this.geschwindigkeit=0;
		
		this.lenkrad = new Lenkrad();
		
		this.bremspedal=new Bremspedal(this);
		this.gaspedal=new Gaspedal();
		
		this.vorderradLinks=new Vorderrad();
		this.vorderradRechts=new Vorderrad();
		this.hinterradLinks=new Rad();
		this.hinterradRechts=new Rad();	
	}
	
	public void printStatus() {
		System.out.println("Name: " + this.name);
		System.out.println("Geschwindigkeit: " + this.geschwindigkeit);
		this.vorderradLinks.printRichtung();
	}
	
	public void bremsen() {
		this.bremspedal.druecken();
		if (this.geschwindigkeit >0) {
			this.geschwindigkeit--;
			if (this.geschwindigkeit==0) {
				vorderradLinks.setDrehen(false);
				vorderradRechts.setDrehen(false);
				hinterradLinks.setDrehen(false);
				hinterradRechts.setDrehen(false);
			}
		}
	}
	
	public void beschleunigen() {
		this.gaspedal.druecken();
		this.geschwindigkeit++;
		if (this.geschwindigkeit==0) {
			vorderradLinks.setDrehen(true);
			vorderradRechts.setDrehen(true);
			hinterradLinks.setDrehen(true);
			hinterradRechts.setDrehen(true);
		}
	}
	
	public void fahreLinks() {
		this.lenkrad.dreheLinks(this.vorderradLinks, this.vorderradRechts);
	}
	
	public void fahreRechts() {
		this.lenkrad.dreheRechts(this.vorderradLinks, this.vorderradRechts);
	}
	
	public void fahreGeradeaus() {
		this.lenkrad.dreheGeradeaus(this.vorderradLinks, this.vorderradRechts);
	}
	/**
	 * @return the bremspedal
	 */
	public Bremspedal getBremspedal() {
		return bremspedal;
	}

}
