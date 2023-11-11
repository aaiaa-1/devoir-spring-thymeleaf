package com.example.devoir.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
@DiscriminatorValue("V")
public class Versement extends Operation{
}
