package Pratik;

import java.util.Scanner;

public class KullaniciGiris {

	public static void main(String[] args) {
		String userName, password, kosul, newPassword;
		boolean kosul2;
		String user="Patika";
		String pass="Patika";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kullan�c� Ad�n� Giriniz:");
		userName = scanner.nextLine();

		System.out.println("�ifre Giriniz:");
		password = scanner.nextLine();

		if (userName.equals("user") && password.equals("pass")) {
			System.out.println("Giri� Ba�ar�l�");
		} else {
			System.out.println("Giri� Ba�ar�s�z");

			// E�er �ifre yanl�� ise kullan�c�ya �ifresini s�f�rlay�p s�f�rlamayaca��n�
			// sorun,
			// e�er kullan�c� s�f�rlamak isterse yeni girdi�i �ifrenin hatal� girdi�i ve
			// unuttu�u �ifre ile ayn� olmamas� gerekti�ini kontrol edip ,
			// �ifreler ayn� ise ekrana "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz."
			// sorun yoksa "�ifre olu�turuldu" yazan program� yaz�n�z.

			System.out.println("�ifreniz yanl�� !!! �ifre bilginizi s�f�rlamak ister misiniz:E-H");
			kosul = scanner.nextLine();
			if (kosul.equals("E")) {
				System.out.println("Yeni Sifre:");
				newPassword = scanner.nextLine();
				System.out.println(newPassword.equals(pass)|| newPassword.equals(password)  ? "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz." : "�ifre Olu�turuldu.");

			}
			else if(kosul.equals("H")) {
				System.out.println("�ifreniz yanl�� !!! �ifre bilginiz s�f�rlanmayacak.");
			}
			else
				System.out.println("Yanl�� Se�im ");

		}
	}

}
