package Pratik;

import java.util.Scanner;

public class Faktöriyel  {

	public static void main(String[] args) {
		int sayi;
		int tp = 1;
		System.out.println("Sayý giriniz:");
		Scanner scanner=new Scanner(System.in);
		sayi=scanner.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			tp*=i;
		}
		System.out.println("Faktöriyel: "+tp);
		
		System.out.println("***** Kombinasyon *******");
		int n,r;
		int tpn=1,tpr=1,tpnr=1;
		
		System.out.println("Sayý giriniz:");
		n=scanner.nextInt();
		System.out.println("Sayý giriniz:");
		r=scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			tpn*=i;
		}
		for (int i = 1; i <= r; i++) {
			tpr*=i;
		}
		for (int i = 1; i <= (n-r); i++) {
			tpnr*=i;
		}
		System.out.println("Kombinasyon: "+tpn/(tpr*tpnr));
	}

}
