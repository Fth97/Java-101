package Odev;

import java.util.Scanner;

public class ManavKasa {
	public static void main(String[] args) {
		double armut= 2.14,elma= 3.67,domates=1.11,muz=0.95,patlýcan=5.00 ;
		double armutKilo,elmaKilo,domatesKilo,muzKilo,patlýcanKilo,toplam ;
		
		
		Scanner kilo = new Scanner(System.in);
		System.out.println("Armut Kaç Kilo ?:");
		armutKilo=kilo.nextDouble();
		
		System.out.println("Elma  Kaç Kilo ?:");
		elmaKilo=kilo.nextDouble();

		System.out.println("Domates  Kaç Kilo ?:");
		domatesKilo=kilo.nextDouble();
		
		System.out.println("Muz Kaç Kilo ?:");
		muzKilo=kilo.nextDouble();
		
		System.out.println("Patlýcan Kaç Kilo ?:");
		patlýcanKilo=kilo.nextDouble();
		
		toplam=((armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlýcan*patlýcanKilo));
		System.out.println("Toplam Tutar: " + toplam +" TL");
	}
}
