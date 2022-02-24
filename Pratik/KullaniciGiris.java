package Pratik;

import java.util.Scanner;

public class KullaniciGiris {

	public static void main(String[] args) {
		String userName, password, kosul, newPassword;
		boolean kosul2;
		String user="Patika";
		String pass="Patika";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kullanýcý Adýný Giriniz:");
		userName = scanner.nextLine();

		System.out.println("Þifre Giriniz:");
		password = scanner.nextLine();

		if (userName.equals("user") && password.equals("pass")) {
			System.out.println("Giriþ Baþarýlý");
		} else {
			System.out.println("Giriþ Baþarýsýz");

			// Eðer þifre yanlýþ ise kullanýcýya þifresini sýfýrlayýp sýfýrlamayacaðýný
			// sorun,
			// eðer kullanýcý sýfýrlamak isterse yeni girdiði þifrenin hatalý girdiði ve
			// unuttuðu þifre ile ayný olmamasý gerektiðini kontrol edip ,
			// þifreler ayný ise ekrana "Þifre oluþturulamadý, lütfen baþka þifre giriniz."
			// sorun yoksa "Þifre oluþturuldu" yazan programý yazýnýz.

			System.out.println("Þifreniz yanlýþ !!! Þifre bilginizi sýfýrlamak ister misiniz:E-H");
			kosul = scanner.nextLine();
			if (kosul.equals("E")) {
				System.out.println("Yeni Sifre:");
				newPassword = scanner.nextLine();
				System.out.println(newPassword.equals(pass)|| newPassword.equals(password)  ? "Þifre oluþturulamadý, lütfen baþka þifre giriniz." : "Þifre Oluþturuldu.");

			}
			else if(kosul.equals("H")) {
				System.out.println("Þifreniz yanlýþ !!! Þifre bilginiz sýfýrlanmayacak.");
			}
			else
				System.out.println("Yanlýþ Seçim ");

		}
	}

}
