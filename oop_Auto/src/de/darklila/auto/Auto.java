package de.darklila.auto;

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
		
		this.lenkrad = new Lenkrad(this);
		
		this.bremspedal=new Bremspedal(this);
		this.gaspedal=new Gaspedal(this);
		
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
	}
	
	public void beschleunigen() {
		this.gaspedal.druecken();
	}
	
	
	/**
	 * @return the geschwindigkeit
	 */
	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	/**
	 * @param geschwindigkeit the geschwindigkeit to set
	 */
	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
		if (this.geschwindigkeit<=0) {
			anhalten();
		} else {
			fahren();
		}
	}

	public void anhalten() {
		this.vorderradLinks.setDrehen(false);
		this.vorderradRechts.setDrehen(false);
		this.hinterradLinks.setDrehen(false);
		this.hinterradRechts.setDrehen(false);	
	}
	
	public void fahren() {
		this.vorderradLinks.setDrehen(true);
		this.vorderradRechts.setDrehen(true);
		this.hinterradLinks.setDrehen(true);
		this.hinterradRechts.setDrehen(true);	
	}
	
	public void fahreLinks() {
		this.lenkrad.dreheLinks();
	}
	
	public void fahreRechts() {
		this.lenkrad.dreheRechts();
	}
	
	public void fahreGeradeaus() {
		this.lenkrad.dreheGeradeaus();
	}
	/**
	 * @return the bremspedal
	 */
	public Bremspedal getBremspedal() {
		return bremspedal;
	}

	/**
	 * @return the gaspedal
	 */
	public Gaspedal getGaspedal() {
		return gaspedal;
	}

	/**
	 * @return the vorderradLinks
	 */
	public Vorderrad getVorderradLinks() {
		return vorderradLinks;
	}

	/**
	 * @return the vorderradRechts
	 */
	public Vorderrad getVorderradRechts() {
		return vorderradRechts;
	}

}
