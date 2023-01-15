package MentorunSorularininCozumleri;

import java.util.Scanner;

public class Soru21 {
    public static void main(String[] args) {

       /*
        Soru 21-)
Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)
Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016
Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay no su giriniz");
        int ayNo = scan.nextInt();
        System.out.println("Bir yil no giriniz");
        int yilNo = scan.nextInt();

        switch (ayNo){
            case 1 :
                System.out.println("31 gun");
                break;
            case 2 :
                if (yilNo%4==0) System.out.println("29 gun");
                else System.out.println("28 gun");
                break;
            case 3 :
                System.out.println("31 gun");
                break;
            case 4 :
                System.out.println("30 gun");
                break;
            case 5 :
                System.out.println("31 gun");
                break;
            case 6 :
                System.out.println("30 gun");
                break;
            case 7 :
            case 8 :
                System.out.println("31 gun");
                break;
            case 9 :
                System.out.println("30 gun");
                break;
            case 10 :
                System.out.println("31 gun");
                break;
            case 11 :
                System.out.println("30 gun");
                break;
            case 12 :
                System.out.println("31 gun");
                break;

        }

    }
}
