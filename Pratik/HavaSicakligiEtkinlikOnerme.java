package Pratik;

import java.util.Scanner;

public class HavaSicakligiEtkinlikOnerme {

	public static void main(String[] args) {

		int sicaklik;
		String sonuc;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Sýcaklýk deðerini giriniz : ");
		sicaklik = scanner.nextInt();
		/*
		 * if (sicaklik < 5) { System.out.println("Kayak yapabilirsiniz."); } else if
		 * (sicaklik < 15) { System.out.println("Sinemaya gidebilirsiniz."); } else if
		 * (sicaklik == 15) { System.out.println("Sinemaya gidebilirsiniz.");
		 * System.out.println("Pikniðe gidebilirsiniz."); } else if (sicaklik <= 25) {
		 * System.out.println("Pikniðe gidebilirsiniz."); } else {
		 * System.out.println("Yüzmeye gidebilirsiniz."); }
		 */

		boolean kosul1 = sicaklik < 5;
		boolean kosul2 = sicaklik >= 5 && sicaklik < 15;
		boolean kosul3 = sicaklik == 15;
		boolean kosul4 = (sicaklik > 15 && sicaklik <= 25);

		sonuc = kosul1 ? "Kayak yapabilirsiniz."
				: kosul2 ? "Sinemaya gidebilirsiniz."
						: kosul3 ? "Sinemaya gidebilirsiniz. " + "\nPikniðe gidebilirsiniz."
								: kosul4 ? "Pikniðe gidebilirsiniz." : "Yüzmeye gidebilirsiniz.";

		System.out.println(sonuc);

	}

}
