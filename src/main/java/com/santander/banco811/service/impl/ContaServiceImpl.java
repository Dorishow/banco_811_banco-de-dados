package com.santander.banco811.service.impl;

import com.santander.banco811.dto.ContaRequest;
import com.santander.banco811.dto.ContaResponse;
import com.santander.banco811.model.Conta;
import com.santander.banco811.repository.ContaRepository;
import com.santander.banco811.service.ContaService;
import com.santander.banco811.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    ContaRepository contaRepository;

    @Autowired
    UsuarioService usuarioService;

    @Override
    public ContaResponse create(ContaRequest contaRequest) {
        Conta conta = new Conta(contaRequest);
        var usuario = usuarioService.getById(contaRequest.getIdUsuario());
        conta.setUsuario(usuario);
        System.out.println(conta);
        contaRepository.save(conta);

        return new ContaResponse(conta);
    }

    @Override
    public List<Conta> getAll() {

        return contaRepository.findAll();
    }
}
