package com.example.Workspace.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "produtos")
public class Produtos {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private double preco;
    private Integer qtd;
}




