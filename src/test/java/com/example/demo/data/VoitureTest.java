package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoitureAvecConstructeur(){
        Voiture v = new Voiture("Peugeot", 15000);
        assertEquals("Peugeot", v.getMarque());
        assertEquals(15000, v.getPrix());
    }

    @Test
    void creerVoitureVideEtSetters(){
        Voiture v = new Voiture();
        v.setMarque("Renault");
        v.setPrix(12000);
        v.setId(1);
        assertEquals("Renault", v.getMarque());
        assertEquals(12000, v.getPrix());
        assertEquals(1, v.getId());
    }

}