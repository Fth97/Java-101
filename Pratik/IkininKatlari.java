package Pratik;

import java.util.Scanner;

public class IkininKatlari {

	public static void main(String[] args) {


		int sayi = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayi Giriniz:");
		sayi= scanner.nextInt();
		for (int i = 1; i <= sayi; i=i*2) {
			System.out.println(i);
		}
		System.out.println("4 ün kuvvetleri ");
		for (int i = 1; i <= sayi; i=i*4) {
			System.out.println(i);
		}
		System.out.println("5 in kuvvetleri ");
		for (int i = 1; i <= sayi; i=i*5) {
			System.out.println(i);
		}
	}

}
