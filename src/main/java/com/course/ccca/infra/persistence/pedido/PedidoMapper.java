package com.course.ccca.infra.persistence.pedido;

import com.course.ccca.domain.pedido.Pedido;
import com.course.ccca.infra.common.Mapper;

public class PedidoMapper extends Mapper {
    public static PedidoEntity toEntity(Pedido pedido){
        return map(pedido, PedidoEntity.class);
    }
    public static Pedido toDomain(PedidoEntity pedidoEntity){
        return map(pedidoEntity, Pedido.class);
    }
}
