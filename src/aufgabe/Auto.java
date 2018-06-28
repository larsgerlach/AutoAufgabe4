package aufgabe;

public class Auto {

	private int anzahlRaeder;
	private Motor motor = new Motor();
	private String automarke;

	public Auto(String automarke) {
		this.anzahlRaeder = 4;
		this.setAutomarke(automarke);
	}

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
