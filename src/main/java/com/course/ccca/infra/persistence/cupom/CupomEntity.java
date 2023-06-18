package com.course.ccca.infra.persistence.cupom;

import com.course.ccca.domain.cupom.TipoCupom;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "CUPOM")
public class CupomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "tipo_cupom", nullable = false)
    @Enumerated(EnumType.STRING)
    private Enum<TipoCupom> tipoCupom;

    @Column(name = "valor_desconto", nullable = false)
    private Double valorDesconto;

    @Column(name = "data_validade", nullable = false)
    private Date dataValidade;

    @Column(name = "cupom_expirado", nullable = false)
    private Boolean isCupomExpirado;

    public CupomEntity() {}
}
