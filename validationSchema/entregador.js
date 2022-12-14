db.createCollection("entregador",
    {
        validator:{
            $jsonSchema:{
                required: ["nome","entregas"],
                properties:{
                    nome:{
                        bsonType: "string", maxLength: 64, description: "Nome do entregador"
                    },
                    entregas:{
                        bsonType: "object", description: "Entregas do entregador",
                        required: ["endereco", "valorFrete", "nomeCliente"],
                        properties: {
                            endereco:{
                                bsonType: "string", description: "Endereco do cliente"
                            },
                            valorFrete:{
                                bsonType: "double", description: "Valor do frete"
                            },
                            nomeCliente:{
                                bsonType: "string", description: "Nome do cliente que irá receber"
                            }
                        }
                    }
                }
            }
        }
    });