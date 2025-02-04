package it.epicode.pizzeria_prova2.pizze;

import it.epicode.pizzeria_prova2.topping.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PizzaConfig {
    @Autowired
    private Topping salame;
    private Topping abbondanteMozz;
    @Bean
    public Pizza pizzaMargherita(){
        Pizza p=new Pizza();
        p.setNome("Pizza Margherita");
        p.setPrezzo(8.99);
        p.setCalorie(300);

        return p;
    }
    @Bean
    public Pizza pizzaSalame(){
        Pizza p=new Pizza();
        p.setNome("Pizza Salame");
        p.setPrezzo(9.99);
        p.setCalorie(250);p.setToppings(List.of(salame));
        return p;
       // return new Pizza("Pizza Salame", 250, 9.99, List.of(salame));
    }
    @Bean
    public Pizza pizzaFunghi(){
        Pizza p=new Pizza();
        p.setNome("Pizza Funghi");
        p.setPrezzo(5.99);
        p.setCalorie(200);
        return p;
    }


}
