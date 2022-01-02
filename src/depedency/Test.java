package depedency;

public class Test{
    
    public static void main(String[] args){
        //instansiasi objek dari kelas yang dibutuhkan
        //nama penumpang: Budi; nomor bus: 10
        Bus bus = new Bus();
        bus.setNomorBus("10");

        //relasikan dua kelas tersebut dalam bentuk dependency
        Penumpang penumpang = new Penumpang(bus);
        penumpang.setNamaPenumpang("Budi");


        //tampilkan nama penumpang dan nomor bus
        System.out.println(penumpang.getNamaPenumpang());
        System.out.println(penumpang.bus.getNomorBus());
        
    }
}