package Pratik;

import java.util.Scanner;

public class OrtalamaHesaplama {

	public static void main(String[] args) {
		// Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik

		int mat, fizik, kimya, turkce, tarih, muzik;

		Scanner inp = new Scanner(System.in);

		System.out.print("Matematik notu :");
		mat = inp.nextInt();

		System.out.print("Fizik notu :");
		fizik = inp.nextInt();

		System.out.print("Kimya notu :");
		kimya = inp.nextInt();

		System.out.print("T�rk�e notu :");
		turkce = inp.nextInt();

		System.out.print("Tarih notu :");
		tarih = inp.nextInt();

		System.out.print("M�zik notu :");
		muzik = inp.nextInt();

		int toplam = mat + fizik + kimya + turkce + tarih + muzik;
		double sonuc = toplam / 6.0;
		System.out.println("Ortlama: " + sonuc);

		boolean kosul = sonuc >= 50;
		System.out.println("Durum = " + (kosul == true ? "Ge�ti" : "Kald�"));

	}

}
