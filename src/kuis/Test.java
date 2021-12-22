package kuis;


import java.util.Scanner;

public class Test{
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double sisi = scanner.nextInt();
        double panjang = scanner.nextInt();
        double lebar = scanner.nextInt();

        Persegi persegi = new Persegi(sisi);
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        
        
        //buat output yang sesuai dengan menggunakan objek yang sudah dibuatkan

        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
        
    }
}