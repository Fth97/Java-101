package Odev;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int sayi,deger;
		int eb=0,ek=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ka� tane say� gireceksiniz: ");
		sayi=scanner.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			System.out.println(i+1 +". say�y� gireceksiniz: ");
			deger=scanner.nextInt();
			if(deger>eb)
				eb=deger;
			if(deger<ek)
				ek=deger;
		}
		System.out.println("En b�y�k say�:"+eb);
		System.out.println("En k���k  say�:"+ek);
	}

}
