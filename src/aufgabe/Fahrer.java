package aufgabe;

public class Fahrer {
	public static void main(String[] args) {

		Auto auto1 = new Auto("Mercedes");

		System.out.println(auto1.getRaeder());

		auto1.starten();
		System.out.println(auto1.istMotorAn());
		auto1.ausschalten();
		System.out.println(auto1.istMotorAn());

		System.out.println(auto1.getAutomarke());
	}
}
