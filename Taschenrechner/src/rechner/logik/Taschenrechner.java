package rechner.logik;

public class Taschenrechner {
	// =============================
	// Instanzeigenschaften
	// =============================
	 private double zahl1, zahl2, zahl3, zahl4;		
	
	// =============================
	// Setter / Getter
	// =============================
	public double getZahl1() {
		return zahl1;
	}

	/**
	 * Haupt konstruktor mit alle 4 Zahlen
	 * @param zahl1
	 * @param zahl2
	 * @param zahl3
	 * @param zahl4
	 */
	private Taschenrechner(double zahl1, double zahl2, double zahl3, double zahl4) {
		setZahl1(zahl1);
		setZahl2(zahl2);
		setZahl3(zahl3);
		setZahl4(zahl4);
	}
	
	// =============================
	// Konstruktoren
	// =============================
	public void setZahl1(double zahl1) {
		this.zahl1 = zahl1;
	}

	public double getZahl2() {
		return zahl2;
	}

	public void setZahl2(double zahl2) {
		this.zahl2 = zahl2;
	}

	public double getZahl3() {
		return zahl3;
	}

	public void setZahl3(double zahl3) {
		this.zahl3 = zahl3;
	}

	public double getZahl4() {
		return zahl4;
	}

	public void setZahl4(double zahl4) {
		this.zahl4 = zahl4;
	}
}
