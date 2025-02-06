package it.epicode.pizzeria_prova2.pizze;


import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import it.epicode.pizzeria_prova2.topping.Topping;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza extends VoceMenu {
    private int calorie;
    @OneToMany
    private List<Topping> toppings=new ArrayList<>();


    public Pizza( long id,String nome, int calorie, double prezzo, List<Topping> toppings) {
        super(id,nome, prezzo);
        this.calorie = calorie;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return  getNome() + " " + toppings;
    }
}
