package composition;

public class Roda{
    private String merekRoda;
    
    //buat konstruktor dari atribut yang akan ada
    Roda(String merekRoda) {
        this.merekRoda = merekRoda;
    }
    //buatlah getter dan setter sesuai dengan atribut yang akan ada


    public void setMerekRoda(String merekRoda) {
        this.merekRoda = merekRoda;
    }

    public String getMerekRoda() {
        return merekRoda;
    }
}