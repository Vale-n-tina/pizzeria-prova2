package it.epicode.pizzeria_prova2.alimento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoceMenu {
    private String nome;
    private double prezzo;

    @Override
    public String toString() {
        return getNome();
    }
}
