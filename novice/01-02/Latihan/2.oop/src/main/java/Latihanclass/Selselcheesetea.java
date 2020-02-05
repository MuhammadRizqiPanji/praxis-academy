package Latihanclass;

/**
 * Selselcheesetea
 */

 class Menu{
     int Greentea = 12000;
     int Coffesmack = 10000;
     int Thaitea = 10000;
     int Purplerain = 10000;
     int Skymarine = 10000;
     int Manggo = 10000;
     int Durian = 10000;
     int Vanilla = 10000;
     int xtraToppingBoba = 3000;
     int xtraBuble = 3000;
     int xtraCheesecream = 3000;
    
     void greenTeaExtraToppingBoba() {
         Greentea = Greentea + xtraToppingBoba;
         System.out.println("Kamu Membeli Selsel Chesee Tea Dengan Rasa Green Tea, Jadi Yang Harus Kamu Bayar = Rp. " + Greentea);
     }

 }

public class Selselcheesetea {

    public static void main(String[] args) {
        Menu pembeli1 = new Menu();
        PaketMewah pembeli2 = new PaketMewah();
        

        pembeli1.greenTeaExtraToppingBoba();
        pembeli2.greenTeaToppingLengkap();
    }
    
    
}