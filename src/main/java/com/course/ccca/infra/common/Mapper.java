package com.course.ccca.infra.common;

import org.modelmapper.ModelMapper;

public class Mapper {
    protected static <S, D> D map(S objetoOrigem, Class<D> classeObjetoDestino) {
        return new ModelMapper().map(objetoOrigem, classeObjetoDestino);
    }
}
