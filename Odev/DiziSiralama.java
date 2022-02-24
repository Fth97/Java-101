package Odev;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Dizinin boyutu n:");
		int sayi=scanner.nextInt();
		int [] dizi=new int[sayi];
		System.out.println("Dizinin elemanlarýný giriniz :");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(i+1 +". Elemaný :");
			dizi[i]=scanner.nextInt();
		}
		Arrays.sort(dizi);
		
		System.out.println("Sýralama:" +Arrays.toString(dizi));
	}

}
