package com.example.devoir.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Client {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long codeClient;
    private String nomClient;

    @OneToMany(mappedBy="client",fetch=FetchType.LAZY)
    private List<Compte> comptes;


    // ------------------------------------------------


    public Client() {
        super();
    }

    public Client(String nomClient) {
        this.nomClient = nomClient;
    }

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
