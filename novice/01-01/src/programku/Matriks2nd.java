package programku;
import java.util.Scanner;

public class Matriks2nd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Angka Matriks A ke 1 : ");
        int angka00 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukan Angka Matriks A ke 2 : ");
        int angka01 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukan Angka Matriks A ke 3 : ");
        int angka02 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukan Angka Matriks A ke 4 : ");
        int angka03 = Integer.parseInt(scanner.nextLine());
        System.out.println("========================");
        System.out.print("Masukan Angka Matriks B ke 1 : ");
        int number00 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukan Angka Matriks B ke 2 : ");
        int number01 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukan Angka Matriks B ke 3 : ");
        int number02 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukan Angka Matriks B ke 4 : ");
        int number03 = Integer.parseInt(scanner.nextLine());

        System.out.println("========================");
        System.out.println("Matriks A");
        System.out.println("{"+ angka00 + "," + angka01 + "}" + "\n" + "{" + angka02 + "," + angka03 + "}");

        System.out.println("========================");
        System.out.println("Matriks B");
        System.out.println("{"+ number00 + "," + number01 + "}" + "\n" + "{" + number02 + "," + number03 + "}");

        System.out.println("========================");
        System.out.println("Maka Hasil Penjumlahan Matriks A + Matriks B Adalah : ");

        int[][]matriksA = new int[][]{
            {angka00,angka01},
            {angka02,angka03}
        };
        int[][]matriksB = new int[][]{
            {number00,number01},
            {number02,number03}
        };

        int[][]penjumlahan = new int[2][2];
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++ ){
                penjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(penjumlahan[i][j]+" ");
            }
            System.out.println("");
        }
    }
}