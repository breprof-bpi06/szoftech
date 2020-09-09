package furnitureshop;

import java.time.LocalDateTime;

public class KinyithatoAsztal extends Asztal {
    private boolean kinyitva = false;
    private int teljesHossz;

    public KinyithatoAsztal(int teljesHossz) {
        this.teljesHossz = teljesHossz;
    }

    public KinyithatoAsztal(LocalDateTime gyartasiIdo, GyartasiHely gyartasiHely, int teljesHossz) {
        super(gyartasiIdo, gyartasiHely);
        this.teljesHossz = teljesHossz;
    }

    public KinyithatoAsztal(KozosTulajdonsagok kozosTulajdonsagok, int teljesHossz) {
        super(kozosTulajdonsagok);
        this.teljesHossz = teljesHossz;
    }

    public int getTeljesHossz() {
        return teljesHossz;
    }

    @Override
    public int getHosszusag() {
        return kinyitva ? teljesHossz : super.getHosszusag();
    }
}
