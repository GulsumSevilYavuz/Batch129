package aaa;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        int[][] a = {{2, 62, 82}, {3, 13}};
        System.out.println(Arrays.deepToString(a));
int small=a[0][0];
int big=a[0][0];

        for (int[] w : a) {
            for (int k : w) {
               if(k<small){
                   small=k;
               }if(k>big){
                   big=k;
                }
                System.out.print(small);
                System.out.println();
                System.out.print(big);
            }
            System.out.print(small);
            System.out.println();
            System.out.print(big);
        }





        System.out.print(small);
        System.out.print(big);




    }}
