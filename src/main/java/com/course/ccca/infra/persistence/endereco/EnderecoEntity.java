package com.course.ccca.infra.persistence.endereco;

import com.course.ccca.infra.persistence.cliente.ClienteEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ENDERECO")
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "pais")
    private String pais;

    @Column(name = "estado")
    private String estado;

    @Column(name = "uf")
    private String uf;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cep")
    private String cep;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;

    public EnderecoEntity() {}
}
