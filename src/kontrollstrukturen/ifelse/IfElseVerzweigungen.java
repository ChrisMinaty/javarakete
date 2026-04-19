
package kontrollstrukturen.ifelse;

import java.util.Scanner;

public class IfElseVerzweigungen {

	public static void main(String[] args) {
		int alter = 18;

		if (alter < 0) {
			System.out.println("Ungültige Eingabe.");
		} else if (alter < 18) {
			System.out.println("Du bist minderjährig.");
		} else if (alter < 67) {
			System.out.println("Du bist erwachsen.");
		} else {
			System.out.println("Du bist im Rentenalter.");
		}

		if (alter == 18) {
			System.out.println("Du bist volljährig.");
		}

		// mehrere Bedingungen kombinieren
		if ((alter >= 18) && (alter <= 67)) {
			System.out.println("Du bist im erwerbstätigen Alter.");
		}

		if (alter < 18 || alter > 67) {
			System.out.println("Du bekommst Rabatt!");
		} else {
			System.out.println("Kein Rabatt.");
		}

		// mit Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Wie alt bist du? ");
		alter = sc.nextInt();

		if (alter < 6 || alter > 70) {
			System.out.println("Du bekommst ein kostenloses Ticket!");
		} else {
			System.out.println("Normales Ticket.");
		}

	}

}
