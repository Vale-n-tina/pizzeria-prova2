package it.epicode.pizzeria_prova2.pizze;


import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import it.epicode.pizzeria_prova2.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza extends VoceMenu {
    private int calorie;
    private List<Topping> toppings=new ArrayList<>();

    @Override
    public String toString() {
        return  getNome() + " " + toppings;
    }
}
