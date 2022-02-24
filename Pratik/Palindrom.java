package Pratik;

import java.util.Scanner;

public class Palindrom {

    static void isPalindrom(int sayi) {

        int temp = 0, hafiza = sayi;

        while (hafiza != 0) {
        	temp = temp + (hafiza % 10);
            hafiza /= 10;
            temp=temp*10;
        }
        temp=temp/10;

        if (sayi == temp) {
            System.out.println(sayi + " Palindrom sayýdýr.");
        } else {
            System.out.println(sayi + " Palindrom sayý deðildir.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int sayi=scanner.nextInt();
    	isPalindrom(sayi); 
    }
}
