package practice_daytime.daytime07;


    import java.util.Calendar;
import java.util.GregorianCalendar;

    public class MiladiTakvim {

     /*
    yerel tarih ve zamana gore; gecerli tarih ve saat
    diliminde bir Miladi Takvim olustur.
    Mevcut yilin isLeapYear olup olmadigini gosteriniz
     */

        public static void main(String[] args) {

            String aylar[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
                    "Oct", "Nov", "Dec"};
            int year;
            GregorianCalendar miladiTakvim = new GregorianCalendar();
            System.out.print("Date : ");
            System.out.print(aylar[miladiTakvim.get(Calendar.MONTH)]);
            System.out.print(" " + miladiTakvim.get(Calendar.DATE) + " ");
            System.out.println(year = miladiTakvim.get(Calendar.YEAR));


            if (miladiTakvim.isLeapYear(year)) {
                System.out.println("Bu yil artik yil");

            } else
                System.out.println("Bu yil artik yil degil");


        }
    }

   /*             String = daha yavas ,Immutable==> degismez,

                        StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,

                        StringBuffer synchronized,thread safe.

        StringBuilders = mutable==>degisebilir ,

        not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

        1) String Class'i immutable(Degistirilemez)dir.

        Java mutable degisebilir Stringler uretebilmemiz icin

        StringBuilder  class'i uretmistir.

        2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde

        StringBuffer classida vardir. "StringBuffer" Class'i StringBuilder

        Class'indan daha once uretilmistir.

        "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli

        calisir. "StringBuffer"  "synchronize" islemlerini yapabilir,

        ama "StringBuilder" yapamaz.

        3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok,

        "thread"= Yapilan islerin herbiri

        multi threading varsa, bu islerin siraya konulmasi lazim.

        Islerin siraya konulmasina "synchronization" denir.

        String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

        Bunun iki sebebi vardir:

        1) Java pass-by-value kullanir   2) String Class'i immutable Class'dir.*/

