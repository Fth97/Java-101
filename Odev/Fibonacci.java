package Odev;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3, i, sayi;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz :");
		sayi = scanner.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);

		for (i = 2; i <= sayi; ++i)
		{
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
