package com.fabricadeconexionesaapis.factories;

import com.fabricadeconexionesaapis.apis.GraphQLAPI;
import com.fabricadeconexionesaapis.apis.API;

public class GraphQLAPIFactory implements APIFactory {

    public API createAPI() {
        return  (API) new GraphQLAPI();
    }

}
