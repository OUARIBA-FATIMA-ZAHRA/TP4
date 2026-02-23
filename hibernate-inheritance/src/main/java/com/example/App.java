package com.example;

import com.example.model.singletable.*;
import com.example.model.joined.*;
import com.example.model.tableperclass.*;

import javax.persistence.*;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("hibernate-inheritance");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Voiture v = new Voiture("BMW", "X5",
                LocalDate.of(2022,1,1),
                50000.0, 5, true);

        Moto m = new Moto("Honda", "CBR",
                LocalDate.of(2021,1,1),
                12000.0, 600);

        em.persist(v);
        em.persist(m);

        em.getTransaction().commit();

        System.out.println("Valeur voiture: " + v.calculerValeur());
        System.out.println("Valeur moto: " + m.calculerValeur());

        em.close();
        emf.close();
    }
}
