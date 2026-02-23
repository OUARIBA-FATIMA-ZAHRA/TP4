package com.example.model.tableperclass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private Double prix;

    public Produit() {}

    public Produit(String nom, Double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public abstract double calculerValeur();

    public Long getId() { return id; }
    public Double getPrix() { return prix; }
}
