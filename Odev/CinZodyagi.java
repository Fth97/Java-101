package Odev;

import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		
		int dogumTarihi;
		String cinBurcu = null;
		
		System.out.println("Do�um Y�l�n�z� Giriniz :");
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
			cinBurcu=" K�pek";
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
			cinBurcu=" �k�z";
			break;
		}
		case 6: {
			cinBurcu=" Kaplan";
			break;
		}
		case 7: {
			cinBurcu=" Tav�an";
			break;
		}
		case 8: {
			cinBurcu=" Ejderha";
			break;
		}
		case 9: {
			cinBurcu=" Y�lan";
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
			System.out.println("Say� girmediniz.");
		}
		
		System.out.println("�in Zodya�� Burcunuz :"+cinBurcu);
	}

}
