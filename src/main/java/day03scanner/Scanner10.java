package day03scanner;

import java.util.Scanner;

public class Scanner10 {
    public static void main(String[] args) {

        Scanner sayi = new Scanner(System.in);

        System.out.println("5 basamakli sayi giriniz");
        int sayi1 = sayi.nextInt();

        int sayi2 = sayi1 / 1000;

        System.out.println(sayi2);
        int sayi3 = sayi2 / 10 + sayi2 % 10;
        System.out.println(sayi3);

        int sayi4 = sayi1 % 100;
        System.out.println(sayi4);
        int sayi5 = sayi4 / 10 + sayi4 % 10;
        System.out.println(sayi5);
    }
       /* sayi6Scanner input = new Scanner(System.in);

        System.out.println("lütfen isim grin");

        String isim = input.nextLine();

        System.out.println("lutfen memleketinizi girin");

        String memleket= input.nextLine();

        System.out.println("yasinizi sirin");

        int yas= input.nextInt();


        System.out.println("memleketiniz güzel mi");

        boolean seviyormu=input.nextBoolean();

        System.out.println("lütfen gecerli bir veri girin");

        //
        Scanner sayi=new Scanner(System.in);

        System.out.println("lütfen birinci sayi girin");

        double sayi1=sayi.nextDouble();


        System.out.println("lütfen bi sayi daha girin");
        double sayi2=sayi.nextDouble();

        System.out.println(sayi1+sayi2);

        /*



    }

   /*

 //kullaniciya ad,memleket,yas,boy, yasadigi yeri sevip sevmedigini soran bir kod yaziniz.

​

    Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz.");

    String isim=scan.nextLine(); //Kullanicdan String Bir deger istedik. Tüm satiri almasi icin nextLine secilir.

​

        System.out.println("Lütfen memleketinizi giriniz.");

    String memleket=scan.nextLine();

​

        System.out.println("Lütfen yasinizi giriniz");

    int yas= scan.nextInt();

​

        System.out.println("Lütfen boyunuzu giriniz.");

    short boy=scan.nextShort();

​

        System.out.println("LÜtfen yasadiginiz yeri sevip sevmediginizi yaziniz");

    boolean seviyorMu=scan.nextBoolean();

​

​

​

    //ÖRNEK1: Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz.

​

    //1.Adim: Scanner clasindan object olusturun

    Scanner input= new Scanner(System.in);

​

    //2.adim: kullaniciya ne yapacagini söyle

        System.out.println("Lütfen toplanacak olan ilk sayi giriniz");

​

    //3.adim: kullanicidan aldiginiz datayai variable icine koyun.

​

    double sayi1=input.nextDouble();

​

        System.out.println("Lütfen toplanacak olan ikinci sayiyi giriniz");

    double sayi2=input.nextDouble();

​

        System.out.println("Toplam=  " + (sayi1+sayi2));

​

​

    //Ex3 : Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindak rakamlari toplamini yazdiran kodu yaziniz

    public static void main(String[] args) {

​

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen 5 basamakli bir sayi giriniz");

​

        int sayi=input.nextInt(); //12345

​

        int ilkIki= sayi/1000 ;// 12

        System.out.println(ilkIki);

​

        int rkmTpl1= ilkIki /10 + ilkIki % 10; //3

        System.out.println(rkmTpl1);

​

        int sonIki=sayi%100 ;//45

        System.out.println(sonIki);

​

        int rkmTpl2= sonIki /10 + sonIki % 10; //

        System.out.println(rkmTpl2);

​

        System.out.println("Sonuc= " + (rkmTpl1+rkmTpl2));

​

​

*/

}
