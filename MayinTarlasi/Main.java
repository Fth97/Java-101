package MayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row,column;
		
		System.out.println("Mayýn Tarlasýna Hoþ geldiniz!");
		System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz !");
		System.out.println("Satýr Sayýsý:");
		row=scan.nextInt();
		System.out.println("Sütün Sayýsý:");
		column=scan.nextInt();		

		Game game=new Game(row, column);
		game.run();
	}

}
