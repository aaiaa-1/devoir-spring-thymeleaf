package com.example.devoir.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte{
    private Double taux;

    // ------------------------------------------------
    public CompteEpargne(String codeCompte,
                         Date dateCreation,
                         Double solde,
                         Double taux) {
        super(codeCompte, dateCreation, solde);
        this.taux = taux;
    }

    public CompteEpargne() {
        super();
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }
}
