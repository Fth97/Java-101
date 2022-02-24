package Pratik;

import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {
		final double pi = 3.14;
		int yaricap, yaricap2, merkezAci;

		Scanner r = new Scanner(System.in);
		System.out.println("Yarýçap :");
		yaricap = r.nextInt();

		System.out.println("Çevre : " + 2 * pi * yaricap);
		System.out.println("Alan : " + pi * yaricap * yaricap);

		System.out.println("---------Ödev---------------");

		System.out.println("Yarýçap :");
		yaricap2 = r.nextInt();

		System.out.println("Merkez Açý :");
		merkezAci = r.nextInt();

		System.out.println("Daire Diliminin Alaný: " + (pi * (yaricap2 * yaricap2) * merkezAci) / 360);

	}

}
