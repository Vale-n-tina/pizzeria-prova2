package it.epicode.pizzeria_prova2.topping;

import it.epicode.pizzeria_prova2.pizze.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Bean
    public Topping abbondanteMozz(){
      Topping t=new Topping();
       t.setNome("Abbondante Mozz");
        t.setPrezzo(1.99);
        t.setCalorie(40);
        return t;
       // return new Topping("Abbondante Mozz", 40, 1.99);
    }
    @Bean
    public Topping salame(){
        Topping t=new Topping();
        t.setNome("salame");
        t.setPrezzo(0.99);
        t.setCalorie(20);
        return t;
    }
}
