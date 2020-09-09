package furnitureshop;

public interface IKarpitosButorok {

    Huzat getHuzat();
    Szin getSzin();

    void setHuzat(Huzat ujHuzat);
    void setSzin(Szin ujSzin);

    boolean bevizsgal();
}
