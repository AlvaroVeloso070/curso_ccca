package com.course.ccca.infra.persistence.endereco;

import com.course.ccca.domain.endereco.Endereco;
import com.course.ccca.infra.common.Mapper;

public class EnderecoMapper extends Mapper{
    public static EnderecoEntity toEntity(Endereco endereco) {
        return map(endereco, EnderecoEntity.class);
    }
    public static Endereco toDomain(EnderecoEntity enderecoEntity){
        return map(enderecoEntity, Endereco.class);
    }
}
