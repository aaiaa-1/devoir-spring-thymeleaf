package com.example.devoir.services;

import com.example.devoir.entities.Employe;
import com.example.devoir.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImplementation implements EmployeService {
    private final EmployeRepository employeRepository;
    @Autowired
    public EmployeServiceImplementation(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public Employe saveEmploye(Employe e) {
        return employeRepository.save(e);
    }
}
