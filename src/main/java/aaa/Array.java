package aaa;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Array {
  public static void main(String[] args) {
        int[]arr=new int[5];
        arr [0]=10;
      System.out.println(Arrays.toString(arr));
        arr[0]=12;//güncelledi
      System.out.println(Arrays.toString(arr));
      System.out.println(arr);//[I@4dd8dc3

        HashMap<String,Integer>hm=new HashMap<>();
        System.out.println(hm);//{}
hm.put("Germany", 1000000);
hm.put("Türkiye", 8000000);
      System.out.println(hm);
     Set<String> key=hm.keySet();


    }}