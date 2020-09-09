package furnitureshop;

import java.time.LocalDateTime;

public abstract class Butor {
    protected KozosTulajdonsagok kozosTulajdonsagok;

    private static int sequence = 0;
    private int id;

    protected String tipusNev;

    public int getId() {
        return id;
    }

    public Butor(KozosTulajdonsagok kozosTulajdonsagok) {
        this.kozosTulajdonsagok = kozosTulajdonsagok;
        this.id = ++sequence;
    }

    public int getSzelesseg() {
        return kozosTulajdonsagok.szelesseg;
    }

    public int getHosszusag() {
        return kozosTulajdonsagok.hosszusag;
    }

    public int getMagassag() {
        return kozosTulajdonsagok.magassag;
    }

    public String getTipusNev() {
        return tipusNev;
    }

    public Anyag getAnyag() {
        return kozosTulajdonsagok.anyag;
    }

    public GyartasiHely getGyartasiHely() {
        return kozosTulajdonsagok.gyartasiHely;
    }

    public LocalDateTime getGyartasiIdo() {
        return kozosTulajdonsagok.gyartasiIdo;
    }
}
