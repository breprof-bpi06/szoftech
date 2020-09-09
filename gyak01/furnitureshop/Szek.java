package furnitureshop;


public class Szek extends Butor {
    protected int labakSzama;

    public Szek(KozosTulajdonsagok kozosTulajdonsagok, int labakSzama) {
        super(kozosTulajdonsagok);
        this.labakSzama = labakSzama;
        this.tipusNev = "Luca";
    }

    public int getLabakSzama() {
        return labakSzama;
    }
}
