package Odev;

import java.util.Scanner;

public class RecursiveDesen {

	static int ekleC�kar(int sayi, int i, boolean kontrol) {

		System.out.println(i);
		if (i > 0 && kontrol == true) {
			return ekleC�kar(sayi, i - 5, true);
		} else if (i <= 0 && kontrol == true && i<sayi) {
			ekleC�kar(sayi, i + 5, false);
		} else if (i > 0 && kontrol == false && i<sayi) {
			return ekleC�kar(sayi, i + 5, false);
		} else {
			return 0;
		}
		return 0;
	}

	public static void main(String[] args) {
		int sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi giriniz :");
		sayi = scan.nextInt();
		ekleC�kar(sayi, sayi, true);
	}

}
