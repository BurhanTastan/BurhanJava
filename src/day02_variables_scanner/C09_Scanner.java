package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1'i giriniz ");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen sayi2'i giriniz ");
        int sayi2= scan.nextInt();

        int temp;

        // 1. adim sayi2 degerini temp'e atayalim

        temp=sayi2;

        // 2. adim sayi1 degerini sayi2'ye atayalim

        sayi2=sayi1;

        // temp'deki degeri sayi1'e atayalim

        sayi1=temp;

        System.out.println("sayilarin degerini yer degistirdim"
                + "\nsayi1'in yeni degeri : " + sayi1
                + "\nsayi2'nin yeni degeri : " +sayi2);
















    }

}