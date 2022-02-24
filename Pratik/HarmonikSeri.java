package Pratik;

import java.util.Scanner;

public class HarmonikSeri {

	public static void main(String[] args) {

		int sayi;
		double tp = 0.0;
		System.out.println("Sayi giriniz:");
		Scanner scanner= new Scanner(System.in);
		sayi=scanner.nextInt();
		
		for(double i=1;i<=sayi;i++) {
			tp+=1/i;
			System.out.println(1/i);
		}
		System.out.println(tp);
	}

}
