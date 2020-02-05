package main.java.rumahsakit;

/**
 * CrcDokter
 */
public class CrcDokter extends CrcAppRs {
    String DokterUmum;
    String DokterMata;
    String DokterGinjal;
    String DokterGigi;

    CrcDokter(String inputDokterUmum, String inputDokterMata, String inputDokterGinjal, String inputDokterGigi) {
        DokterUmum = inputDokterUmum;
        DokterMata = inputDokterMata;
        DokterGinjal = inputDokterGinjal;
        DokterGigi = inputDokterGigi;
    }
}