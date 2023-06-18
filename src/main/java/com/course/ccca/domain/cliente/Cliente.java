package com.course.ccca.domain.cliente;

import com.course.ccca.domain.endereco.Endereco;
import lombok.Data;

import java.util.Date;

@Data
public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;
    private Date dataCadastro;
}
