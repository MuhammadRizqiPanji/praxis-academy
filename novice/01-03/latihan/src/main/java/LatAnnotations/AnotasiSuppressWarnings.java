package LatAnnotations;

/*
* @SuppressWarnings — Digunakan untuk tidak memunculkan pesan peringatan, misalnya kita menggunakan method yang telah deprecated, 
* kita bisa menggunakan annotation ini untuk menghilangkan pesan peringatan bahwa 
* method yang kita pakai adalah deprecated :
*/



class CobaDeprecated{
    @Deprecated
    public void Akusukakamu(){
        System.out.println("Aku suka kamu");
    }
}

class Lawas {
    public void Cobain(){
        int a,b,hasil;
        a = 10;
        b = 20;
        hasil = a * b;
        System.out.println(hasil);
    }
}

public class AnotasiSuppressWarnings{
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        CobaDeprecated dep1 = new CobaDeprecated();
        dep1.Akusukakamu();
        
        Lawas dep2 = new Lawas();
        dep2.Cobain();
    }
}