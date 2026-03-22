package variablen;

import java.util.Scanner;

public class Variablen3MitBmiRechner {

	// Tutorial 004 - https://youtu.be/6OAvS-XnQc8/

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte gib dein Gewicht in kg ein: ");
		double gewicht = scanner.nextDouble();

		System.out.println("Bitte gib deine Größe in m ein: ");
		double groesse = scanner.nextDouble();

		double bmi = gewicht / (groesse * groesse);

		System.out.println("");

		System.out.println("Der BMI beträgt: " + bmi); // Ausgabe mit Kommazahl (double)

		long bmiGerundet = (long) bmi; // expliziter Cast bewirkt Trunkierung, was aber für den BMI völlig ok ist

		System.out.println("Der BMI (gerundet) beträgt: " + bmiGerundet); // Ausgabe mit gerundeter Dezimalzahl (long)
	}

}
