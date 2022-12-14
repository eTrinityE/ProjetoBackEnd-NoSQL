db.createCollection("produtos",
    {
        validator:{
            $jsonSchema:{
                required: ["nome","descricao","preco"],
                properties:{
                    nome:{
                        bsonType: "string", maxLength: 64, description: "Nome do produto"
                    },                
                    descricao:{
                        bsonType: "string", maxLength: 64, description: "Descricao do produto"
                    },
                    preco:{
                        bsonType: "double", description: "Valor do produto"
                    }
                }
            }
        }
    });