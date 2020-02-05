package programku;
import java.util.Scanner;


public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //aritmatic operator
        System.out.print("Masukan angka pertama :");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukan angka kedua: ");
        int x = Integer.parseInt(scanner.nextLine());
        int hasilTambah = x + y;
        int hasilKurang = x - y;
        int hasilKali = x * y;
        int hasilBagi = x / y;
        int hasilModulus = x % y;
        System.out.println("x + y = " + hasilTambah);
        System.out.println("x - y = " + hasilKurang);
        System.out.println("x * y = " + hasilKali);
        System.out.println("x / y = " + hasilBagi);
        System.out.println("x % y = " + hasilModulus);
        

    }
}