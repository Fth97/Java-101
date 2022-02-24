package Pratik;

import java.util.Scanner;

public class UsluSayilar {

	public static void main(String[] args) {
		int ussu, us, tp = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Üssü Giriniz: ");
		ussu = scanner.nextInt();

		System.out.println("Üs Giriniz: ");
		us = scanner.nextInt();
		int i = 1;

		while (i <= us) {
			tp *= ussu;
			i++;
		}

		System.out.println("Cevap:" + tp);

		tp = 1;
		System.out.println("******For ile ******");
		for (i = 1; i <= us; i++) {
			tp *= ussu;
		}
		System.out.println("Cevap:" + tp);
	}

}