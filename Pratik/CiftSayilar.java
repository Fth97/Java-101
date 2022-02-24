package Pratik;

import java.util.Scanner;

public class CiftSayilar {

	public static void main(String[] args) {
		int sayi, tp = 0, adet = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi Giriniz:");
		sayi = scanner.nextInt();

		for (int i = 0; i <= sayi; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

		System.out.println("3 ve 4'e tam bölünen sayýlarýn ortalamasý");

		for (int i = 0; i <= sayi; i++) {
			if (i % 12 == 0) {
				tp += i;
				adet++;
			}
		}
		System.out.println("3 ve 4'e tam bölünen sayýlarýn ortalamasý: " + tp / (adet-1));

	}

}
