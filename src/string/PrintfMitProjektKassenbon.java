package string;

public class PrintfMitProjektKassenbon {

	public static void main(String[] args) {
//		System.out.println("Apfel 1.2");
//		System.out.println("Banane 0.8");
//		System.out.println("Summe 2.0");

		String a1 = "Apfel";
		double p1 = 1.20;

		String a2 = "Banane";
		double p2 = 0.80;

		String a3 = "Teurer Kaffee";
		double p3 = 13.50;

		System.out.printf("%-15s %5.2f €\n", a1, p1);
		System.out.printf("%-15s %5.2f €\n", a2, p2);
		System.out.printf("%-15s %5.2f €\n", a3, p3);
		System.out.println("-----------------------");

		double summe = p1 + p2 + p3;
		System.out.printf("%-15s %5.2f €\n", "Summe", summe);

		System.out.println();
		System.out.println();
		System.out.println("Variante 2:");
		System.out.println();

		System.out.printf("%-15s %s %6.2f €%n", a1, "........", p1);
		System.out.printf("%-15s %s %6.2f €%n", a2, "........", p2);
		System.out.printf("%-15s %s %6.2f €%n", a3, "........", p3);
		System.out.println("--------------------------------");
		System.out.printf("%-15s %s %6.2f €%n", "Summe", "........", summe);

		System.out.println();
		System.out.println();
		System.out.println("Variante 3:");
		System.out.println();

		printItem(a1, p1);
		printItem(a2, p2);
		printItem(a3, p3);

	}

	public static void printItem(String name, double price) {
		int totalWidth = 20; // Gesamtbreite bis zum Preis
		int dotsCount = totalWidth - name.length();

		String dots = ".".repeat(Math.max(0, dotsCount));

		System.out.printf("%s%s%6.2f €%n", name, dots, price);
	}

}
