package aaa;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        Integer arr[] = {14, 4, 6, 8, 10, 2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0] + arr[arr.length - 1]);

        Integer minimum = arr[0];

        for (Integer w : arr) {
            minimum = Math.min(minimum, w);
        }
        System.out.println(minimum);

        Integer maximum = arr[0];

        for (Integer w : arr) {
            maximum = Math.max(maximum, w);
        }
        System.out.println(maximum);

    }
}

