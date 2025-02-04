package it.epicode.pizzeria_prova2.tavolo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TavoloConfig {
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
