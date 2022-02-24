package Odev;

import java.util.Scanner;

public class RecursiveAsal {
	
	static int asal(int sayi,int i) {
		if(sayi<2)
			return 0;
		if(i==1)
			return 1;
		if(sayi%i==0)
			return 0;
		
		return asal(sayi,i-1);
	}
	
	public static void main(String[] args) {
		int sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi giriniz :");
		sayi = scan.nextInt();
		asal(sayi,sayi/2);
		if(asal(sayi,sayi/2)==1)
			System.out.println(sayi+" sayýsý ASALDIR !");
		else 
			System.out.println ( sayi+" sayýsý ASAL deðildir !");
	}

}
