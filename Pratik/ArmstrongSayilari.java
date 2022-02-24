package Pratik;

import java.util.Scanner;

public class ArmstrongSayilari {

	public static void main(String[] args) {
		int sayi, n = 0, tmp, i = 0, basmak, tmpSayi;
		int tp = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		sayi = scanner.nextInt();
		tmp = sayi;
		tmpSayi = sayi;
		while (tmp != 0) {
			tmp = tmp / 10;
			n++;
		}

		while (sayi != 0) {
			basmak = sayi % 10;
			sayi /= 10;
			tp = (int) (tp + Math.pow(basmak, n));

		}
		if (tmpSayi == tp) {
			System.out.println(tmpSayi + " sayýsý bir Armstrong sayýdýr.");
		} else {
			System.out.println(tmpSayi + " sayýsý bir Armstrong sayýsý deðildir.");
		}
		
		System.out.println("***** Basamaklarýn Toplamý  ****");
		
		int bsmkTp=0;
		System.out.println("Sayi giriniz:");
		sayi=scanner.nextInt();
		tmp=sayi;
		tmpSayi=sayi;
		while (tmp!=0) {
			tmp=tmp/10;
			n++;
		}
		
		while (sayi!=0) {
			basmak=sayi%10;
			sayi/=10;
			bsmkTp+=basmak;
	}
		System.out.println("Basamaklarýn toplamý: "+bsmkTp);
	}
}
