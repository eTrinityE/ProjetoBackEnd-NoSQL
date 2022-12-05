package com.example.Delivery.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transacao {
    private String idCliente;
    private String nome;
    private String idProduto;
    private double preco;
    private String endereco;
}
