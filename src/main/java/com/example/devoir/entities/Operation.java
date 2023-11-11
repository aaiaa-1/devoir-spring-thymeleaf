package com.example.devoir.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length=1)
public class Operation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numeroOperation;
    private Date dateOperation;
    private Double montant;
    @ManyToOne
    @JoinColumn(name="code_cmpt")
    private Compte compte;
    @ManyToOne
    @JoinColumn(name="code_emp")
    private Employe employe;

    public Operation() {
        super();
    }

    public Operation(Date dateOperation, Double montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public Long getNumeroOperation() {
        return numeroOperation;
    }

    public void setNumeroOperation(Long numeroOperation) {
        this.numeroOperation = numeroOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
