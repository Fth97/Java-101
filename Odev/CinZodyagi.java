package Odev;

import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		
		int dogumTarihi;
		String cinBurcu = null;
		
		System.out.println("Doðum Yýlýnýzý Giriniz :");
		Scanner scanner=new Scanner(System.in);
		dogumTarihi=scanner.nextInt();
		
		switch (dogumTarihi %12) {
		case 0: {
			cinBurcu=" Maymun";
			break;
		}
		case 1: {
			cinBurcu=" Horoz";
			break;
		}
		case 2: {
			cinBurcu=" Köpek";
			break;
		}
		case 3: {
			cinBurcu=" Domuz";
			break;
		}
		case 4: {
			cinBurcu=" Fare";
			break;
		}
		case 5: {
			cinBurcu=" Öküz";
			break;
		}
		case 6: {
			cinBurcu=" Kaplan";
			break;
		}
		case 7: {
			cinBurcu=" Tavþan";
			break;
		}
		case 8: {
			cinBurcu=" Ejderha";
			break;
		}
		case 9: {
			cinBurcu=" Yýlan";
			break;
		}
		case 10: {
			cinBurcu=" At";
			break;
		}
		case 11: {
			cinBurcu=" Koyun";
			break;
		}
		default:
			System.out.println("Sayý girmediniz.");
		}
		
		System.out.println("Çin Zodyaðý Burcunuz :"+cinBurcu);
	}

}
