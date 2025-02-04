package it.epicode.pizzeria_prova2.topping;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping {
  private String nome;
    private int calorie;
    private double prezzo;
}
