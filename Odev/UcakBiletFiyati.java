package Odev;

import java.util.Scanner;

public class UcakBiletFiyati {

	public static void main(String[] args) {
		
		int km,yolculukTipi,yas;
		double tutar = 0;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Mesafeyi km türünden giriniz :");
		km= scanner.nextInt();
		
		System.out.println("Yaþýnýzý giriniz :");
		yas=scanner.nextInt();
		
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ):");
		yolculukTipi= scanner.nextInt();
		
		if((km >0 && yas >0) && (yolculukTipi==1 || yolculukTipi==2))
		{
			tutar=km * 0.10;
			
			if(yas<12) 
				tutar=(tutar-(tutar*0.50));
			if(yas>12 && yas<24) 
				tutar=(tutar-(tutar*0.10));
			if(yas>65) 
				tutar=(tutar-(tutar*0.30));
			if(yolculukTipi==2)
				tutar=(tutar-(tutar*0.20));
		}
		else {
			System.out.println("Hatalý Veri Girdiniz !");
		}
		System.out.println("Toplam Tutar: "+tutar+"  TL");
	}

}
