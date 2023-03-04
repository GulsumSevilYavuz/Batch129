package okulyönetimplatformu;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulSistemi {

    static Scanner scanner = new Scanner(System.in);

    public static void yonetimPaneli() {

        System.out.println("====================================\n" +
                " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "====================================\n" +
                " 1- ÖĞRENCİ İŞLEMLERİ\n" +
                " 2- ÖĞRETMEN İŞLEMLERİ\n" +
                " Q- ÇIKIŞ");
    }

    public static void islemSec() {
        System.out.println("Yapacaginiz islemi seciniz lutfen..");

        String secim = scanner.nextLine();

        if (secim.equalsIgnoreCase("1")) {
            ogrenciIslemleriMenusu();
            System.out.println("Lutfen yapacaginiz islemi seciniz");
            String secim2 = scanner.nextLine();
            if (secim2.equalsIgnoreCase("1")) {
                ogrenciEkleme();


            }


        } else if (secim.equalsIgnoreCase("2")) {

        } else if (secim.equalsIgnoreCase("Q")) {

        } else {
            System.out.println("Lutfen gecerli bir giris yapiniz..");

        }


    }

    public static void ogrenciIslemleriMenusu() {
        System.out.println("============= İŞLEMLER =============\n" +
                " 1-EKLEME\n" +
                " 2-ARAMA\n" +
                " 3-LİSTELEME\n" +
                " 4-SİLME\n" +
                " 5-ANA MENÜ\n" +
                " Q-ÇIKIŞ\n" +
                "SEÇİMİNİZ:");


    }

    public static void ogrenciEkleme() {

        Scanner scanner = new Scanner(System.in);

        Okul okul = new Okul();

        System.out.println("Okul adini giriniz");
        okul.setOkulAdi(scanner.next());

        System.out.println("Maximum ogrenci sayisini giriniz");
        okul.setMaxOgrenciSayisi(scanner.nextInt());

        List<Ogrenci> ogrenciListesi = new ArrayList<>();

        for (int i = 1; i <= okul.getMaxOgrenciSayisi(); i++) {
            scanner.nextLine(); //dummy sscanner
            Ogrenci ogrenci = new Ogrenci();

            System.out.println(i + ". ogrenci ad: ");
            ogrenci.setOgrenciAd(scanner.nextLine());

            System.out.println(i + ". ogrenci soyad: ");
            ogrenci.setOgrenciSoyad(scanner.nextLine());

            System.out.println(i + ". ogrenci ID: ");
            ogrenci.setOgrenciId(scanner.nextLine());

            System.out.println(i + ". ogrenci yas: ");
            try {
                ogrenci.setOgrenciYas(scanner.nextInt());
                if (ogrenci.getOgrenciYas() < 8 || ogrenci.getOgrenciYas() > 15) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException exception) {
                System.out.println("Ogrenci yasi 8 ile 15 araliginda olmalidir");
                i--;
                continue;

            } catch (Exception exception) {
                System.out.println("Gecerli bir 'SAYI' giriniz");
                i--;
                continue;
            }

            System.out.println(i + ". ogrenci Sinif: ");
            ogrenci.setOgrenciSinif(scanner.nextInt());

            System.out.println(i + ". ogrenci numarasi: ");
            ogrenci.setOgrenciNumara(scanner.nextInt());


            okul.addOgrenciToList(ogrenci);

            System.out.println(okul.getOgrenciListesi());
        }
        System.out.println(okul);


    }


}