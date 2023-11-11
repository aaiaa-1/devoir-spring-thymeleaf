package com.example.devoir.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_cmpt",discriminatorType=DiscriminatorType.STRING,length = 2)
public class Compte {
    @Id
    private String codeCompte;
    private Date dateCreation;
    private Double solde;
    @ManyToOne
    @JoinColumn(name="code_cli")  // foreign key and its name
    private Client client;
    @ManyToOne
    @JoinColumn(name="code_emp")
    private Employe employe;
    @OneToMany(mappedBy="compte")
    private List<Operation> operations;


    // ------------------------------------------------------

    public Compte() {
        super();
    }

    public Compte(String codeCompte,
                  Date dateCreation,
                  Double solde) {
        this.codeCompte = codeCompte;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }
}
