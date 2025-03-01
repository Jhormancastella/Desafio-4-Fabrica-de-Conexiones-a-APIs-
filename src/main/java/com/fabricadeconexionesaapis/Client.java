package com.fabricadeconexionesaapis;

import java.util.Scanner;

import com.fabricadeconexionesaapis.apis.API;
import com.fabricadeconexionesaapis.factories.APIFactory;
import com.fabricadeconexionesaapis.factories.GraphQLAPIFactory;
import com.fabricadeconexionesaapis.factories.RESTAPIFactory;
import com.fabricadeconexionesaapis.factories.SOAPAPIFactory;

public class Client {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seleccione el tipo de API (REST, GraphQL, SOAP): ");
        String tipoAPI = scanner.nextLine().trim().toLowerCase();

        APIFactory factory = null;

        switch (tipoAPI) {
            case "rest":
                factory = new RESTAPIFactory();
                break;
            case "graphql":
                factory = new GraphQLAPIFactory();
                break;
            case "soap":
                factory = new SOAPAPIFactory();
                break;
            default:
                System.out.println("Tipo de API no válido.");
                return;
        }

        API api = factory.createAPI();
        api.makeRequest("/users");
        System.out.println("Datos obtenidos: " + api.getData());

        scanner.close();
    }
}