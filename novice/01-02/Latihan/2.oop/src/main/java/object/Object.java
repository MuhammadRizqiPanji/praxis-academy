package object;

/**
 * Object
 */

class Mahasiswa {
     String nama;
     int NIM;
     String jurusan;
 }

public class Object {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Muhammad Rizqi";
        mahasiswa1.NIM = 311410578;
        mahasiswa1.jurusan = "Teknik Informatika";
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
    }
    

    
}