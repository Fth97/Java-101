package Pratik;

import java.util.Scanner;

public class TaksimetreHesaplama {

	public static void main(String[] args) {
		double kmBasina = 2.20, acilis = 10, gidilenKm, toplam;
		
		Scanner km = new Scanner(System.in);
		System.out.println("Kaç km gidildi:");
		gidilenKm = km.nextDouble();
		toplam = acilis + (gidilenKm * kmBasina);
		boolean kosul = toplam > 20;
		System.out.println("Tutar: " + (kosul == true ? toplam + " Tl" : "20 TL"));

	}

}
