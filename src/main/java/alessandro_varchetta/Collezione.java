package alessandro_varchetta;


import alessandro_varchetta.Class.Games;

import java.util.ArrayList;
import java.util.List;

public class Collezione {

    private List<Games> gioco;

    public Collezione() {
        this.gioco = new ArrayList<>();
    }
    public List<Games> getGioco() {
        return gioco;
    }

    public void aggiungiGioco (Games games) {
        boolean idGiaEsistente = gioco.stream().anyMatch(games1 -> games1.getId() == games.getId());
        if (idGiaEsistente) {
            throw new IllegalArgumentException("questo id è già stato utilizzato" + games.getId());
        } else {
            gioco.add(games);
        }
    }
}
