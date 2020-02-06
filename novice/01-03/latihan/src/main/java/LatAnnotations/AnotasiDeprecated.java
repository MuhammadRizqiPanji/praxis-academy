package LatAnnotations;

/*
* @deprecated untuk method Akusukakamu adalah method lawas
* Digunakan untuk menandai bahwa elemen yang ditandai sudah tidak digunakan lagi, mungkin karena suatu alasan dari developer. 
* Kita menggunakan tag @deprecated untuk mendocumentasikannya.
* Salah satu fungsinya untuk cek support versi library yang tidak mendukung, sebagai contoh input scanner sudah versi baru
* tetapi kita masih menuliskan yang lama dengan anotasi @Deprecated program kita bisa dijalankan.
*/



public class AnotasiDeprecated{
    @Deprecated
    public void Akusukakamu(){
        System.out.println("Aku suka kamu");
    }

    public static void main(String[] args){
        AnotasiDeprecated dep1 = new AnotasiDeprecated();
        dep1.Akusukakamu();
    }
}