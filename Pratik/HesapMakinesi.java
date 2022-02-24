package Pratik;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int sayi1, sayi2, secim;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ýlk Sayýyý Giriniz:");
		sayi1 = scanner.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz:");
		sayi2 = scanner.nextInt();

		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiniz :");
		secim = scanner.nextInt();

		if (secim == 1) {
			System.out.println("Toplam:" + (sayi1 + sayi2));
		} else if (secim == 2) {
			System.out.println("Çýkarma:" + (sayi1 - sayi2));
		} else if (secim == 3) {
			System.out.println("Çarpma:" + (sayi1 * sayi2));
		} else if (secim == 4) {
			if (sayi2 != 0)
				System.out.println("Bölme:" + (sayi1 / sayi2));
			else {
				System.out.println("Bir sayi 0'a bölünemez");
			}
		} else {
			System.out.println("Yanlýþ Seçim");
		}

		switch (secim) {
		case 1: {
			System.out.println("Toplam:" + (sayi1 + sayi2));
			break;
		}
		case 2: {
			System.out.println("Çýkarma:" + (sayi1 - sayi2));
			break;
		}
		case 3: {
			System.out.println("Çarpma:" + (sayi1 * sayi2));
			break;
		}
		case 4: {
			if (sayi2 != 0)
				System.out.println("Bölme:" + (sayi1 / sayi2));
			else {
				System.out.println("Bir sayi 0'a bölünemez");
			}
			break;
		}
		default:
			System.out.println("Yanlýþ Seçim");
		}
	}

}
