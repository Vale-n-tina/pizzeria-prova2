package it.epicode.pizzeria_prova2.ordine;

import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import it.epicode.pizzeria_prova2.menu.Menu;
import it.epicode.pizzeria_prova2.tavolo.Tavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ordine {
    private Tavolo tavolo;
    private List<VoceMenu> ordinazioni=new ArrayList<>();
    private String stato;
    private int coperti;
    private LocalDateTime data;
    private static double costoCoperto;
    private double prezzoTotale=0;


    public double prezzoTotale(){
        double totaleOrdini= ordinazioni.stream().mapToDouble(VoceMenu::getPrezzo).sum();
        System.out.println(totaleOrdini);
        System.out.println(costoCoperto);
        System.out.println(coperti);
        return totaleOrdini+costoCoperto*coperti;
    }

    public Ordine (Tavolo tavolo, List<VoceMenu> ordinazioni, String stato, int coperti, LocalDateTime data){
        this.tavolo=tavolo;
        this.ordinazioni=ordinazioni;
        this.stato=stato;
        this.coperti=coperti;
        this.data=data;
        this.prezzoTotale=prezzoTotale();
    }
}
