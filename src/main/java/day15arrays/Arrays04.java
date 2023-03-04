package day15arrays;


import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {

        // Example 1: Bir Arrayin icinde herhangi bir elemanin olup olmadigini
        // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        int a[] = {0, 2, 3, 0, 12, 0};
        System.out.println(a);//[I@4dd8dc3
        System.out.println(Arrays.toString(a));//[0, 2, 3, 0, 12, 0]
        int num = 3;
        int counter = 0;

        for (int w : a) {
            if (w == num) {
                counter++;
            }
        }

        if (counter > 0) {
            System.out.println(num + ", array'de " + counter + " defa var.");
        } else {
            System.out.println(num + ", array'de yok.");
        }
    }
}


