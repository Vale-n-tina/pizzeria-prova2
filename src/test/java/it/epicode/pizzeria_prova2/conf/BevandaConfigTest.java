package it.epicode.pizzeria_prova2.conf;

import it.epicode.pizzeria_prova2.bevande.Bevanda;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BevandaConfigTest {
    @Autowired
    private Bevanda aranciata;
    @Autowired
    private Bevanda cocaCola;

    @Test
    @DisplayName("testBevandaBean")
    public void testBevandaBean() {
        assertEquals("Aranciata", aranciata.getNome());
        assertEquals(3.99, aranciata.getPrezzo());

    }

    @ParameterizedTest
    @CsvSource({"Aranciata, 3.99", "CocaCola, 4.99"})
    void testRestituzioneCorretta(String bevanda, double prezzo) {
        Bevanda b = new Bevanda();
        b.setNome(bevanda);
        b.setPrezzo(prezzo);
        assertEquals(prezzo, b.getPrezzo());
    }
    @ParameterizedTest
    @CsvSource({"Aranciata, 3.99", "CocaCola, 4.99"})
    void testPrezzo(String nomeBevanda, double prezzoAtteso) {
        Bevanda bevandaTestata=nomeBevanda.equals("Aranciata")?aranciata:cocaCola;
        assertEquals(prezzoAtteso, bevandaTestata.getPrezzo());
    }


}
