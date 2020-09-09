package furnitureshop;


import java.time.LocalDateTime;

public class Asztal extends Butor {

    public Asztal() {
        this(new KozosTulajdonsagok(90, 75,20,Anyag.FENYO,  GyartasiHely.GYOR, LocalDateTime.now()));
    }

    public Asztal(LocalDateTime gyartasiIdo, GyartasiHely gyartasiHely) {
        this(new KozosTulajdonsagok(90, 75,20,Anyag.FENYO, gyartasiHely, gyartasiIdo));
    }

    public Asztal(KozosTulajdonsagok kozosTulajdonsagok) {
        super(kozosTulajdonsagok);
        this.tipusNev = "Magor";
    }
}
