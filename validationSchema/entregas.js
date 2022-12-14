db.createCollection("entregas",
    {
        validator:{
            $jsonSchema:{
                required: ["endereco","valorFrete","nomeCliente"],
                properties:{
                    endereco:{
                        bsonType: "string", maxLength: 64, description: "Endereco da entrega"
                    },
                    valorFrete:{
                        bsonType: "double", description: "Valor do frete"
                    },
                    nomeCliente:{
                        bsonType: "string", maxLength: 64, description: "Nome do cliente"
                    }
                }
            }
        }
    });