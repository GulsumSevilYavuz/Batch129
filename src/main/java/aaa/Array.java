package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int sayi3[] = {5, 6, 8, 10};

        int sayi5[] = new int[4];

        System.out.println(sayi3);
        System.out.println(Arrays.toString(sayi3));
        sayi5 = new int[4];
        System.out.println(Arrays.toString(sayi5));
        sayi3[2] = 4;
        System.out.println(Arrays.toString(sayi3));

        List<String> isimler = new ArrayList<String>();//String yazmasanda olur sag tarafa
        //list bir imterface bundan dolayi ArrayList yazilir saga yoksa obje olusturamazsiniz
        System.out.println(isimler);

        isimler.add("ALICAN");
        isimler.add("VELICAN");
        isimler.add("3");
        isimler.add("5");
        System.out.println(isimler);
        List<String> isimler1 = new ArrayList<String>();
        isimler1.add("ALICAN");
        isimler1.add("VELICAN");
       // isimler.addAll(isimler1);
        System.out.println(isimler.addAll(isimler1));
        isimler.add("veli");

        System.out.println(isimler);


        System.out.println(isimler1);
    //    isimler.removeAll(isimler1);
        System.out.println(   isimler.removeAll(isimler1));

    }
}