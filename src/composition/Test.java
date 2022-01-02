package composition;

public class Test{
    
    public static void main(String[] args){
        //instansiasi objek dari kelas yang dibutuhkan
        //merek mobil: BMW; merek roda: BridgeStone

        Roda roda = new Roda("BridgeStone");

        //relasikan dua kelas tersebut dalam bentuk composition
        Mobil mobil = new Mobil("BMW", roda);


        //tampilkan merek mobil dan merek roda
        System.out.println(mobil.getMerekMobil());
        System.out.println(mobil.getRoda().getMerekRoda());
        
    }
}