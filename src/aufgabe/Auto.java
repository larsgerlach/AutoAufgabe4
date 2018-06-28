package aufgabe;

public class Auto {

	public Auto() {
		anzahlRaeder = 4;
	}

	private int anzahlRaeder;
	private Motor motor = new Motor();
	private String automarke;

	public void starten() {
		motor.setAn(true);
	}

	public void ausschalten() {
		motor.setAn(false);
	}

	public int getRaeder() {
		return anzahlRaeder;
	}

	public boolean istMotorAn() {
		return motor.getAn();
	}

	public String getAutomarke() {
		return automarke;
	}

	public void setAutomarke(String automarke) {
		this.automarke = automarke;
	}
}
