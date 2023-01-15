package MentorunSorularininCozumleri;

public class Soru33 {
    public static void main(String[] args) {

        /*Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
        */

        String cumle = "Kodlama harika";

        String []  parcala = cumle.split("");

        String tersi = "";


        for (int i = parcala.length-1;i>=0; i--) {

            tersi+=parcala[i]+" ";
        }

        System.out.println(tersi);
    }
}
