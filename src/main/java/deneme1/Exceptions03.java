package deneme1;

public class Exceptions03 {
    public static void main(String[] args) {


        String s = "java";
        getCharCharacterFromString(s, 2);
        getCharCharacterFromString(s, 4);

    }

    public static void getCharCharacterFromString(String s, int idx) {
        char ch = ' ';

        try {
            ch = s.charAt(idx);


        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("olmayan index kullanma hatasi");
            System.out.println(e.getMessage());
        }
        System.out.println(ch);

    }
}