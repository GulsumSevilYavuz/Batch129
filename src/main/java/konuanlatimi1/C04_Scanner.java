package konuanlatimi1;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Ex : Kullanicidan alacaginiz 5 basamakli

        // bir sayinin ilk iki ve son iki basamagindaki

        // rakamlari toplamini yazdiran kodu yaziniz


        // input==>12345==> 1+2+4+5

        //output ==> = 12


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz ");


        int num = input.nextInt();//12345

        int ilkIkiRkm = num / 1000;

        System.out.println("ilkIkiRkm ==> " + ilkIkiRkm);// 12


        int ilkIkiTop = (ilkIkiRkm % 10) + (ilkIkiRkm / 10);

        System.out.println("ilkIkiTop = " + ilkIkiTop);//3


        int sonIkiRkm = num % 100;

        System.out.println("sonIkiRkm = " + sonIkiRkm);//45


        int sonIkiRkmTop = (sonIkiRkm % 10) + (sonIkiRkm / 10);

        System.out.println("sonIkiRkmTop = " + sonIkiRkmTop);//9


        int toplam = ilkIkiTop + sonIkiRkmTop;

        System.out.println("toplam = " + toplam);//12


    }


    public static class C03_Scanner {
        public static void main(String[] args) {

            // EX 1) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz


            //1.Adim Scanner Class'indan Object olusturun

            Scanner input = new Scanner(System.in);

            //2.Adim Kullaniciya ne yapacagini soyle

            System.out.println("Lutfen toplanacak olan ilk sayiyi giriniz");

            //3.Adim Kullanicidan aldiginiz datayi variable icine koyun

            double sayi1 = input.nextDouble();

            System.out.println("Lutfen toplanacak olan ikinci sayiyi giriniz");

            double sayi2 = input.nextDouble();

            System.out.println("Toplam " + (sayi1 + sayi2));


        }

    }
}


