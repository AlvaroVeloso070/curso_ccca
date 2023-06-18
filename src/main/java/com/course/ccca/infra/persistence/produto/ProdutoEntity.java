package com.course.ccca.infra.persistence.produto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUTO")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private Double valor;

    public ProdutoEntity() {}
}
