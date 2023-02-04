package aaa;

public class Method3 {
    public static void main(String[] args) {
        String input="kacak";
       boolean palidrommu= palidrom(input);
        System.out.println(palidrommu);
    }

    private static boolean palidrom(String input) {
        String yeni;
        boolean x ;
        String bos = "";
        int i;
        for (i = input.length() - 1; i >= 0; i--) {
           yeni = input.substring(i, i + 1);

            bos = bos + yeni;
            System.out.println(bos
            );
        }
            if (bos.equalsIgnoreCase(input)) {
                x = true;
                System.out.println(bos);
            }else {
                x=false;
            }
         return x;
        }
    }