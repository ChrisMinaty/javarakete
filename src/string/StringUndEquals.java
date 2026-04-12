package string;

import java.util.Scanner;

public class StringUndEquals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = "admin";
		String input = scanner.nextLine();

		// Achtung!
		// username → "admin" (Objekt A)
		// input → "admin" (Objekt B)

		if (input == username) {
			System.out.println("Login erfolgreich!");
		} else {
			System.out.println("Falscher Benutzername!");
		}

		if (input.equals(username)) { // equals() schaut in den String und vergleicht Zeichen für Zeichen.
			System.out.println("Login erfolgreich!");
		} else {
			System.out.println("Falscher Benutzername!");
		}
		if (input.equalsIgnoreCase(username)) { // equalsIgnoreCase ist nicht case-sensitiv: nimmt etwa auch "Admin"
			System.out.println("Login erfolgreich!");
		} else {
			System.out.println("Falscher Benutzername!");
		}

		int a = 1;
		int b = 2;

		System.out.println("a hat den gleichen Wert wie b: " + (a == b));

	}

}
