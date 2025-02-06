package it.epicode.pizzeria_prova2.tavolo;

import it.epicode.pizzeria_prova2.ordine.Ordine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private int numeroTavolo;
    private int coperti;
    private StatoTavolo stato;
    @OneToMany
    private List<Ordine> ordini;

    public Tavolo(int numeroTavolo, int coperti, StatoTavolo stato) {
        this.numeroTavolo = numeroTavolo;
        this.coperti = coperti;
        this.stato = stato;
        this.ordini = new ArrayList<>();
    }
}
