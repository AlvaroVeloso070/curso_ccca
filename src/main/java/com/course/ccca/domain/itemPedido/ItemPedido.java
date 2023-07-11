package com.course.ccca.domain.itemPedido;

import com.course.ccca.domain.produto.Produto;
import com.course.ccca.infra.persistence.pedido.PedidoEntity;
import lombok.Data;

@Data
public class ItemPedido {
    private Long id;
    private Produto produto;
    private Long quantidade;
    private PedidoEntity pedido;
}
