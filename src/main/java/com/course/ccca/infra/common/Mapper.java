package com.course.ccca.infra.common;

import org.modelmapper.ModelMapper;

public abstract class Mapper {
    protected static <S, D> D map(S objetoOrigem, Class<D> classeObjetoDestino) {
        return new ModelMapper().map(objetoOrigem, classeObjetoDestino);
    }
}
