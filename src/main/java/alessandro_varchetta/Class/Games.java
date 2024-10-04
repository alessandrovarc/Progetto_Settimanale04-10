package alessandro_varchetta.Class;

import java.time.LocalDate;

public abstract class Games {

    private int id;
    private String titolo;
    private int annoDiPubblicazione;
    private double price;

    public Games (int id, String titolo, int annoDiPubblicazione, double price) {
        this.id = id;
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }



    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", price=" + price +
                '}';
    }
}
