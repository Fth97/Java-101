package Pratik;

import java.util.Scanner;

public class SayiBuyuktenKucuge {

	public static void main(String[] args) {

		int sayi1, sayi2, sayi3;
		Scanner input = new Scanner(System.in);

		System.out.print("1. Say� : ");
		sayi1 = input.nextInt();

		System.out.print("2. Say� : ");
		sayi2 = input.nextInt();

		System.out.print("3. Say� : ");
		sayi3 = input.nextInt();

		System.out.println("***B�Y�KTEN K����E SIRALAMA***");

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			if (sayi2 > sayi3) {
				System.out.println(sayi1 + ">" + sayi2 + ">" + sayi3);
			} else {
				System.out.println(sayi1 + ">" + sayi3 + ">" + sayi2);
			}
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			if (sayi1 > sayi3) {
				System.out.println(sayi2 + ">" + sayi1 + ">" + sayi3);
			} else {
				System.out.println(sayi2 + ">" + sayi3 + ">" + sayi1);
			}
		} else {
			if (sayi1 > sayi2) {
				System.out.println(sayi3 + ">" + sayi1 + ">" + sayi2);
			} else {
				System.out.println(sayi3 + ">" + sayi2 + ">" + sayi1);
			}
		}

		System.out.println("***K���KTEN B�Y��E SIRALAMA***");

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			if (sayi2 > sayi3) {
				System.out.println(sayi1 + "<" + sayi2 + "<" + sayi3);
			} else {
				System.out.println(sayi1 + "<" + sayi3 + "<" + sayi2);
			}
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			if (sayi1 > sayi3) {
				System.out.println(sayi2 + "<" + sayi1 + "<" + sayi3);
			} else {
				System.out.println(sayi2 + "<" + sayi3 + "<" + sayi1);
			}
		} else {
			if (sayi1 > sayi2) {
				System.out.println(sayi3 + "<" + sayi1 + "<" + sayi2);
			} else {
				System.out.println(sayi3 + "<" + sayi2 + "<" + sayi1);
			}
		}
	}

}
