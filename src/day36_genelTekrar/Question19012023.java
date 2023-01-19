package day36_genelTekrar;

import java.util.Arrays;

public class Question19012023 {
    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.


        int [] arr = {2,4,6,8,9};
        artirmaMethodu(arr);

        System.out.println(Arrays.toString(artirmaMethodu(arr)));
    }

    private static int[] artirmaMethodu(int [] arr) {
        int [] yeniArr = new int [arr.length];
        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i]=arr[i]+2;
        }
        return yeniArr;
        }

}
