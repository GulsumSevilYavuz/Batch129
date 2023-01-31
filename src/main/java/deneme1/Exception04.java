package deneme1;

public class Exception04 {
    public static void main(String[] args) {
        String arr[] = {"A", "G", "M", "L"};

        getElementFromString(arr, 1);
        getElementFromString(arr, 5);

    }

    public static void getElementFromString(String[] s, int idx) {
        String el = " ";
        try {
            el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        System.out.println(el);
    }
}