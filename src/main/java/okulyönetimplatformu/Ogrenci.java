package okulyönetimplatformu;

public class Ogrenci {
    private String ogrenciAd;

    private String ogrenciSoyad;

    private String ogrenciId;

    private int ogrenciYas;

    private int ogrenciNumara;

    private int ogrenciSinif;
    public Ogrenci(String ogrenciAd, String ogrenciSoyad, String ogrenciId, int ogrenciYas, int ogrenciNumara, int ogrenciSinif) {

        this.ogrenciAd = ogrenciAd;

        this.ogrenciSoyad = ogrenciSoyad;

        this.ogrenciId = ogrenciId;

        this.ogrenciYas = ogrenciYas;

        this.ogrenciNumara = ogrenciNumara;

        this.ogrenciSinif = ogrenciSinif;

    }


    public Ogrenci() {


    }

    public String getOgrenciAd() {

        return ogrenciAd;

    }

    public void setOgrenciAd(String ogrenciAd) {

        this.ogrenciAd = ogrenciAd;

    }


    public String getOgrenciSoyad() {

        return ogrenciSoyad;

    }

    public void setOgrenciSoyad(String ogrenciSoyad) {

        this.ogrenciSoyad = ogrenciSoyad;

    }

    public String getOgrenciId() {

        return ogrenciId;

    }

    public void setOgrenciId(String ogrenciId) {

        this.ogrenciId = ogrenciId;

    }

    public int getOgrenciYas() {

        return ogrenciYas;

    }

    public void setOgrenciYas(int ogrenciYas) {

        this.ogrenciYas = ogrenciYas;
    }

    public int getOgrenciNumara() {

        return ogrenciNumara;

    }

    public void setOgrenciNumara(int ogrenciNumara) {

        this.ogrenciNumara = ogrenciNumara;

    }

    public int getOgrenciSinif() {

        return ogrenciSinif;

    }

    public void setOgrenciSinif(int ogrenciSinif) {

        this.ogrenciSinif = ogrenciSinif;

    }

    @Override

    public String toString() {

        return "Ogrenci{" +

                "ogrenciAd='" + ogrenciAd + '\'' +

                ", ogrenciSoyad='" + ogrenciSoyad + '\'' +

                ", ogrenciId='" + ogrenciId + '\'' +

                ", ogrenciYas=" + ogrenciYas +

                ", ogrenciNumara=" + ogrenciNumara +

                ", ogrenciSinif=" + ogrenciSinif +

                '}';

    }

}


