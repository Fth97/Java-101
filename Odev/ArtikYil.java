package Odev;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		int girilenYil;
		
		System.out.println("Y�l Giriniz :");
		Scanner scanner=new Scanner(System.in);
		girilenYil=scanner.nextInt();
		
		if (((girilenYil % 4) == 0) && ((girilenYil % 100) != 0) || ((girilenYil % 400) == 0))
			System.out.println(girilenYil + " art�k y�ld�r");
			else
			System.out.println(girilenYil + " art�k y�l de�ildir.");
	}

}
