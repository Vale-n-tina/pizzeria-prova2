package it.epicode.pizzeria_prova2.runner;

import it.epicode.pizzeria_prova2.alimento.VoceMenu;
import it.epicode.pizzeria_prova2.menu.Menu;
import it.epicode.pizzeria_prova2.ordine.Ordine;
import it.epicode.pizzeria_prova2.ordine.StatoOrdine;
import it.epicode.pizzeria_prova2.tavolo.Tavolo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RequiredArgsConstructor
@Component
public class ApplicationRunner implements CommandLineRunner {

    private final Menu menu ;
    private final Tavolo tavolo1;
    private final Tavolo tavolo2;
    private final Tavolo tavolo3;
    @Value("${costoCoperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) throws Exception {
        List<VoceMenu> ordinazione = List.of(menu.getPizze().get(0), menu.getBevande().get(0));
        Ordine ordine1=new Ordine(tavolo1, ordinazione, StatoOrdine.IN_CORSO,2);
        System.out.println(ordine1);
    }
}
