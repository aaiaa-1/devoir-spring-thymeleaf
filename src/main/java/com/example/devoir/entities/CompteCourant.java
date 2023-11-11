package com.example.devoir.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table
@DiscriminatorValue("CC")
public class CompteCourant extends Compte{
    private Double decouvert;

    // ------------------------------------------------


    public CompteCourant(String codeCompte,
                         Date dateCreation,
                         Double solde,
                         Double decouvert) {
        super(codeCompte, dateCreation, solde);
        this.decouvert = decouvert;
    }

    public CompteCourant() {
        super();
    }

    public Double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(Double decouvert) {
        this.decouvert = decouvert;
    }
}
