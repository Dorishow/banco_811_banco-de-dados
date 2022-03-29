package com.santander.banco811.service;

import com.santander.banco811.dto.ContaRequest;
import com.santander.banco811.dto.ContaResponse;
import com.santander.banco811.model.Conta;

import java.util.List;

public interface ContaService {
    ContaResponse create(ContaRequest contaRequest);

    List<Conta> getAll();
}
