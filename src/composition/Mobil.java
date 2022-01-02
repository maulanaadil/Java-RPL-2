package composition;


public class Mobil {
    private String merekMobil;
    private Roda roda; // composition

    //buat konstruktor dari atribut yang akan ada
    public Mobil(String merekMobil, Roda roda) {
        this.merekMobil = merekMobil;
        this.roda = roda;
    }

    //buatlah getter dan setter sesuai dengan atribut yang akan ada


    public Roda getRoda() {
        return roda;
    }

    public void setMerekMobil(String merekMobil) {
        this.merekMobil = merekMobil;
    }

    public String getMerekMobil() {
        return merekMobil;
    }
}