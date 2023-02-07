package aaa;

import java.util.Arrays;

public class Arrays09 {

    public static void main(String[] args) {
        String str[] = new String[5];

        str[0] = "Math";
        str[1] = "Science";
        str[2] = "Music";
        str[3] = "Englisch";
        str[4] = "Art";
        System.out.println(Arrays.toString(str));
        System.out.println(str[0].length() + str[str.length - 1].length());


        String brr[] = new String[5];
        brr[0] = "Math";
        brr[1] = "Science";
        brr[2] = "Music";
        brr[3] = "Englisch";
        brr[4] = "Art";
        int totalChar=0;
        for (int i = 0; i <brr.length ; i++) {

        totalChar=totalChar+brr[i].length();
        }
        System.out.println(totalChar);
      int  sum=0;
        for (String w : brr) {


                sum=sum+w.length();
        }
            System.out.println(sum);
    }



}