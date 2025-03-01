package com.fabricadeconexionesaapis.apis;

public class RESTAPI implements API {
    private String data;

    @Override
    public void makeRequest(String endpoint) {
        System.out.println("Haciendo solicitud a REST API en el endpoint: " + endpoint);
        this.data = "{ \"id\": 1, \"name\": \"John Doe\" }";
    }

    @Override
    public String getData() {
        return data;
    }
}
