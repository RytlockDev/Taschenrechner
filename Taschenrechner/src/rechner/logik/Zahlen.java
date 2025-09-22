package rechner.logik;

public class Zahlen extends Berechnung {
	// =============================
	// Instanzeigenschaften
	// =============================
	 private double zahl1, zahl2, ergebniss = 0;
	 
	// =============================
	// Konstruktor
	// =============================
	/**
	 * Haupt konstruktor der 2 Zahlen setzt
	 * @param zahl1
	 * @param zahl2
	 */
	private Zahlen(double zahl1, double zahl2) {
		setZahl1(zahl1);
		setZahl2(zahl2);
	}
	
	// =============================
	// Fabrik Methode
	// =============================
	public void setZahlen(double zahl1, double zahl2) {
		// TODO Pruefung Ueberarbeiten
		if(true) {
			new Zahlen(zahl1, zahl2);
		}
	}
	
	// =============================
	// Setter / Getter
	// =============================
	public double getZahl1() {
		return zahl1;
	}
	
	public void setZahl1(double zahl1) {
		this.zahl1 = zahl1;
	}

	public double getZahl2() {
		return zahl2;
	}

	public void setZahl2(double zahl2) {
		this.zahl2 = zahl2;
	}

	public double getErgebniss() {
		return ergebniss;
	}

	public void setErgebniss(double ergebniss) {
		this.ergebniss = ergebniss;
	}
	
	
	
}
