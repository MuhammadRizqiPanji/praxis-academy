package main.java.rumahsakit;

/**
 * CrcPasien
 */
public class CrcPasien extends CrcAppRs {
    String namaPasien;
    int umurPasien;
    String alamatPasien;
    String rekamMedis;

    CrcPasien(String inputNamaPasien, int inputUmurPasien, String inputAlamatPasien, String inputRekamMedis) {
        namaPasien = inputNamaPasien;
        umurPasien = inputUmurPasien;
        alamatPasien = inputAlamatPasien;
        rekamMedis = inputRekamMedis;

        System.out.println(namaPasien);
        System.out.println(umurPasien);
        System.out.println(alamatPasien);
        System.out.println(rekamMedis);
    }

}