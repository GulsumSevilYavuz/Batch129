package aaa;

public class YeniMethod {
    public static void main(String[] args) {

        double saatÜcreti = 15;
        double aylikCalismaSaati = 160;
      double brütMaas=aylikÜcret(saatÜcreti, aylikCalismaSaati);
        System.out.println("brütMaas"+brütMaas);

    }
public static double aylikÜcret(double saatÜcreti,double calismaSaati) {


    double netMaas = calismaSaati * saatÜcreti;
    double krankenVersicherung = netMaas * 7.3 % 100;
    double pflegeVersicherung = netMaas * 1.525 % 100;
    double rentenversicherung = netMaas * 9.30 % 100;
    double arbeitslosenVersicherung = netMaas * 1.30 % 100;
    double insolvenzGeldUmlage = netMaas * 0.06 % 100;
    double gesetzlicheUnfallVersicherung = netMaas * 1.60 % 100;

    double brütMaas = netMaas - (krankenVersicherung + pflegeVersicherung + rentenversicherung + arbeitslosenVersicherung + insolvenzGeldUmlage + gesetzlicheUnfallVersicherung);
    System.out.println("krankenVersicherung:"+krankenVersicherung);
    System.out.println("pflegeVersicherung"+pflegeVersicherung);
    System.out.println("rentenversicherung"+rentenversicherung);
    System.out.println("arbeitslosenVersicherung"+arbeitslosenVersicherung);
    System.out.println("insolvenzGeldUmlage"+insolvenzGeldUmlage);
    System.out.println("gesetzlicheUnfallVersicherung"+gesetzlicheUnfallVersicherung);
    System.out.println("netMaas"+netMaas);
 return brütMaas;
}
}
