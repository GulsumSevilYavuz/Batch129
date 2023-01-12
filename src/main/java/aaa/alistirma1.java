package aaa;

public class alistirma1 {
    public static void main(String[] args) {


     /*
  Bugün tartistigimiz soru: Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
    true veya false sonucu donen bir method olusturun.
 */

        String[] arr={"ali", "veli","ahmet","mehmet"};

        String arananIsim= "";

        boolean isimVarMi=false; // false


        boolean sonuc = isimAra(isimVarMi,"gani", arr);
        System.out.println(sonuc);

    }

    public static boolean isimAra(boolean isimVarMi,String arananIsim,String []arr){

        for (String w : arr) {

            if (w.equalsIgnoreCase(arananIsim)){
                isimVarMi=true;

                break;
            }else {
                isimVarMi=false;

            }
        }


        return isimVarMi;
    }}