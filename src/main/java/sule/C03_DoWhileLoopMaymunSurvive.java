package sule;


public class C03_DoWhileLoopMaymunSurvive {

   /*
        INTERWIEW QUESTIONS
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

        */

        public static void main(String[] args) {
            int numberofbananas = 165;  //4  8    12      ... 164  ==> geriye 1 muz kaldiYasamasi icin yeterli degil
            int survivalDays = 1;      //1   2    3        .. 41   ==> 42.oldu
            boolean monkeyAlive = true;

            System.out.println("  maymunlar yasamak icin gunde 4 muz yer ");
            do {

                numberofbananas -= 4; //  numberofbananas = numberofbananas-4;
                System.out.println("Kalan muz Sayisi " + numberofbananas);
                survivalDays++;
                if (numberofbananas >= 4) {
                    monkeyAlive = true;
                    System.out.println("Bugun " + survivalDays + ". gun Maymun yasiyor");
                }

                 else if (numberofbananas < 4) {

                    monkeyAlive=false;
                    System.out.println("Bugun " + survivalDays + ". gun Maymun oldu");

                 } }  while(monkeyAlive);

        }

    }