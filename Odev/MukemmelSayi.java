package Odev;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		int deger,tp = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir say� giriniz:");
		deger=scanner.nextInt();
		for (int i = 1; i < deger; i++) {
			if(deger%i==0)
				tp+=i;
		}
		if(tp==deger)
			System.out.println(deger+" M�kemmel say�d�r.");
		else
			System.out.println(deger+" M�kemmel say� de�ildir.");
	}

}
