package it.epicode.pizzeria_prova2.menu;

import it.epicode.pizzeria_prova2.bevande.Bevanda;
import it.epicode.pizzeria_prova2.pizze.Pizza;
import it.epicode.pizzeria_prova2.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private String nome;
    List<Pizza> pizze=new ArrayList<>();
    List<Bevanda> bevande=new ArrayList<>();
    List<Topping> toppings;
}
