package latihan;

public class Hewan {

    String jenis;
    String food;

    public Hewan(String jenis, String food){
        this.jenis = jenis;
        this.food = food;
    }

    public String makan(){

        return jenis + " memakan " + food;
    }

    public String minum(){

        return "minum";
    }

}
