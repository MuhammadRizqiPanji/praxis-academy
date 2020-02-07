package latihan;

public class PaketCombo1 extends Kfc  {
    @Override
    public int PaketCombo1() {
        System.out.println("Pesanan kamu " + super.PaketCombo1Desc());
        System.out.println("Rp. ");
        return super.PaketCombo1() ;
    }
}
