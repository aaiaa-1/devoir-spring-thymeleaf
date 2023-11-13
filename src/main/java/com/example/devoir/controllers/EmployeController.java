package com.example.devoir.controllers;

import com.example.devoir.entities.Employe;
import com.example.devoir.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //makes this class to serve rest endpoints
@RequestMapping(path = "api/v1/employe")
public class EmployeController {
    private final EmployeService employeService;

    @Autowired
    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @PostMapping
    public void addEmploye(@RequestBody Employe employe){
        employeService.saveEmploye(employe);
    }
}
