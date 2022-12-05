package com.example.Delivery.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "entregas")
public class Entregas {
    @Id
    private String id;
    private String endereco;
    private double valorFrete;
    private String nomeCliente;
    private String idCLiente;
    private String idProduto;
}
