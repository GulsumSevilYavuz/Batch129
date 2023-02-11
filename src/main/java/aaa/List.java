package aaa;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("TV");
        arr.add("RADIO");
        arr.add("ipad");
        arr.add("Notebook");
        arr.add("Mobile Phone");

        do {
            System.out.println("ürün adi giriniz..");

            String urun = input.nextLine().toLowerCase();
            if ((urun.equalsIgnoreCase("q"))) {
                break;
            } else if (arr.contains(urun)) {
                System.out.println("stokta yok..");


            }

        } while (true);
        System.out.println("tesekkür");
    }}