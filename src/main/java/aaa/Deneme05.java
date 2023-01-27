package aaa;

public class  Deneme05 {


        String name = "Emily";
        int age = 20;

        Deneme05(String name, int age) {
this.name=name;

        System.out.println(age);//20
            System.out.println(name);//emoly

        }

        public static void main(String[] args) {
            Deneme05 obj = new Deneme05("veli", 25);
        System.out.println(obj.age);//20
            System.out.println(obj.name);//emily
        }

    }
