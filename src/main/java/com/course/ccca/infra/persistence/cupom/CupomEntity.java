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

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "tipo_cupom")
    private Enum<TipoCupom> tipoCupom;

    @Column(name = "valor_desconto")
    private Double valorDesconto;

    @Column(name = "data_validade")
    private Date dataValidade;

    @Column(name = "cupom_expirado")
    private Boolean isCupomExpirado;

    public CupomEntity() {}
}
