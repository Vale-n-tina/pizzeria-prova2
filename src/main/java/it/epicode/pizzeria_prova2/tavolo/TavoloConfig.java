package it.epicode.pizzeria_prova2.tavolo;

import it.epicode.pizzeria_prova2.ordine.Ordine;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@RequiredArgsConstructor
@Configuration
public class TavoloConfig {
    private final Ordine ordine;
    @Bean
    public Tavolo tavolo1() {
        return new Tavolo(1,6, StatoTavolo.OCCUPATO)    ;
    }
    @Bean
    public Tavolo tavolo2() {
        return new Tavolo(2,4,StatoTavolo.OCCUPATO);
    }
    @Bean
    public Tavolo tavolo3() {
        return new Tavolo(3,8,StatoTavolo.LIBERO);
    }
}
