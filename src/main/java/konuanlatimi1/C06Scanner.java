package konuanlatimi1;
import java.util.Scanner;



public class C06Scanner {


    public static void main(String[] args) {


        //Kullanicidan aldiginiz seki ile asagidaki gibi bir gorsel olusturunuz

           /*

                  A

                 A A

                A A A



        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz ");

        char ch= input.next().charAt(0);

        System.out.println("  "+ch+"  ");

        System.out.println(" "+ch+" "+ch+" ");

        System.out.println(ch+" "+ch+" "+ch);

        System.out.println("\t\t"+ch+"\t\t");

        System.out.println("\t"+ch+"\t\t"+ch+"\t");

        System.out.println(ch+"\t\t"+ch+"\t\t"+ch);


           /*

        \n ==> alt satira gecirir

        \t ==> bir tab bosluk birakir

        \b ==> gerisindeki ilk harfi siler

        ctrl+ alt +l ==> windows icin sayfayi duzenler

        cmd + alt +l ==> mac icin sayfayi duzenler

        ctrl+z==> geri al

        ctrl +s ==> kaydeder

        ctrl+d ==> cogaltir

         */


        String s = "accessories";
        String d = "";
        for(Integer i=0; i<s.length(); i++) {

            char f = s.charAt(i);
            System.out.println(f);


        }}

    public static class Scanner06 {



        public static void main(String[] args) {



            //Kullanicidan alacaginiz 5 basamakli

            // bir sayinin ilk iki ve son iki basamagindaki

            // rakamlarin toplamini yazdiran kodu yaziniz



            Scanner input = new Scanner(System.in);



            System.out.println("5 basamakli bir sayi giriniz...");



            int number = input.nextInt();



            //Son rakami al

            int lastDigit = number%10;

            System.out.println(lastDigit);



            //Sayiyi kucult

            number = number/10;

            System.out.println(number);

        }



    }

    public static class C01_Variables {
        public static void main(String[] args) {




            //1)TECHPRO EDUCATION ==> her bir harf alt alta gelecek sekilde yazdiran kodu olusturunuz.



            System.out.println("*************1. YOL**********");

            System.out.println("T");

            System.out.println("E");

            System.out.println("C");

            System.out.println("H");

            System.out.println("P");

            System.out.println("R");

            System.out.println("O");

            System.out.println("");//HICLIKTE OLUR

            System.out.println("E");

            System.out.println("D");

            System.out.println("U");

            System.out.println("C");

            System.out.println("A");

            System.out.println("T");

            System.out.println("I");

            System.out.println("O");

            System.out.println("N");

            /*

            \n ==> alt satira gecirir

            \t ==> bir tab bosluk birakir

            \b ==> gerisindeki ilk harfi siler

            ctrl+ alt +l ==> windows icin sayfayi duzenler

            cmd + alt +l ==> mac icin sayfayi duzenler

             */



            //2)yukaridaki ornegi tek sout ile her harf alt alta gelecek sekilde yazdirin

            System.out.println("************2.Yol******************");

            System.out.println("\nT\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");



            //3) JAVA ILE GUZEL DUNYA her bir kelimeyi alt satira yazdiracak sekilde kodu create ediniz



            System.out.println("\nJAVA\nILE\nGUZEL\nDUNYA");

            System.out.println("JAVA");

            System.out.println("ILE");

            System.out.println("GUZEL");

            System.out.println("DUNYA");



            //4) JAVA ILE GUZEL DUNYA seklinde kelimeler arasinda 1 tab bosluk birakan kodu yaziniz

            System.out.println("JAVA\tILE\tGUZEL\tDUNYA");



            //5) pazartesi kelimesinin her bir harfini alt satirda yazdiracak sekilde tek sout ile kodu create ediniz

            System.out.println("\np\na\nz\na\nr\nt\ne\ns\ni");

            //Soru-6 : "Techpro" ile java cok 'kolay'

            // yazdiran bir kod yaziniz



            System.out.println("\"Techpro\"\tile\tjava\tcok\t'kolay'");

            //Soru-7 : "MAHARET" hic 'DUSMEMEK'  degil;



            // "Her dustugunde kalkabilmektir" ==>ifadesini



            //      seklinde noktali virgulden

            //      sonra 3 satir asagidan ve satir basi yaparak

            //      yazdiran bir kod yaziniz.


            System.out.println("\"MAHARET\" hic\t'DUSMEMEK'\tdegil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");


        }


        public static class C02Scanner {
            //Scanner classi kullanici ile etkilesim kurmamizi saglar.

            //Scanner bir Class'tir.Java util kutuphanesinden getirildi icin import ister



            public static void main(String[] args) {



                //Kullanicidan Data Almak Icin

                //1.Adim Scanner Class'indan Object olusturun

                Scanner input = new Scanner(System.in);

                //Scanner scan= new Scanner(System.in);



                //2.Adim Kullaniciya ne yapacagini soyle

                System.out.println("Lutfen yasinizi giriniz");



                //3.Adim Kullanicidan aldiginiz datayi variable icine koyun

                byte age= input.nextByte();



                // Kullaniciya ad , memleket , yas, boy ,

                //yasadigi yeri sevip sevmedigini soran bir program yaziniz



                Scanner scan = new Scanner(System.in);

                System.out.println("Lutfen isminizi giriniz...");

                String isim= scan.nextLine();//Kullanicidan String bir deger istedik tum satiri almasi ici nextLine sectik

                System.out.println("Lutfen memleketinizi giriniz...");

                String memleket= scan.nextLine();

                System.out.println("Lutfen yasinizi giriniz....");

                int yas =scan.nextInt();

                System.out.println("Lutfen boyunuzu giriniz....");

                short boy= scan.nextShort();

                System.out.println("Lutfen yasadiginiz yeri sevip sevmediginizi yaziniz");

                boolean seviyorMu = scan.nextBoolean();

                System.out.println("********************");

                System.out.println("isim = " + isim);

                System.out.println("memleket = " + memleket);

                System.out.println("yas = " + yas);

                System.out.println("boy = " + boy);

                System.out.println("seviyorMu = " + seviyorMu);



            }

        }
    }
}