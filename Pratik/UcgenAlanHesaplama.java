package Pratik;

import java.util.Scanner;

public class UcgenAlanHesaplama {

	public static void main(String[] args) {

		int aKenar, bKenar, dKenar, eKenar, fKenar, cevre;
		double cKenar, alan;

		Scanner kenar = new Scanner(System.in);

		/*
		 * System.out.println("1.Dik Kenarý Giriniz:"); aKenar=kenar.nextInt();
		 * System.out.println("2.Dik Kenarý Giriniz:"); bKenar=kenar.nextInt();
		 * 
		 * cKenar=Math.sqrt((aKenar*aKenar)+(bKenar*bKenar));
		 * System.out.println("Hipotenüs Deðeri: " + cKenar);
		 */
		
		//Ödev kýsmý 
		
		System.out.println("1. Kenarý Giriniz:");
		dKenar = kenar.nextInt();
		System.out.println("2. Kenarý Giriniz:");
		eKenar = kenar.nextInt();
		System.out.println("3. Kenarý Giriniz:");
		fKenar = kenar.nextInt();

		cevre = (dKenar + eKenar + fKenar)/2 ;
		alan = Math.sqrt(cevre * (cevre - dKenar) * (cevre - eKenar) * (cevre - fKenar));
		
		System.out.println("Alan= " + alan);
	}

}
