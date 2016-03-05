package de.darklila.auto;

public class Main {

	public static void main(String[] args) {
		Auto meinAuto = new Auto("Blaui");
		meinAuto.beschleunigen();
		meinAuto.beschleunigen();
		meinAuto.fahreLinks();
		meinAuto.bremsen();
		meinAuto.printStatus();
	}

}
