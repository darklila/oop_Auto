package de.darklila.auto;

public class Vorderrad extends Rad {
	private static final int LINKS=1;
	private static final int RECHTS=2;
	private static final int GERADEAUS=3;
	private int richtung;

	/**
	 * 
	 */
	public Vorderrad() {
		richtung=GERADEAUS;
	}

	/**
	 * @return the richtung
	 */
	public int getRichtung() {
		return richtung;
	}

	/**
	 * @param richtung the richtung to set
	 */
	public void setRichtung(int richtung) {
		this.richtung = richtung;
	}
	
	/**
	 * @return the links
	 */
	public int getLinks() {
		return LINKS;
	}

	/**
	 * @return the rechts
	 */
	public int getRechts() {
		return RECHTS;
	}

	/**
	 * @return the geradeaus
	 */
	public int getGeradeaus() {
		return GERADEAUS;
	}

	public void printRichtung() {
		switch (this.richtung){
		case LINKS:
			System.out.println("Richtung: links");
			break;
		case RECHTS:
			System.out.println("Richtung: rechts");
			break;
		case GERADEAUS:
			System.out.println("Richtung: geradeaus");
			break;

		}
	}
	
	
}
