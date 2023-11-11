package com.example.devoir.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
@DiscriminatorValue("R")
public class Retrait extends  Operation{
}
