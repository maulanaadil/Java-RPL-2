package bangundatar;


public class PersegiPanjang extends BangunDatar{

    private Double panjang;
    private Double lebar;

    //berikan atribut yang tepat

    public PersegiPanjang(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //implementasi method yang ada
    @Override
    public void hitungLuas() {
        Double luas = panjang * lebar;
        System.out.println(luas);
    }

    @Override
    public void hitungKeliling() {
        Double keliling = 2 * (panjang + lebar);
        System.out.println(keliling);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Persegi Panjang");
    }

}