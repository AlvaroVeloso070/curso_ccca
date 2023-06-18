package com.course.ccca.domain.endereco;

import com.course.ccca.domain.cliente.Cliente;
import lombok.Data;

@Data
public class Endereco {
    private Long id;
    private Cliente cliente;
    private String pais;
    private String estado;
    private String uf;
    private String cidade;
    private String bairro;
    private String cep;
    private String rua;
    private String numero;
    private String complemento;
}
