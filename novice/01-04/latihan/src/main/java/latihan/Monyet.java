package latihan;

public class Monyet extends Hewan {
    public Monyet(String jenis, String food) {
        super(jenis, food);
    }

    @Override
    public String makan() {
        return "monyet " + super.makan();
    }

    @Override
    public String minum() {
        return "monyet " + super.minum();
    }
}
