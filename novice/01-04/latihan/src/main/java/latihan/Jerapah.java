package latihan;

public class Jerapah extends Hewan {
    public Jerapah(String jenis, String food) {
        super(jenis, food);
    }

    @Override
    public String makan() {
        return "Jerapah " + super.makan();
    }

    @Override
    public String minum() {
        return "Jerapah " + super.minum();
    }
}
