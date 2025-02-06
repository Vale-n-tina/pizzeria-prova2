package it.epicode.pizzeria_prova2.alimento;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoceMenu {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double prezzo;

    @Override
    public String toString() {
        return getNome();
    }
}
