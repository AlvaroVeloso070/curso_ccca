package com.course.ccca.infra.persistence.cliente;

import com.course.ccca.infra.persistence.endereco.EnderecoEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "CLIENTE")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private EnderecoEntity endereco;

    @Column(name = "data_cadastro")
    private Date dataCadastro;

    public ClienteEntity() {}
}


