package com.course.ccca.domain.pedido;

import com.course.ccca.domain.cliente.Cliente;
import com.course.ccca.domain.cupom.Cupom;
import com.course.ccca.domain.itemPedido.ItemPedido;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Pedido {
    private Long id;
    private Cliente cliente;
    private Date dataPedido;
    private List<ItemPedido> itemsPedido;
    private Double valorBruto;
    private Double valorLiquido;
    private Double valorFrete;
    private Cupom cupomDesconto;
}
