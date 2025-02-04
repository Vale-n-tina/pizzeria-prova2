package it.epicode.pizzeria_prova2.pizze;


import it.epicode.pizzeria_prova2.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {
    private String nome;
    private int calorie;
    private double prezzo;
    private List<Topping> toppings=new ArrayList<>();

}
