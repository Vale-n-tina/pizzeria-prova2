package it.epicode.pizzeria_prova2.bevande;

import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda extends VoceMenu {
    private int calorie;

public Bevanda(long id, String nome, double prezzo, int calorie) {
    super(id,nome, prezzo);
    this.calorie = calorie;
}
    @Override
    public String toString() {
        return  getNome() ;
    }
}


