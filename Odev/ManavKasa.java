package Odev;

import java.util.Scanner;

public class ManavKasa {
	public static void main(String[] args) {
		double armut= 2.14,elma= 3.67,domates=1.11,muz=0.95,patl�can=5.00 ;
		double armutKilo,elmaKilo,domatesKilo,muzKilo,patl�canKilo,toplam ;
		
		
		Scanner kilo = new Scanner(System.in);
		System.out.println("Armut Ka� Kilo ?:");
		armutKilo=kilo.nextDouble();
		
		System.out.println("Elma  Ka� Kilo ?:");
		elmaKilo=kilo.nextDouble();

		System.out.println("Domates  Ka� Kilo ?:");
		domatesKilo=kilo.nextDouble();
		
		System.out.println("Muz Ka� Kilo ?:");
		muzKilo=kilo.nextDouble();
		
		System.out.println("Patl�can Ka� Kilo ?:");
		patl�canKilo=kilo.nextDouble();
		
		toplam=((armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patl�can*patl�canKilo));
		System.out.println("Toplam Tutar: " + toplam +" TL");
	}
}
