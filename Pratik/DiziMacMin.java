package Pratik;

import java.util.Arrays;
import java.util.Scanner;

public class DiziMacMin {

	public static void main(String[] args) {
		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

		int min = list[0];
		int max = list[0];

		for (int i : list) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}

		System.out.println("Minimum De�er " + min);
		System.out.println("Maximum De�er " + max);

		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen bir de�er giriniz: ");
		int sayi = scanner.nextInt();
		System.out.println(Arrays.toString(list));
		max = sayi;
		min = sayi;

		for (int i : list) {
			if (i > sayi) {
				if (sayi == max) {
					max = i;
				}
				if (i < max) {
					max = i;
				}
			}
			if (i < sayi) {
				if (sayi == min) {
					min = i;
				}
				if (i > min) {
					min = i;
				}
			}
		}
		System.out.println("Girilen say�dan k���k en yak�n say�: " + min);
		System.out.println("Girilen say�dan b�y�k en yak�n say�: " + max);

	}
}
