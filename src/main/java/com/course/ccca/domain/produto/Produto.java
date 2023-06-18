package com.course.ccca.domain.produto;

import lombok.Data;

@Data
public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Double valor;
}
