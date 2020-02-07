package latihan;

import java.util.Scanner;

public class Kembalian extends Kfc {

    public int KembalianPaketCombo1(){
        public int Uang = 0;
        int SepuluhK = 10000;
        int DuapuluhK = 20000;
        int LimapuluhK = 50000;
        int SeratusK = 100000;
        int Combo1 = super.PaketCombo1();
        Scanner input  = new Scanner(System.in);
        Uang = input.nextInt();


            if(Uang == Combo1 ){
                System.out.println("Terimakasih, Silahkan Tunggu Pesanan Kamu Sedang Dibuatkan");
            }else if(Uang < Combo1){
                if(Uang == SepuluhK){
                    System.out.println("Anda Baru memasukan 10.000, Masukan 10.000 lagi");
                    Uang = input.nextInt();
                }
                System.out.println("Maaf Uang Anda Kurang, Uang anda Akan Dikembalikan\nMasukan Uang Pas ");
            } else if(Uang > Combo1){
                int hasil = Uang - Combo1;
                System.out.println("Terimakasih Silahkan Ambil Kembaliannya Rp. " + hasil +"\nSilahkan Tunggu Pesanannya");
//                return hasil;
            }


        return Uang;
    }

}
