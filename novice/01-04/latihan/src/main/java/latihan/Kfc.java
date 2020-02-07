package latihan;

public class Kfc {
    String Nasi = "Nasi";
    String AyamDada = "Dada Ayam";
    String AyamSayap = "Sayap Ayam";
    String AyamPaha = "Paha Ayam";
    String Spagetti = "Spagetti Special";
    String Burger = "Burger Mozarella";
    String Cocacola = "Coca-cola";
    String Fanta = "Fanta";
    String Sprite = "Sprite";
    int HargaNasi = 5000;
    int HargaAyamDada = 10000;
    int HargaAyamSayap = 8000;
    int HargaAyamPaha = 8000;
    int HargaSpageti = 20000;
    int HargaBurger = 20000;
    int HargaCocacola = 5000;
    int HargaFanta = 5000;
    int HargaSprite = 5000;


    //Paket combo1 harga 20rb
    public int PaketCombo1(){
        int PaketCombo1 = HargaNasi + HargaAyamDada + HargaCocacola;
        return PaketCombo1;
    }

    public String PaketCombo1Desc()
    {
        return "Combo 1 : " + Nasi + ", " + AyamDada + ", " + Cocacola;
    }

    //Paket combo 2 harga 18rb
    public int PaketCombo2(){
        int PaketCombo2 = HargaNasi + HargaAyamSayap + HargaFanta;
        return PaketCombo2;
    }

    public String PaketCombo2Desc(){
        return "Combo 2 : " + Nasi + ", " + AyamSayap + ", " + Fanta;
    }

    //Paket combo 3 harga 18.000
    public int PaketCombo3(){
        int PaketCombo3 = HargaNasi + HargaAyamPaha + HargaSprite;
        return PaketCombo3;
    }

    public String PaketCombo3Desc(){
        return "Combo 2 : " + Nasi + ", " + AyamPaha + ", " + Sprite;
    }

    //Spagetti 20rb
    public int Spagetti(){
        int Spagetti = HargaSpageti;
        return Spagetti;
    }

    public String SpagettiDesc(){
        return "Spagetti : " + Spagetti;
    }

    //Burger 20rb
    public int Burger(){
        int Burger = HargaBurger;
        return Burger;
    }

    public String BurgerDesc(){
        return "Burger : " + Burger;
    }

}
