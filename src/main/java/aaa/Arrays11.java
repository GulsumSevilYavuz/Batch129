package aaa;

import java.util.Arrays;
import java.util.Iterator;

public class Arrays11 {
    public static void main(String[] args) {


        String colors[] = {"Red", "Orange", "Blue", "Yelow", "Brown"};

        System.out.println(Arrays.toString(colors));
        for (String w : colors) {

          if(w.equalsIgnoreCase("yelow"))  {

              break;

          } System.out.println(w);
        }




        int counter = 0;
        for (String w : colors) {

            if (w.length() <= 5) {
                counter++;

            }

        }
            String newColors[] = new String[counter];

            int idx = 0;

            for (String w: newColors) {
                if (w.length() <= 5) {
                    newColors[idx] = w;
                    idx++;
                }
                System.out.println(Arrays.toString(newColors));




            }


        }
    }