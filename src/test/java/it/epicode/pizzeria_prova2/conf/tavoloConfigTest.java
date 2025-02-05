package it.epicode.pizzeria_prova2.conf;

import it.epicode.pizzeria_prova2.tavolo.StatoTavolo;
import it.epicode.pizzeria_prova2.tavolo.Tavolo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class tavoloConfigTest {
    @Autowired
    private Tavolo tavolo1;
    @Autowired
    private Tavolo tavolo2;
    @Autowired
    private Tavolo tavolo3;

    @ParameterizedTest
    @CsvSource({"LIBERO, OCCUPATO,", "OCCUPATO, LIBERO,"})
    void testCambioStatoTavolo(StatoTavolo statoIniziale, StatoTavolo statoFinale) {
        Tavolo tavolo=new Tavolo(1,4,statoIniziale);
        tavolo.setStato(statoFinale);
        assertEquals(statoFinale, tavolo.getStato());

    }

    @Test
    @DisplayName("verifica dati inseriti corretti")
    public void testTavoloBean() {

        assertEquals(1, tavolo1.getNumeroTavolo());
        assertEquals(2, tavolo2.getNumeroTavolo());
        assertEquals(3, tavolo3.getNumeroTavolo());
    }
}
