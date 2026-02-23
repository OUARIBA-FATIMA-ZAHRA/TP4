package com.example.model.tableperclass;

import javax.persistence.Entity;

@Entity
public class Livre extends Produit {

    private String auteur;

    public Livre() {}

    public Livre(String nom, Double prix, String auteur) {
        super(nom, prix);
        this.auteur = auteur;
    }

    @Override
    public double calculerValeur() {
        return getPrix() * 0.95;
    }
}