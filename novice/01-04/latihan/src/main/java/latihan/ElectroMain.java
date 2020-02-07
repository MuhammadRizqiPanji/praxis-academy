package latihan;

public class ElectroMain {
    public static void main(String[]args){
    Samsung SmartphoneSamsung = new Samsung("Samsung", "Korea", 10);
    String electro1 = SmartphoneSamsung.Product();

    Samsung SmartphoneSamsung2 = new Samsung("Samsung", "Korea", 10);
    String electro2 = SmartphoneSamsung2.Pabrik();
    System.out.println(electro1);
    System.out.println(electro2);
    }

}
