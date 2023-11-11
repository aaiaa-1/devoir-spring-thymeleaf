package com.example.devoir.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Employe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long codeEmploye;
    private String nomEmploye;
    @ManyToOne
    @JoinColumn(name="code_emp_sup")
    private Employe employeSup;
    @ManyToMany
    @JoinTable(name="EMP_GR")
    private List<Groupe> groupes;

    // ------------------------------------------------


    public Employe() {
        super();
    }

    public Employe(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public Long getCodeEmploye() {
        return codeEmploye;
    }

    public void setCodeEmploye(Long codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public Employe getEmployeSup() {
        return employeSup;
    }

    public void setEmployeSup(Employe employeSup) {
        this.employeSup = employeSup;
    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Groupe> groupes) {
        this.groupes = groupes;
    }
}
