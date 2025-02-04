package it.epicode.pizzeria_prova2.bevande;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfig {
    @Bean
    public Bevanda aranciata(){
        Bevanda b=new Bevanda();
        b.setNome("Aranciata");
        b.setCalorie(20);
        b.setPrezzo(3.99);
        return b;
    }
    @Bean
    public Bevanda cocaCola(){
        Bevanda b=new Bevanda();
        b.setNome("CocaCola");
        b.setCalorie(100);
        b.setPrezzo(4.99);
        return b;
    }



}
