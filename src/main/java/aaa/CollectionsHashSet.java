package aaa;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionsHashSet {
    public static void main(String[] args) {

      long one=  System.nanoTime();
        TreeSet<String> artist = new TreeSet<>();
        artist.add("Ajda");
     System.out.println(artist);//[Ajda, Tom, Bread, Angelina]
     artist.tailSet("Ajda");
        long two=  System.nanoTime();
        LinkedHashSet<String>actrest = new LinkedHashSet<>();
        actrest.add("Ajda");
        actrest.add("Angelina");
        artist.removeAll(actrest);

        System.out.println(artist);//[Tom, Bread]
        long three=  System.nanoTime();

      System.out.println("THREESET uygulama süresi"+(two-one));

      System.out.println("THREESET uygulama süresi"+(three-two));

    }
}