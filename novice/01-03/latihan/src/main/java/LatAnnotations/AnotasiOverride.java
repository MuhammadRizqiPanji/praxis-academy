package LatAnnotations;

/**
 * @Override 
 * Anotasi ini memeriksa bahwa metode yang dijelaskan adalah metode yang diganti. 
 * Method Bucin mengalami perubahan dalam isinya.
 */

class AnotasiOverride{
    public void Bucin(){
        System.out.println("Sekarang aku belum mencintaimu, ga tau kalau nanti sore");
    }
    public static void main(String[] args){
        AnotasiOverride ano1 = new Dolan1995();
        ano1.Bucin();
        
    }
}

class Dolan1995 extends AnotasiOverride{
    @Override
    public void Bucin(){
        System.out.println("Sudah sore, Sekarang aku mencintaimu");
    }
}