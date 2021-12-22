package kuis;

public class PersegiPanjang implements BangunDatar{

    private Double panjang;
    private Double lebar;

    public PersegiPanjang(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitungLuas() {
        System.out.println(panjang*lebar);
    }

    @Override
    public void hitungKeliling() {
        System.out.println(2*(panjang+lebar));
    }

}