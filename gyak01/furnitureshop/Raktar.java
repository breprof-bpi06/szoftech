package furnitureshop;

import java.util.ArrayList;
import java.util.List;

public class Raktar {

    private List<Butor> butorok = new ArrayList<>();



    public void addButor(Butor butor) {
        butorok.add(butor);
    }

    public void removeButor(Butor butor) {
        butorok.remove(butor);
    }

    public List<Butor> keresTipusSzerint(String tipus) {
        List<Butor> talalatok = new ArrayList<>();
        for(Butor butor : butorok) {
            if(butor.tipusNev.equals(tipus)) {
                talalatok.add(butor);
            }
        }
        return talalatok;
    }

    public Butor keresIDSzerint(int id) {
        for(Butor butor : butorok) {
            if(butor.getId() == id) {
                return butor;
            }
        }
        return null;
    }

}
