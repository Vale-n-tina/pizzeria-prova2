package it.epicode.pizzeria_prova2.runner;

import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import it.epicode.pizzeria_prova2.bevande.Bevanda;
import it.epicode.pizzeria_prova2.bevande.BevandaRepository;
import it.epicode.pizzeria_prova2.menu.Menu;
import it.epicode.pizzeria_prova2.ordine.Ordine;
import it.epicode.pizzeria_prova2.ordine.OrdineRepository;
import it.epicode.pizzeria_prova2.ordine.StatoOrdine;
import it.epicode.pizzeria_prova2.pizze.Pizza;
import it.epicode.pizzeria_prova2.tavolo.Tavolo;
import it.epicode.pizzeria_prova2.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ApplicationRunner implements CommandLineRunner {
    private final Menu menu;
    private final Tavolo tavolo1;
    private final Tavolo tavolo2;
    private final Tavolo tavolo3;
    private final Topping salame;
    private final Topping abbondanteMozz;
    private final Topping sugo;
    private final Pizza pizzaMargherita;
    private final Pizza pizzaFunghi;
    private final Pizza pizzaSalame;
    private final Menu meenu;
    private final Bevanda aranciata;
    private final Bevanda cocaCola;
    private final OrdineRepository OrdineRepository;
    private final BevandaRepository BevandaRepository;
    private final 

    @Value("${costoCoperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) throws Exception {


        List<VoceMenu> ordinazione = List.of(menu.getPizze().get(0), menu.getBevande().get(0));
        Ordine ordine1 = new Ordine(tavolo1, ordinazione, StatoOrdine.IN_CORSO, 2);
        System.out.println(ordine1);
        OrdineRepository.save(ordine1);
    }
}
