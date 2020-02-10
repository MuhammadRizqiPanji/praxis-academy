package json;

import com.google.gson.Gson;

public class GsonPengusaha {

    public static void main(String[] args) {
        Pengusaha pengusaha=new Pengusaha();
        pengusaha.setNamaDepan("Rizqi");
        pengusaha.setNamaBelakang("Panji");
        pengusaha.setUmur(23);
        pengusaha.setAlamat("Gcc");

        Gson gson=new Gson();
        String jsonPengusaha=gson.toJson(pengusaha);

        System.out.println(jsonPengusaha);
    }
}
