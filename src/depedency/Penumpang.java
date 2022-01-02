package depedency;

public class Penumpang{
    private String namaPenumpang;
    Bus bus;

    //buat konstruktor dari atribut yang akan ada
    Penumpang(Bus bus) {
        this.bus = bus;
    }
    
    //buatlah getter dan setter sesuai dengan atribut yang akan ada

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }
}