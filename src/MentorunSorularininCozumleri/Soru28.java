package MentorunSorularininCozumleri;

import java.util.Scanner;

public class Soru28 {
    public static void main(String[] args) {
        /*Soru-28)
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
        Sayı: 1238
        Sayının Tersi: 8321
        İpucu:  Loop kullanabilirsiniz.

         */

       int sayi = 1238;
       String sayi2 = "1238";
       String tersi = "";

        for (int i = sayi2.length()-1; i >=0; i--) {
            tersi+=sayi2.substring(i,i+1);

        }
        sayi=Integer.parseInt(tersi);
        System.out.println(tersi);
    }
}
