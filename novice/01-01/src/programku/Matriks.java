package programku;

public class Matriks{
    public static void main(String[] args) {
        int[][]matriksA = new int[][]{
            {3,2},
            {4,5}
        };
        int[][]matriksB = new int[][]{
            {5,4},
            {6,8}
        };

        int penjumlahan[][] = new int[2][2];

        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++ ){
                penjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(penjumlahan[i][j]+" ");
            }
            System.out.println("");
        }
    }
}