package latihan;

public class Electronic {
    String namaProduct;
    String asalProduct;
    int jumlahPabrik;

    public Electronic(String namaProduct, String asalProduct, int jumlahPabrik){
        this.namaProduct = namaProduct;
        this.asalProduct = asalProduct;
        this.jumlahPabrik = jumlahPabrik;
    }

    public String Product(){

        return namaProduct +" Berasal dari "+ asalProduct;
    }

    public String Pabrik(){

        return namaProduct + " mempunyai "+ jumlahPabrik + " pabrik dibeberapa negara";
    }





}
