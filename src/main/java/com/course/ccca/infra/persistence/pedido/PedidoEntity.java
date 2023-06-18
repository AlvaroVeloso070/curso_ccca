package com.course.ccca.infra.persistence.pedido;

import com.course.ccca.infra.persistence.cliente.ClienteEntity;
import com.course.ccca.infra.persistence.cupom.CupomEntity;
import com.course.ccca.infra.persistence.itemPedido.ItemPedidoEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "PEDIDO")
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "data_pedido")
    private Date dataPedido;

    @Column(name = "valor_bruto")
    private Double valorBruto;

    @Column(name = "valor_liquido")
    private Double valorLiquido;

    @Column(name = "valor_frete")
    private Double valorFrete;

    @OneToMany(mappedBy = "PEDIDO", cascade = CascadeType.ALL)
    private List<ItemPedidoEntity> itemsPedido;

    @OneToOne
    @JoinColumn(name = "id_cupom")
    private CupomEntity cupomDesconto;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;

    public PedidoEntity() {}
}
