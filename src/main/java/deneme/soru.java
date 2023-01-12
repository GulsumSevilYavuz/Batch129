package deneme;



import java.util.ArrayList;

import java.util.Scanner;



public class soru {


    public static void main(String[] args) {



            // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

            Scanner input = new Scanner(System.in);

            ArrayList<String> ogrenci_notlari = new ArrayList<>();

            int toplam = 0;

            int ortalama;

            int index = 1;

            String not;

            System.out.println("Ogrencilerin notlarini girinz ve cikmak icin q ya basiniz");

            int counter = 0;

            do {

                System.out.println(index + ".ogrencinin  notunu  girinz");

                not = input.next();

                if (not.equalsIgnoreCase("q")) {

                    break;

                } else {
                    ogrenci_notlari.add(not);
                    index++;

                }

            } while (true);

            System.out.println(ogrenci_notlari);

            for (String w : ogrenci_notlari) {

                toplam = toplam + Integer.parseInt(w);

            }

            ortalama = toplam / ogrenci_notlari.size();

            for (String w : ogrenci_notlari) {

                if (Integer.parseInt(w) > ortalama) {

                    counter++;

                }

            }

            System.out.println("sinifin ortalamasi = " + ortalama + "\nortalamayi gecen ogrenci syisi = " + counter);

        }//Main

    }

