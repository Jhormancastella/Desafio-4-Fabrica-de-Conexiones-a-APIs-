package com.fabricadeconexionesaapis.apis;

public interface API {
    void makeRequest(String endpoint);
    String getData();
}
