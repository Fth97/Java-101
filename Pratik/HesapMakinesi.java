package Pratik;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int sayi1, sayi2, secim;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�lk Say�y� Giriniz:");
		sayi1 = scanner.nextInt();
		System.out.println("�kinci Say�y� Giriniz:");
		sayi2 = scanner.nextInt();

		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.println("Se�iniz :");
		secim = scanner.nextInt();

		if (secim == 1) {
			System.out.println("Toplam:" + (sayi1 + sayi2));
		} else if (secim == 2) {
			System.out.println("��karma:" + (sayi1 - sayi2));
		} else if (secim == 3) {
			System.out.println("�arpma:" + (sayi1 * sayi2));
		} else if (secim == 4) {
			if (sayi2 != 0)
				System.out.println("B�lme:" + (sayi1 / sayi2));
			else {
				System.out.println("Bir sayi 0'a b�l�nemez");
			}
		} else {
			System.out.println("Yanl�� Se�im");
		}

		switch (secim) {
		case 1: {
			System.out.println("Toplam:" + (sayi1 + sayi2));
			break;
		}
		case 2: {
			System.out.println("��karma:" + (sayi1 - sayi2));
			break;
		}
		case 3: {
			System.out.println("�arpma:" + (sayi1 * sayi2));
			break;
		}
		case 4: {
			if (sayi2 != 0)
				System.out.println("B�lme:" + (sayi1 / sayi2));
			else {
				System.out.println("Bir sayi 0'a b�l�nemez");
			}
			break;
		}
		default:
			System.out.println("Yanl�� Se�im");
		}
	}

}
