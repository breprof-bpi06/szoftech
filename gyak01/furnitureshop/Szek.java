package furnitureshop;


public class Szek extends Butor implements IKarpitosButorok {
    protected int labakSzama;
    protected Huzat huzat;
    protected Szin szin;

    public Szek(KozosTulajdonsagok kozosTulajdonsagok, int labakSzama) {
        super(kozosTulajdonsagok);
        this.labakSzama = labakSzama;
        this.tipusNev = "Luca";
    }

    public int getLabakSzama() {
        return labakSzama;
    }

    @Override
    public Huzat getHuzat() {
        return huzat;
    }

    @Override
    public Szin getSzin() {
        return szin;
    }

    @Override
    public void setHuzat(Huzat ujHuzat) {
        this.huzat = ujHuzat;
    }

    @Override
    public void setSzin(Szin ujSzin) {
        this.szin = ujSzin;
    }

    @Override
    public boolean bevizsgal() {
        return true;
    }
}
