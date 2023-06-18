package com.course.ccca.infra.persistence.itemPedido;

import com.course.ccca.domain.itemPedido.ItemPedido;
import com.course.ccca.infra.common.Mapper;

public class ItemPedidoMapper extends Mapper{
    public static ItemPedidoEntity toEntity(ItemPedido itemPedido) {
        return map(itemPedido, ItemPedidoEntity.class);
    }
    public static ItemPedido toDomain(ItemPedidoEntity itemPedidoEntity){
        return map(itemPedidoEntity, ItemPedido.class);
    }
}
