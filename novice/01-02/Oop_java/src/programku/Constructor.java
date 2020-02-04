package programku;

//class tidak menggunakan constructor
class Polos {
    String dataString;
    int dataInteger;
}

//class menggunakan constructor
class Mahasiswa {
    String nama;
    int NIM;
    String jurusan;

    //constructor dengan parameter (constructor adalah sebuah method)
    Mahasiswa(String inputNama, int inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Rizqi", 311410578, "Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Chia", 311410577, "Teknik Informatika");

        // Polos objPolos = new Polos();
        // objPolos.dataString = "Kamu Polos";
        // objPolos.dataInteger = 12345;

        // System.out.println(objPolos.dataString);
        // System.out.println(objPolos.dataInteger);
    }
}