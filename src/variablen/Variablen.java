package variablen;

public class Variablen {

	// Tutorial 001 - https://youtu.be/sWsrDb6rAck

	public static void main(String[] args) {
		int alter = 20;
		int minInt = -2_147_483_647;
		int maxInt = 2_147_483_647;
		double tageBisWochenende = 2.5;
		boolean wahrOderfalsch = true;
		String hallo = "HelloWorld";
		char c = 'a';
		System.out.println("Mein Alter ist " + alter + " und nicht " + maxInt + "."); // Konkatenierung
		System.out.println("MaxInt: " + maxInt);
		System.out.println(minInt);
		System.out.println(tageBisWochenende);
		System.out.println(wahrOderfalsch);
		System.out.println(hallo);
		System.out.println(c);

	}

}
