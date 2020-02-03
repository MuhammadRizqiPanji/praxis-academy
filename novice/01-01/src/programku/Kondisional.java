package programku;
import java.util.Scanner;

public class Kondisional{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = Integer.parseInt(scanner.nextLine());

        if(angka > 10){
            String[] akukamu = new String[]{"Aku","Dan","Kamu"};
            for(int i = 0; i < akukamu.length; i++){
                System.out.println(akukamu[i]);
            }
        }else if(angka < 10){
            System.out.println("Angkanya kurang dari 10");
        }else if(angka == 10){
            System.out.println("Angkanya 10");
        }
    }
}