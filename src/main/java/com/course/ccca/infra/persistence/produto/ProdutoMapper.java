package com.course.ccca.infra.persistence.produto;

import com.course.ccca.domain.produto.Produto;
import com.course.ccca.infra.common.Mapper;

public class ProdutoMapper extends Mapper {
    public static ProdutoEntity toEntity(Produto produto){
        return map(produto, ProdutoEntity.class);
    }
    public static Produto toDomain(ProdutoEntity produtoEntity){
        return map(produtoEntity, Produto.class);
    }
}
