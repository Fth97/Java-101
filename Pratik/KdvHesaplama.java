package Pratik;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		double tutar, kdvOraný, kdvTutar, kdvliTutar;

		Scanner sayi = new Scanner(System.in);
		System.out.println("Tutar Giriniz:");
		tutar = sayi.nextDouble();

		boolean kosul = tutar >= 1000;
		kdvOraný = (kosul == true ? 0.08 : 0.18);

		kdvTutar = tutar * kdvOraný;
		kdvliTutar = tutar + kdvTutar;

		System.out.println("Kdv'siz Tutar:" + tutar);
		System.out.println("Kdv Oraný:" + kdvOraný);
		System.out.println("Kdv Tutar:" + kdvTutar);
		System.out.println("Kdv'li Tutar:" + kdvliTutar);

	}

}
