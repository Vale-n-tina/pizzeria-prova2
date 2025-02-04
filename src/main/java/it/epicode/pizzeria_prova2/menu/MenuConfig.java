package it.epicode.pizzeria_prova2.menu;

import it.epicode.pizzeria_prova2.bevande.Bevanda;
import it.epicode.pizzeria_prova2.pizze.Pizza;
import it.epicode.pizzeria_prova2.topping.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {
    @Autowired
    private Bevanda aranciata;
    @Autowired
    private Bevanda cocaCola;
    @Autowired
    private Pizza pizzaMargherita;
    @Autowired
    private Pizza pizzaSalame;
    @Autowired
    private Pizza pizzaFunghi;
    @Autowired
    private Topping abbondanteMozz;
    @Autowired
    private Topping salame;

    @Bean
    public Menu creaMenu(){
        Menu m=new Menu();
        m.setNome("Menu Pranzo");
        m.getBevande().add(aranciata);
        m.getBevande().add(cocaCola);
        m.getPizze().add(pizzaMargherita);
        m.getPizze().add(pizzaFunghi);
        m.getPizze().add(pizzaSalame);
        m.setToppings(List.of(abbondanteMozz, salame));
        return m;
    }
}
