package latihan;

public class Kucing extends Hewan {

        public Kucing(String jenis, String food) {
                super(jenis, food);
        }

        @Override
        public String makan() {
                return "kucing " + super.makan();
        }

        @Override
        public String minum() {
                return "kucing " + super.minum();
        }
}
