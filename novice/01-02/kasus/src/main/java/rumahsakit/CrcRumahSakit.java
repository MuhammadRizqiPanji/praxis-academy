package main.java.rumahsakit;

/**
 * CrcRumahSakit
 */
public class CrcRumahSakit extends CrcAppRs {
    int noKamar;
    String KamarVip;
    String KamarVvip;
    String KamarEkonomi;

    CrcRumahSakit(int inputNoKamar, String inputKamarVip, String inputKamarVvip, String inputKamarEkonomi) {
        noKamar = inputNoKamar;
        KamarVip = inputKamarVip;
        KamarVvip = inputKamarVvip;
        KamarEkonomi = inputKamarEkonomi;
    }
}