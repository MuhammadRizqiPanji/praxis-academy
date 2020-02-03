package programku;

public class Ternaryoperators{
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int result = (x > 10) ? x : y;
        System.out.println("result 1 = " + result);

        result = (y > 10) ? x : y;
        System.out.println("result 2 = " + result);
    }
}