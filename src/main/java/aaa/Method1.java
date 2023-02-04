package aaa;

public class Method1 {
    public static void main(String[] args) {
        String isim = "BÜLENT";
        String soyisim = "YILMAZ";
        String isimSoyisim;

        isimSoyisim = isimDuzenle(isim, soyisim);
        System.out.println(isimDuzenle(isim, soyisim));
        System.out.println("istediginiz numarayi girin"+"-Asala sayi mi bak"+"-Fibonacci mi bak");



    }

    private static String isimDuzenle(String isim, String soyisim) {


        String isimyeni = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();


        String soyisimyeni = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

        String isimSoyisim = isimyeni +" "+ soyisimyeni;

        return isimSoyisim;
    }
}