package com.course.ccca.domain.itemPedido;

import com.course.ccca.domain.produto.Produto;
import lombok.Data;

@Data
public class ItemPedido {
    private Long id;
    private Produto produto;
    private Long quantidade;
}
