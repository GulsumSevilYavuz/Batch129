package day18lists;


import java.util.ArrayList;
import java.util.List;

public class Lists01 {

 public static void main(String[] args) {

  //Example 1: Integer bir List olusturunuz
  //           List'e 5 tane eleman ekleyiniz
  //           Bu elemanlardan 12'yi siliniz.

  List<Integer> ages = new ArrayList<>();

  ages.add(10);
  ages.add(25);
  ages.add(12);
  ages.add(8);
  ages.add(12);

  //Note: Siz Java'da tamsayi yazdiginizda, Java o tamsayinin data type'ini otomatik olarak "primitive int" kabul eder.
  //      Bu yuzden remove() method'unun icine yazdiginiz tamsayi eleman olarak degil index olarak kabul edilir.
  //      Tamsayi'yi eleman olarak gostermenin birkac yolu vardir.
     System.out.println(ages);//[10, 25, 12, 8, 12]
     System.out.println(ages.remove(ages.indexOf(12)));
     Integer nonPrimitive = 12;
     System.out.println(ages.remove(nonPrimitive));//true

     System.out.println(Integer.valueOf(12) );
     System.out.println(ages);//[10, 25, 8, 12]
  //1.Yol
  //Integer nonPrimitive = 12;
  //ages.remove(nonPrimitive);

  //2.Yol: Recommended
  //ages.remove((Integer)12);

  //3.Yol
  //ages.remove(Integer.valueOf(12));// 2 method kullanildi

  //4.Yol
  //ages.remove(ages.indexOf(12));// 2 method kullanildi



  //Example 2: Integer bir List olusturunuz
  //           List'e 5 tane eleman ekleyiniz
  //           Tum 12'leri siliniz.
  //
  List<Integer> nums = new ArrayList<>();
  nums.add(10);
  nums.add(25);
  nums.add(12);
  nums.add(8);
  nums.add(12);
     System.out.println((nums.remove(nums.indexOf(12))));
     System.out.println(nums);//bu sekilde sadece ilk 121 silinir
     List<Integer> silinecekler = new ArrayList<>();
  silinecekler.add(12);//butun 12ler icin collection olusturulur
  silinecekler.add(25);

  //removeAll() method'u List ile calisir.
  //removeAll() method'u bir veya birden fazla elemanin tum gorunumlerini silmek icin kullanilir.
  nums.removeAll(silinecekler);

  System.out.println(nums);
 }}