package com.example.Log.entidades;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Document(collection = "log")
public class Log {
    @Id
    private String id;
    private String name;
    private Date diahora;
    private String produto;
    private Integer qtd;
}
