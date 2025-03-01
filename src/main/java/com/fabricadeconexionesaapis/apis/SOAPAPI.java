package com.fabricadeconexionesaapis.apis;

public class SOAPAPI implements API {
    private String data;

    @Override
    public void makeRequest(String endpoint) {
        System.out.println("Haciendo solicitud a SOAP API en el endpoint: " + endpoint);
        this.data = "<user><id>1</id><name>John Smith</name></user>";
    }

    @Override
    public String getData() {
        return data;
    }

}
