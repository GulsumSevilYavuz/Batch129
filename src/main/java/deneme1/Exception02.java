package deneme1;

public class Exception02 {
    public static void main(String[] args) {


        String s = "1234";
        convertStringToInt(s);
        String t = "1a2b";
        convertStringToInt(t);

    }

    public static void convertStringToInt(String s) {

        int ints = 0;
        try {
            ints = Integer.valueOf(s);

        } catch (NumberFormatException e) {

        }
        System.out.println(ints + 1);
    }
}