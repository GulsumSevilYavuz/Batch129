package proje;

import java.util.Locale;
import java.util.Scanner;

public class tasKagitMakas2 {
    /* Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.*/
    public static void main(String[] args) {

        int kullanicipuani = 0;
        int bilgisayarpuani = 0;
        System.out.println("Oyunumza hosgeldiniz");
        System.out.println("oyuna devam etmek istemiyorsaniz Qya basin");

        do {


            Scanner input = new Scanner(System.in);
            System.out.println("lütfen TAS,KAGIT yada MAKAS isimlerinden birini giriniz");
            String secimUser = input.nextLine().toUpperCase();
            int bilgisayarsecimi = (int) (Math.random() * 3);
            String bilgisayarsecimistr = String.valueOf(bilgisayarsecimi);//0=tas 1=makas 2= kagit

            if (secimUser.equals("TAS") && bilgisayarsecimistr.equals("1")) {
                kullanicipuani++;
                System.out.println("kazandiniz" + kullanicipuani);
            } else if (secimUser.equals("MAKAS") && bilgisayarsecimistr.equals("2")) {
                kullanicipuani++;
                System.out.println("kazandiniz" + kullanicipuani);

            } else if (secimUser.equals("KAGIT") && bilgisayarsecimistr.equals("0")) {
                kullanicipuani++;
                System.out.println("Kazandiniz" + kullanicipuani);
            } else if (secimUser.equals(bilgisayarsecimistr)) {
                System.out.println("berabere kaldiniz");

            } else {
                bilgisayarpuani++;
                System.out.println("Kaybettiniz" + bilgisayarpuani);
                if (secimUser.equals("Q")) {
                    System.out.println("Oyun bitti");
                    break;

                }

                System.out.println("Puaniniz" + kullanicipuani);
                System.out.println("bilgisayar puani" + bilgisayarpuani);

            }


        } while (kullanicipuani <= 3 & bilgisayarpuani <= 3);


    }
}





