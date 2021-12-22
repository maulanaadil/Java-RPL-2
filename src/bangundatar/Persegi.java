package bangundatar;

public class Persegi extends BangunDatar{
    //berikan atribut yang tepat
    private Double sisi;
    
    //implementasi method yang ada

    public Persegi(Double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println(luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = 4.0 * sisi;
        System.out.println(keliling);
    }
    @Override
    public void siapaKamu(){
        System.out.println("Saya Persegi");
    }
    
}