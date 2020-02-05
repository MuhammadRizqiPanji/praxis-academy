package src.programku;

public class Konstanta {
    public static void main (String[] args) {
        final String nama = "Muhammad Rizqi Panji Utama";
        final int thnLahir = 1995;
        int umurku = 2019 - thnLahir;
        System.out.println("Hallo Nama Saya " + nama + 
        " saya lahir tahun " + thnLahir + " dan umur saya sekarang : " + umurku);
    }
}


//cara compile PS G:\praxis-academy\novice\01-01\src> javac programku\Konstanta.java -d ..\bin
// cara running PS G:\praxis-academy\novice\01-01\bin> java programku.Konstanta

//setiap kali ada save'an baru ada upadate baru maka harus di compile lagi