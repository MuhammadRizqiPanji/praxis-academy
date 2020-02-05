package InterfaceLat;

public class BukuBagus implements Buku{

    @Override
    public void cover() {
        System.out.println("Covernya adalah George Orwell img");
    }
    
    @Override
    public void judul() {
        System.out.println("Judul Buku Bagaimana si Miskin mati");
    }
    
    @Override
    public void bab() {
        System.out.println("Bab 1 adalah \" Hukuman Gantung \"");
    }
    
    public static void main(final String[] args) {
            final BukuBagus bBagus = new BukuBagus();
        bBagus.cover();
        bBagus.judul();
        bBagus.bab();
    }
}
    