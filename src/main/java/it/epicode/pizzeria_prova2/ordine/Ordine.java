package it.epicode.pizzeria_prova2.ordine;

import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import it.epicode.pizzeria_prova2.menu.Menu;
import it.epicode.pizzeria_prova2.tavolo.Tavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ordine {
    private Tavolo tavolo;
    private List<VoceMenu> ordinazioni=new ArrayList<>();
    private StatoOrdine stato;
    private int coperti;
    private LocalDateTime data=LocalDateTime.now();
    private static double costoCoperto;
    private double prezzoTotale=0;


    public double prezzoTotale(){
        double totaleOrdini= ordinazioni.stream().mapToDouble(VoceMenu::getPrezzo).sum();
        return totaleOrdini+costoCoperto*coperti;
    }

    public Ordine (Tavolo tavolo, List<VoceMenu> ordinazioni, StatoOrdine stato, int coperti){
        this.tavolo=tavolo;
        this.ordinazioni=ordinazioni;
        this.stato=stato;
        this.coperti=coperti;
        this.prezzoTotale=prezzoTotale();
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Ordine{\n" +
                "  Tavolo: " + tavolo + ",\n" +
                "  Ordinazioni: " + ordinazioni + ",\n" +
                "  Stato: '" + stato + "',\n" +
                "  Coperti: " + coperti + ",\n" +
                "  Data: " + data.format(formatter) + ",\n" +
                "  Prezzo Totale: " + prezzoTotale + "\n" +
                "}";
    }
}
