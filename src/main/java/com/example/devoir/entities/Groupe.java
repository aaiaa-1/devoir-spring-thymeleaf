package com.example.devoir.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Groupe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long codeGroupe;
    private String nomGroupe;
    @ManyToMany(mappedBy="groupes")
    private List<Employe> employe;

    // ------------------------------------------------

    public Groupe() {
        super();
    }

    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public Groupe(Long codeGroupe,
                  String nomGroupe,
                  List<Employe> employe) {
        this.codeGroupe = codeGroupe;
        this.nomGroupe = nomGroupe;
        this.employe = employe;
    }

    public Long getCodeGroupe() {
        return codeGroupe;
    }

    public void setCodeGroupe(Long codeGroupe) {
        this.codeGroupe = codeGroupe;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public List<Employe> getEmploye() {
        return employe;
    }

    public void setEmploye(List<Employe> employe) {
        this.employe = employe;
    }
}
