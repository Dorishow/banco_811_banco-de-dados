package com.santander.banco811.dto;

import com.santander.banco811.model.TipoConta;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class ContaRequest {
    private Integer agencia;
    private BigDecimal saldo;
    private TipoConta tipoConta;
    private Integer idUsuario;
    private Integer numero;
}
