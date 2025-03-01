package com.fabricadeconexionesaapis.apis;



public class GraphQLAPI implements API {
    private String data;


    public void makeRequest(String endpoint) {
        System.out.println("Haciendo solicitud a GraphQL API en el endpoint: " + endpoint);
        this.data = "{ \"data\": { \"user\": { \"id\": 1, \"name\": \"Jane Doe\" } } }";
    }

    @Override
    public String getData() {
        return data;
    }

}
