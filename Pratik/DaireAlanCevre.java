package Pratik;

import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {
		final double pi = 3.14;
		int yaricap, yaricap2, merkezAci;

		Scanner r = new Scanner(System.in);
		System.out.println("Yar��ap :");
		yaricap = r.nextInt();

		System.out.println("�evre : " + 2 * pi * yaricap);
		System.out.println("Alan : " + pi * yaricap * yaricap);

		System.out.println("---------�dev---------------");

		System.out.println("Yar��ap :");
		yaricap2 = r.nextInt();

		System.out.println("Merkez A�� :");
		merkezAci = r.nextInt();

		System.out.println("Daire Diliminin Alan�: " + (pi * (yaricap2 * yaricap2) * merkezAci) / 360);

	}

}
