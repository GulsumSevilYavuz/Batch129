package aaa;

public class Method2 {


    public static void main(String[] args) {
        int input=10;
        int sonuc=toplama( input);
        System.out.println(sonuc);
    }

    private static int toplama(int input) {
        int sonuc;
        if (input == 7) {
            return sonuc = 7;

        } else {
            return sonuc = input + toplama(input - 1);//bizi hep toplama methoda götürür bi azaltip döngüyü methoda cevirir taki 1 olana kadar
            //   recurisive method(az kullanilir)  anlasilmasi zordur
            // stack overflor
   /*   int sonuc=0;
        for (int i = 1; i <5 ; i++) {

            sonuc+=i;

        }
        return sonuc;} */

        }

    } }
