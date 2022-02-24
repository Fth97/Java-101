package Pratik;

import java.util.Scanner;

public class SayiBuyuktenKucuge {

	public static void main(String[] args) {

		int sayi1, sayi2, sayi3;
		Scanner input = new Scanner(System.in);

		System.out.print("1. Sayý : ");
		sayi1 = input.nextInt();

		System.out.print("2. Sayý : ");
		sayi2 = input.nextInt();

		System.out.print("3. Sayý : ");
		sayi3 = input.nextInt();

		System.out.println("***BÜYÜKTEN KÜÇÜÐE SIRALAMA***");

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

		System.out.println("***KÜÇÜKTEN BÜYÜÐE SIRALAMA***");

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
