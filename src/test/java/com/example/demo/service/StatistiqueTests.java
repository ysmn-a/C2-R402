package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StatistiqueTests {

    @Test
    void testPrixMoyen() {
        StatistiqueImpl statistique = new StatistiqueImpl();
        statistique.ajouter(new Voiture("Peugeot", 10000));
        statistique.ajouter(new Voiture("Renault", 20000));

        Echantillon echantillon = statistique.prixMoyen();

        assertEquals(15000, echantillon.getPrixMoyen());
        assertEquals(2, echantillon.getNombreDeVoitures());
    }

}