package latihan;

public class MainHewan {
    public static void main(String[]args){
        Kucing kucing = new Kucing("KARNIVORA", "DAGING");
        String resMakan = kucing.makan();
        System.out.println(resMakan);

        Monyet kucing2 = new Monyet("HERBIVORA", "SAYUR");
        String resMakan2 = kucing2.makan();
        String resMinum = kucing2.minum();
        System.out.println(resMakan2);
        System.out.println(resMinum);

        Jerapah jerapah1 = new Jerapah("HERBIVORA", "BUAH DAN SAYUR");
        String jerMakan = jerapah1.makan();
        System.out.println(jerMakan);


    }
}
