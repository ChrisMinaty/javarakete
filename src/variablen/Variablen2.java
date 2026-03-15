package variablen;

public class Variablen2 {

	static int a = 100;
	static int b = 200;
	static int b1 = 400;
	static int sec = 125;
	static float c = 1.24f;
	static double d = 19.22;
	static float x = 0.0f;
	static float speed = 0.3f;

	static double netto = 49.99;
	static double steuer = 0.19;

	public static void main(String[] args) {
		System.out.println("Addition:" + (a + b)); // Addition
		System.out.println();
		System.out.println(a - b); // Subtraktion
		System.out.println("---");
		System.out.println(a * b); // Multiplikation
		System.out.println(a / b); // Division (hier evtl. unerwünschtes Ergebnis, weil 0 rauskommt, ist aber
									// eigentlich 0,5)
		System.out.println(a % b); // Rest bleibt übrig
		System.out.println(b1 % b); // kein Rest
		System.out.println(sec / 60); // Division, hier bei zeitlichen Umrechnungen z.B. erwünscht, weil Ergebnis 2
		System.out.println(c); // Dezimalzahl -> binäre Gleitkommazahlen
		System.out.println(x += speed); // += kombinierter Zuweisungs‑ und Rechenoperator
		System.out.println(d);
		System.out.println(d);

		double brutto = netto * (1 + steuer);
		System.out.println("");
		System.out.println("Mini-Preisrechner");
		System.out.println("---");
		System.out.println(netto);
		System.out.println(netto * (1 + steuer)); // Berechnung muss nicht extra in eine Variable ausgelagert werden, es
													// sei denn man braucht sie noch an anderer Stelle

	}

}
