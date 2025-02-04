package it.epicode.pizzeria_prova2.topping;


import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping extends VoceMenu {
    private int calorie;

    public Topping(String nome, double prezzo, int calorie) {
        super(nome, prezzo);
        this.calorie = calorie;
    }
    @Override
    public String toString() {
        return  getNome() ;
    }
}
