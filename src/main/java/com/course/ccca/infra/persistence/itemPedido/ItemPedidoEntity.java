package com.course.ccca.infra.persistence.itemPedido;


import com.course.ccca.infra.persistence.pedido.PedidoEntity;
import com.course.ccca.infra.persistence.produto.ProdutoEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ITEM_PEDIDO")
public class ItemPedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private ProdutoEntity produto;

    @Column(name = "quantidade", nullable = false)
    private Long quantidade;

    @ManyToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private PedidoEntity pedido;
}
