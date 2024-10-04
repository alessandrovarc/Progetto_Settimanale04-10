package Class;

import java.time.LocalDate;

public abstract class Games {

    private int id;
    private String titolo;
    private LocalDate annoDiPubblicazione;
    private double price;

    public Games (int id, String titolo, LocalDate annoDiPubblicazione, double price) {
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

    public LocalDate getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
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

    public void setAnnoDiPubblicazione(LocalDate annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
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
