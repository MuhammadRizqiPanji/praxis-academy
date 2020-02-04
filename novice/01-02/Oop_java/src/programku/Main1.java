package programku;

//membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String Jurusan;
    double IPK;
    int Umur;
}
public class Main1 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa(); //mahasiswa yang diujung warna kuning berasal dari classnya
        mahasiswa1.nama = "Rizqi";
        mahasiswa1.NIM = "311410578";
        mahasiswa1.Jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.Umur = 24;
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.Umur);


        Mahasiswa mahasiswa2 = new Mahasiswa(); //mahasiswa yang diujung warna kuning berasal dari classnya
        mahasiswa2.nama = "Gracesia";
        mahasiswa2.NIM = "311410579";
        mahasiswa2.Jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 4.0;
        mahasiswa2.Umur = 21;
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.Jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.Umur);
    }
}