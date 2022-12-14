db.createCollection("cliente",
    {
        validator:{
            $jsonSchema:{
                required: ["nome","documento"],
                properties:{
                    nome:{
                        bsonType: "string", maxLength: 64, description: "Nome do cliente"
                    },
                    documento:{
                        bsonType: "object", description: "Documento do Cliente",
                        required: ["cpf"],
                        properties: {
                            cpf:{
                                bsonType: "string", description: "Cpf do documento do cliente", maxLength: 11, minLength: 11
                            }
                        }
                    }
                }
            }
        }
    });