package Pratik;

import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {
		int ay, gun;
		Scanner input = new Scanner(System.in);

		System.out.print("Do�dunuz Ay : ");
		ay = input.nextInt();

		System.out.print("Do�dunuz G�n : ");
		gun = input.nextInt();

		System.out.print("*** SWITCH-CASE �LE ��Z�M *** \n");

		switch (ay) {
		case 1:
			if (gun >= 22) {
				System.out.println("Kova Burcu");
			} else {
				System.out.println("O�lak Burcu");
			}
			break;

		case 2:
			if (gun >= 20) {
				System.out.println("Bal�k Burcu");
			} else {
				System.out.println("Kova Burcu");
			}
			break;

		case 3:
			if (gun >= 21) {
				System.out.println("Ko� Burcu");
			} else {
				System.out.println("Bal�k Burcu");
			}
			break;

		case 4:
			if (gun >= 21) {
				System.out.println("Bo�a Burcu");
			} else {
				System.out.println("Ko� Burcu");
			}
			break;

		case 5:
			if (gun >= 22) {
				System.out.println("�kizler Burcu");
			} else {
				System.out.println("Bo�a Burcu");
			}
			break;

		case 6:
			if (gun >= 23) {
				System.out.println("Yenge� Burcu");
			} else {
				System.out.println("�kizler Burcu");
			}
			break;

		case 7:
			if (gun >= 23) {
				System.out.println("Aslan Burcu");
			} else {
				System.out.println("Yenge� Burcu");
			}
			break;

		case 8:
			if (gun >= 23) {
				System.out.println("Ba�ak Burcu");
			} else {
				System.out.println("Aslan Burcu");
			}
			break;

		case 9:
			if (gun >= 23) {
				System.out.println("Terazi Burcu");
			} else {
				System.out.println("Ba�ak Burcu");
			}
			break;

		case 10:
			if (gun >= 23) {
				System.out.println("Akrep Burcu");
			} else {
				System.out.println("Terazi Burcu");
			}
			break;

		case 11:
			if (gun >= 22) {
				System.out.println("Yay Burcu");
			} else {
				System.out.println("Akrep Burcu");
			}
			break;

		case 12:
			if (gun >= 22) {
				System.out.println("O�lak Burcu");
			} else {
				System.out.println("Yay Burcu");
			}
			break;

		default:
			System.out.println("L�tfen ay i�in 1-12 aras�nda bir say� giriniz. G�n i�in takvimden yard�m al�n. :)");
		}

		System.out.print("*** IF �LE ��Z�M *** \n");


		if (ay == 1 && gun >= 22) {
			System.out.println("Kova Burcu");
		} else if (ay == 1) {
			System.out.println("O�lak Burcu");
		}

		if (ay == 2 && gun >= 20) {
			System.out.println("Bal�k Burcu");
		} else if (ay == 2) {
			System.out.println("Kova Burcu");
		}

		if (ay == 3 && gun >= 21) {
			System.out.println("Ko� Burcu");
		} else if (ay == 3) {
			System.out.println("Bal�k Burcu");
		}

		if (ay == 4 && gun >= 21) {
			System.out.println("Bo�a Burcu");
		} else if (ay == 4) {
			System.out.println("Ko� Burcu");
		}

		if (ay == 5 && gun >= 22) {
			System.out.println("ikizler Burcu");
		} else if (ay == 5) {
			System.out.println("Bo�a Burcu");
		}

		if (ay == 6 && gun >= 23) {
			System.out.println("Yenge� Burcu");
		} else if (ay == 6) {
			System.out.println("ikizler Burcu");
		}

		if (ay == 7 && gun >= 23) {
			System.out.println("Aslan Burcu");
		} else if (ay == 7) {
			System.out.println("yenge� Burcu");
		}

		if (ay == 8 && gun >= 23) {
			System.out.println("Ba�ak Burcu");
		} else if (ay == 8) {
			System.out.println("Aslan Burcu");
		}

		if (ay == 9 && gun >= 23) {
			System.out.println("Terazi Burcu");
		} else if (ay == 9) {
			System.out.println("Ba�ak Burcu");
		}

		if (ay == 10 && gun >= 20) {
			System.out.println("Akrep Burcu");
		} else if (ay == 10) {
			System.out.println("Terazi Burcu");
		}

		if (ay == 11 && gun >= 20) {
			System.out.println("Yay Burcu");
		} else if (ay == 11) {
			System.out.println("Akrep Burcu");
		}

		if (ay == 12 && gun >= 20) {
			System.out.println("O�lak Burcu");
		} else if (ay == 12) {
			System.out.println("Yay Burcu");
		}
	}

}
