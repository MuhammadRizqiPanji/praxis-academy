package latihan;
import java.util.Scanner;

public class VendingMachine extends Kfc {


    public static void main(String[]args){
        Scanner masukan  = new Scanner(System.in);
        int pilih = 0;
        int pilihan = 0;
        System.out.println("=============================================");
        System.out.println("\t Have a nice day, Pilih Pesanan kamu.");
        System.out.println("==============================================");
        System.out.println("[1]. Paket Combo 1 : Nasi + Dada Ayam + Coca-Cola" );
        System.out.println("[2]. Paket Combo 2 : Nasi + Sayap Ayam + Fanta" );
        pilih = masukan.nextInt();

        if(pilih > 5){
            System.out.println("Silahkan pilih menu nomer 1 sampai 5");
        }else {
            switch (pilih){
                case 1:

                     PaketCombo1 combo1 = new PaketCombo1();
                     System.out.println("==============================================");
                     int cmb1 = combo1.PaketCombo1();
                     System.out.println(cmb1);
                     System.out.println("==============================================");
                     System.out.println("Masukan uangmu disini");
                     Kembalian kembali = new Kembalian();
                     int kmbl = kembali.KembalianPaketCombo1();
                     System.out.println("==============================================");
                     break;
            }
        }
    }
}
