package Odev;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		double boy,kilo;
		
		Scanner deger=new Scanner(System.in);
		System.out.println("Boy:");
		boy=deger.nextDouble();
		System.out.println("Kilo:");
		kilo=deger.nextDouble();
		
		System.out.println("Vücut Kitle endeks:"+ kilo/Math.pow(boy, 2));

	}

}
