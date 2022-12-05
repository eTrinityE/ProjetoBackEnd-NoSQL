package com.example.Workspace.entidades;

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
public class Log {
    @Id
    private String id;
    private String name;
    private Date diahora;
    private String produto;
    private Integer qtd;
}
