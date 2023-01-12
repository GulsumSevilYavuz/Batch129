package sule;

public class MaymunMeselesi {


    public static void main(String[] args) {

            /* INTERWIEW SORUSU
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

        */

//
        int numberofbananas = 165;  //          ... 1  ==> kalan muz sayisi

        int survivalDays = 1;      // 2          .. 41   ==> 42.oldu

        boolean monkeyAlive = true;

        System.out.println(" maymunlar yasamak icin gunde 4 muz yer ");

        do {

            System.out.println("Kalan muz Sayisi " + numberofbananas);
            numberofbananas -= 4; //  numberofbananas = numberofbananas-4;
            System.out.println("yasadigi gün  " + survivalDays);
            survivalDays++;


        } while (numberofbananas >= 4);
        if (numberofbananas < 4) {
            System.out.println("Kalan muz Sayisi " + numberofbananas);
            System.out.println("Öldugu gun"+survivalDays);
        }
    }
}
//main
//     >bu kisim yazilmaz >
//for (int numberofbananas = 0;  i <numberofbananas ;numberofbananas --) {


//    int i=0;                int a=4;
//while(i < 8){               do{System.out.println("i")
//System.out.println(i);       //i++(sout tusundan sonra)}

//  i++(sout tusundan sonra)       //parantez kapanir 1.döngü biter

//                                  //hile(i < 8){


