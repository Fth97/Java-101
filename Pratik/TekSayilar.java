package Pratik;

import java.util.Scanner;

public class TekSayilar {

	public static void main(String[] args) {
		int n,m;
		int tp = 0;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Sayý Giriniz:");
			n = scanner.nextInt();
			if (n % 2 == 1)
				tp += n;

		} while (n > 0);

		System.out.println("Toplam :" + tp);
		System.out.println("****** Çift ve 4'ün katlarý olan sayýlarý topla ***** ");
		tp=0;
		do {
			System.out.println("Sayý Giriniz:");
			m = scanner.nextInt();
			if (m % 2 == 0 && m % 4 == 0)
				tp += m;

		} while (m % 2 == 0 );

		System.out.println("Toplam :" + tp);
	}

}
