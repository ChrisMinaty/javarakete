package scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		// Tutorial 005 - Scanner und InputMismatchException -
		// https://youtu.be/QIRcf0gC2XQ

		// Hier kann Exception fliegen, da keine Validierung
		Scanner scanner = new Scanner((System.in));
		System.out.println("Bitte Zahl eingeben: ");
		int zahl = scanner.nextInt();
		System.out.println("Zahl: " + zahl);

		// Fix: hasNextInt als Sicherheitscheck für int (mit Validierung)
		System.out.println("Fix 1");
		System.out.print("Gib eine Zahl ein: ");
		if (scanner.hasNextInt()) {
			int zahl2 = scanner.nextInt();
			System.out.println("Erfolg! Das ist eine Zahl: " + zahl2);
		} else {
			System.out.println("Falsch");
			String text = scanner.next();
			System.out.println("Bitte nur eine gültige Zahl eingeben. " + text + " ist Text!");
		}

		// Fix 2: hasNextInt als Sicherheitscheck für String (mit Validierung)
		System.out.println("Fix 2");
		System.out.print("Gib Text ein: ");
		if (scanner.hasNextInt()) {
			System.out.println("Das ist KEIN Text, sondern eine Zahl!");
		} else {
			String text = scanner.next();
			System.out.println("Erfolg! Du hast Text eingegeben: " + text);
		}

	}

}
