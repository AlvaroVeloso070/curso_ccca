package com.course.ccca.domain.cupom;

import lombok.Data;

import java.util.Date;

@Data
public class Cupom {
    private Long id;
    private String nome;
    private String codigo;
    private Enum<TipoCupom> tipoCupom;
    private Double valorDesconto;
    private Date dataValidade;
    private Boolean cupomExpirado;
}
