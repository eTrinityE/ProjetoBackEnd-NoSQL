package com.example.Ecommerce.entidades;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Document("ordem")
public class Ordem {
    @Id
    private String id;
    private Cliente cliente;
    private Produtos produto;
}
