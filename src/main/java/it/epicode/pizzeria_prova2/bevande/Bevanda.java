package it.epicode.pizzeria_prova2.bevande;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda {
    private String nome;
    private int calorie;
    private double prezzo;
}


