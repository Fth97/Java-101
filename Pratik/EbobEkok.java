package Pratik;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("n1 sayýsýný griiniz:");
		int n1 = scanner.nextInt();
		System.out.println("n2 sayýsýný griiniz:");
		int n2 = scanner.nextInt();

		int ebob = 0, ekok = 0;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
		}
		for (int k = 1; k <= (n1 * n2); k++) {
			if (k % n1 == 0 && k % n2 == 0) {
				ekok = k;
				break;
			}
		}
		System.out.println(ebob);

		System.out.println(ekok);

		int webob = 0, wekok = 0;
		int j = 1, n = 1;
		System.out.println("**** While ile ***** ");
		while (j <= n1) {
			if (n1 % j == 0 && n2 % j == 0) {
				webob = j;
			}
			j++;
		}
		while (n <= (n1 * n2)) {

			if (n % n1 == 0 && n % n2 == 0) {
				wekok = n;
				break;
			}
			n++;
		}
		System.out.println(webob);

		System.out.println(wekok);
	}

}
