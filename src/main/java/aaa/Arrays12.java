package aaa;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Comparator;

public class Arrays12 {
    public static void main(String[] args) {
        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};
        Arrays.sort(arr,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

String brr[]=new String[arr.length];
int idx=0;
        for (int i = arr.length-1; i >=0 ; i--) {
brr[idx]=arr[i];
idx++;
        }

        System.out.println(Arrays.toString(brr));

        }


    }