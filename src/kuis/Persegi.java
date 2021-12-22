package kuis;

public class Persegi implements BangunDatar {

    private Double sisi;

    public Persegi(Double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        System.out.println(sisi*sisi);
    }

    @Override
    public void hitungKeliling() {
        System.out.println(4.0 * sisi);
    }
    
}