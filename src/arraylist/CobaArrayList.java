package arraylist;

import java.util.ArrayList;

public class CobaArrayList{
    
    public static void main(String[] args){
        //buat arraylist dengan nama bilangan untuk
        //menampung bilangan bulat
        ArrayList<Integer> bilangan = new ArrayList<Integer>();

        
        //tambahkan angka kelipatan 10 dimulai dari 10
        //sebanyak 5 angka di arraylist yang sudah dibuat
            bilangan.add(10);
            bilangan.add(20);
            bilangan.add(30);
            bilangan.add(40);
            bilangan.add(50);

        
        //hapus angka di posisi ketiga pada arraylist
            bilangan.remove(2);

        
        //munculkan angka yang ada di posisi kedua dan ketiga
        System.out.println(bilangan.get(1));
        System.out.println(bilangan.get(2));
    }
}