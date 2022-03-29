package com.santander.banco811.dto;

import com.santander.banco811.model.Conta;
import com.santander.banco811.model.TipoConta;
import com.santander.banco811.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter @AllArgsConstructor
public class ContaResponse {
    private Integer id;
    private Integer numeroConta;
    private Integer agencia;
    private TipoConta tipoConta;
    private Usuario usuario;
    private BigDecimal saldo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public ContaResponse(Conta conta) {
        this.id = conta.getId();
        this.numeroConta = conta.getNumero();
        this.agencia = conta.getAgencia();
        this.tipoConta = conta.getTipoConta();
        this.usuario = conta.getUsuario();
        this.saldo = conta.getSaldo();
        this.dataCriacao = conta.getDataCriacao();
        this.dataAtualizacao = conta.getDataAtualizacao();
    }

    public static List<ContaResponse> toResponse(List<Conta> contas){
        return  contas.stream().map(ContaResponse::new).collect(Collectors.toList());
    }
}
