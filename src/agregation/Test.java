package agregation;

public class Test{
    
    public static void main(String[] args){
        //instansiasi objek dari kelas yang dibutuhkan
        //merek rak: Olympic; judul buku: Harry Potter
        Buku buku = new Buku("Harry Potter");

        
        //relasikan dua kelas tersebut dalam bentuk aggregation
        RakBuku rakBuku = new RakBuku("Olympic", buku);

        //tampilkan merek rak dan judul buku
        System.out.println(rakBuku.getMerekRak());
        System.out.println(rakBuku.buku.getJudulBuku());
    }
}