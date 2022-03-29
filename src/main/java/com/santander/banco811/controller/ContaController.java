package com.santander.banco811.controller;

import com.santander.banco811.dto.ContaRequest;
import com.santander.banco811.dto.ContaResponse;
import com.santander.banco811.model.Conta;
import com.santander.banco811.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    @PostMapping
    public ContaResponse create(@RequestBody ContaRequest contaRequest) {
        return contaService.create(contaRequest);
    }

    @GetMapping
    public List<Conta> getAll(){ return contaService.getAll();}
}
