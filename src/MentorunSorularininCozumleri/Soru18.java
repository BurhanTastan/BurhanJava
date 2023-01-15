package MentorunSorularininCozumleri;

import java.util.Scanner;

public class Soru18 {
    public static void main(String[] args) {

        /*Soru 18-)
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hizinizi ve km nizi giriniz");

        double girilenHiz   = scan.nextDouble();
        double girilenKm    =scan.nextDouble();

        System.out.println(varisSuresi(girilenHiz,girilenKm));
    }
    public static double varisSuresi (double girilenHiz, double girilenKm){
        System.out.println(girilenKm/girilenHiz);

        return girilenKm/girilenHiz;

    }

    /*Soru 19-)
    Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
            ipucu:
    Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
    */

    Scanner scan = new Scanner(System.in);




}

