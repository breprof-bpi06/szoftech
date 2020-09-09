package furnitureshop;

import java.time.LocalDateTime;

public class KozosTulajdonsagok {
    public int szelesseg;
    public int hosszusag;
    public int magassag;

    public Anyag anyag;

    public GyartasiHely gyartasiHely;
    public LocalDateTime gyartasiIdo;

    public KozosTulajdonsagok(int szelesseg, int hosszusag, int magassag, Anyag anyag, GyartasiHely gyartasiHely, LocalDateTime gyartasiIdo) {
        this.szelesseg = szelesseg;
        this.hosszusag = hosszusag;
        this.magassag = magassag;
        this.anyag = anyag;
        this.gyartasiHely = gyartasiHely;
        this.gyartasiIdo = gyartasiIdo;
    }

    KozosTulajdonsagok() {}
}
