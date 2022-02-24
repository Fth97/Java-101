package Pratik;

import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {
		int ay, gun;
		Scanner input = new Scanner(System.in);

		System.out.print("Doðdunuz Ay : ");
		ay = input.nextInt();

		System.out.print("Doðdunuz Gün : ");
		gun = input.nextInt();

		System.out.print("*** SWITCH-CASE ÝLE ÇÖZÜM *** \n");

		switch (ay) {
		case 1:
			if (gun >= 22) {
				System.out.println("Kova Burcu");
			} else {
				System.out.println("Oðlak Burcu");
			}
			break;

		case 2:
			if (gun >= 20) {
				System.out.println("Balýk Burcu");
			} else {
				System.out.println("Kova Burcu");
			}
			break;

		case 3:
			if (gun >= 21) {
				System.out.println("Koç Burcu");
			} else {
				System.out.println("Balýk Burcu");
			}
			break;

		case 4:
			if (gun >= 21) {
				System.out.println("Boða Burcu");
			} else {
				System.out.println("Koç Burcu");
			}
			break;

		case 5:
			if (gun >= 22) {
				System.out.println("Ýkizler Burcu");
			} else {
				System.out.println("Boða Burcu");
			}
			break;

		case 6:
			if (gun >= 23) {
				System.out.println("Yengeç Burcu");
			} else {
				System.out.println("Ýkizler Burcu");
			}
			break;

		case 7:
			if (gun >= 23) {
				System.out.println("Aslan Burcu");
			} else {
				System.out.println("Yengeç Burcu");
			}
			break;

		case 8:
			if (gun >= 23) {
				System.out.println("Baþak Burcu");
			} else {
				System.out.println("Aslan Burcu");
			}
			break;

		case 9:
			if (gun >= 23) {
				System.out.println("Terazi Burcu");
			} else {
				System.out.println("Baþak Burcu");
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
				System.out.println("Oðlak Burcu");
			} else {
				System.out.println("Yay Burcu");
			}
			break;

		default:
			System.out.println("Lütfen ay için 1-12 arasýnda bir sayý giriniz. Gün için takvimden yardým alýn. :)");
		}

		System.out.print("*** IF ÝLE ÇÖZÜM *** \n");


		if (ay == 1 && gun >= 22) {
			System.out.println("Kova Burcu");
		} else if (ay == 1) {
			System.out.println("Oðlak Burcu");
		}

		if (ay == 2 && gun >= 20) {
			System.out.println("Balýk Burcu");
		} else if (ay == 2) {
			System.out.println("Kova Burcu");
		}

		if (ay == 3 && gun >= 21) {
			System.out.println("Koç Burcu");
		} else if (ay == 3) {
			System.out.println("Balýk Burcu");
		}

		if (ay == 4 && gun >= 21) {
			System.out.println("Boða Burcu");
		} else if (ay == 4) {
			System.out.println("Koç Burcu");
		}

		if (ay == 5 && gun >= 22) {
			System.out.println("ikizler Burcu");
		} else if (ay == 5) {
			System.out.println("Boða Burcu");
		}

		if (ay == 6 && gun >= 23) {
			System.out.println("Yengeç Burcu");
		} else if (ay == 6) {
			System.out.println("ikizler Burcu");
		}

		if (ay == 7 && gun >= 23) {
			System.out.println("Aslan Burcu");
		} else if (ay == 7) {
			System.out.println("yengeç Burcu");
		}

		if (ay == 8 && gun >= 23) {
			System.out.println("Baþak Burcu");
		} else if (ay == 8) {
			System.out.println("Aslan Burcu");
		}

		if (ay == 9 && gun >= 23) {
			System.out.println("Terazi Burcu");
		} else if (ay == 9) {
			System.out.println("Baþak Burcu");
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
			System.out.println("Oðlak Burcu");
		} else if (ay == 12) {
			System.out.println("Yay Burcu");
		}
	}

}
