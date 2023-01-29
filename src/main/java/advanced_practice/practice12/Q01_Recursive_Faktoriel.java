package advanced_practice.practice12;

public class Q01_Recursive_Faktoriel {
    //Faktoriel hesaplayan bir method yaziniz .(loop kullanmayiniz)
    public static void main(String[] args) {

        System.out.println(faktoriyel(5));
    }


    public static int faktoriyel(int sayi) {

        if (sayi >= 0) {
            if (sayi == 0 || sayi == 1) {
                return 1;
            } else {
                return sayi * faktoriyel(sayi - 1);
            }
        } else {
            throw new ArithmeticException("Sayi sifirdan kucuk olamaz");
        }
    }
}

