package MayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row,column;
		
		System.out.println("May�n Tarlas�na Ho� geldiniz!");
		System.out.println("L�tfen oynamak istedi�iniz boyutlar� giriniz !");
		System.out.println("Sat�r Say�s�:");
		row=scan.nextInt();
		System.out.println("S�t�n Say�s�:");
		column=scan.nextInt();		

		Game game=new Game(row, column);
		game.run();
	}

}
