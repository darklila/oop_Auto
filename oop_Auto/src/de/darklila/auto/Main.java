package de.darklila.auto;


/**
 * @startuml
 * class Programm {
 * 	main(args:String[]) : void
 * }
 * 
 * class Auto {
 * 	geschwindigkeit : int
 * }
 * 
 * Programm - Auto
 * 
 * class Rad {
 * 	drehen : boolean
 * }
 * 
 * class Vorderrad {
 * 	richtung : int
 * }
 * 
 * Auto - "2" Vorderrad
 * Rad "2" <|-- Vorderrad 
 *  
 * class Lenkrad {
 * 	dreheRechts : void
 * 	dreheLinks : void
 * 	geradeaus() : void
 * }
 * 
 * Auto - "1" Lenkrad
 * 
 * abstract class Pedal {
 * Object[] elementData
 * size()
 * }
 * Pedal <|-- Bremspedal
 * Pedal <|-- Gaspedal
 * 
 * Auto - "1" Bremspedal
 * Auto - "1" Gaspedal
 * 

 * @enduml
 * @author Bettina Biendara
 *
 */
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
