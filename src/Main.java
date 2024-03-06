import esercizio1.Rettangolo;
import esercizio2.SIM;
import esercizio2.Chiamata;
import esercizio3.Articolo;
import esercizio3.Cliente;
import esercizio3.Carrello;
import java.time.LocalDate; // googlata, per  che fornisce una vasta gamma di
// classi per gestire date, orari, istanti e la loro durata in modo più
// intuitivo e preciso rispetto alle precedenti API di gestione delle date in Java.
public class Main {
    public static void main(String[] args) {
        // Esercizio Rettangolo
        eseguiEsercizioRettangolo();

        // Esercizio SIM
        eseguiEsercizioSIM();

        // Esercizio E-Commerce
        eseguiEsercizioECommerce();
    }

    private static void eseguiEsercizioRettangolo() {
        Rettangolo rettangolo1 = new Rettangolo(4.0, 5.0);
        Rettangolo rettangolo2 = new Rettangolo(3.0, 6.0);

        stampaRettangolo(rettangolo1);
        stampaRettangolo(rettangolo2);
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }

    private static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Area: " + rettangolo.calcolaArea() + ", Perimetro: " + rettangolo.calcolaPerimetro());
    }

    private static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        stampaRettangolo(rettangolo1);
        stampaRettangolo(rettangolo2);
        System.out.println("Somma aree: " + (rettangolo1.calcolaArea() + rettangolo2.calcolaArea()) +
                ", Somma perimetri: " + (rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro()));
    }

    private static void eseguiEsercizioSIM() {
        SIM sim = new SIM("1234567890");
        sim.aggiungiChiamata(new Chiamata(5, "0987654321"));
        sim.aggiungiChiamata(new Chiamata(3, "1231231234"));
        sim.aggiungiChiamata(new Chiamata(10, "4564564567"));

        sim.stampaDatiSIM();
    }
    private static void eseguiEsercizioECommerce() {
        Cliente cliente = new Cliente("CL001", "Mario", "Rossi", "mario.rossi@email.com", LocalDate.of(2022, 1, 1));
        Articolo articolo1 = new Articolo("ART001", "Smartphone XYZ", 299.99, 10);
        Articolo articolo2 = new Articolo("ART002", "Laptop ABC", 599.99, 5);

        Carrello carrello = new Carrello(cliente);
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);

        // Stampa i dettagli del carrello
        System.out.println("Dettagli carrello per il cliente: " + cliente.getNome() + " " + cliente.getCognome());
        for (Articolo articolo : carrello.getArticoli()) {
            System.out.println("Articolo: " + articolo.getDescrizione() + ", Prezzo: " + articolo.getPrezzo() + "€, Codice: " + articolo.getCodiceArticolo());
        }
        System.out.println("Totale costo articoli nel carrello: " + carrello.getTotaleCosto() + "€");
    }
}
