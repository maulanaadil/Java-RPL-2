package agregation;

public class RakBuku{
    private String merekRak;
    Buku buku;
    
    //buat konstruktor dari atribut yang akan ada
    RakBuku(String merekRak, Buku buku) {
        this.merekRak = merekRak;
        this.buku = buku;
    }
    //buatlah getter dan setter sesuai dengan atribut yang akan ada
    public void setMerekRak(String merekRak) {
        this.merekRak = merekRak;
    }

    public String getMerekRak() {
        return merekRak;
    }
}