package Odev;

import java.util.Scanner;

public class RecursiveUs {

	static int us(int sayi,int us) {
		if(us==0)
			return 1;
		return sayi*us(sayi,us-1);
	}
	
	public static void main(String[] args) {
		int sayi,us;
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban giriniz :");
		sayi = scan.nextInt();
		
		System.out.print("Üs giriniz: ");
		us=scan.nextInt();
		
		System.out.println("Sonuc:"+us(sayi,us));
	}

}
