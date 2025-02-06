package it.epicode.pizzeria_prova2.menu;

import it.epicode.pizzeria_prova2.bevande.Bevanda;
import it.epicode.pizzeria_prova2.pizze.Pizza;
import it.epicode.pizzeria_prova2.topping.Topping;
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
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToMany
    List<Pizza> pizze=new ArrayList<>();
    @OneToMany
    List<Bevanda> bevande=new ArrayList<>();
    @OneToMany
    List<Topping> toppings;
}
