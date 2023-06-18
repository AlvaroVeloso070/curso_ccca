package com.course.ccca.infra.persistence.cliente;

import com.course.ccca.domain.cliente.Cliente;
import com.course.ccca.infra.common.Mapper;

public class ClienteMapper extends Mapper {
    public static ClienteEntity toEntity(Cliente cliente){
        return map(cliente, ClienteEntity.class);
    }

    public static Cliente todomain(ClienteEntity clienteEntity){
        return map(clienteEntity, Cliente.class);
    }
}
