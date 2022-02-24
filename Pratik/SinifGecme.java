package Pratik;

import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		int matematik, fizik, turkce, kimya, muzik;
		double ortalama;
		double sayi = 0, tp = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Matematik Notu:");
		matematik = scanner.nextInt();
		if (0 <= matematik && matematik <= 100) {
			tp += matematik;
			sayi++;
		}
		System.out.println("Fizik Notu:");
		fizik = scanner.nextInt();
		if (0 <= fizik && fizik <= 100) {
			tp += fizik;
			sayi++;
		}
		System.out.println("Türkçe Notu:");
		turkce = scanner.nextInt();
		if (0 <= turkce && turkce <= 100) {
			tp += turkce;
			sayi++;
		}
		System.out.println("Kimya Notu:");
		kimya = scanner.nextInt();
		if (0 <= kimya && kimya <= 100) {
			tp += kimya;
			sayi++;
		}
		System.out.println("Müzik Notu:");
		muzik = scanner.nextInt();
		if (0 <= muzik && muzik <= 100) {
			tp += muzik;
			sayi++;
		}
		
		
		ortalama = tp / sayi;
		System.out.println("Ortalama:"+ortalama);
		if (ortalama > 55) {
			System.out.println("Geçti");
		} else {
			System.out.println("Kaldý");

		}
	}

}
