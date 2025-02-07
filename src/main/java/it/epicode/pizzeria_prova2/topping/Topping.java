package it.epicode.pizzeria_prova2.topping;


import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import it.epicode.pizzeria_prova2.pizze.Pizza;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping extends VoceMenu {
    private int calorie;
    @ManyToMany(mappedBy = "toppings")
    private List<Pizza>  pizza;

    public Topping (long id,String nome, double prezzo, int calorie, List<Pizza> pizza) {
        super(id,nome, prezzo);
        this.calorie = calorie;
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return  getNome() ;
    }
}
