package com.fabricadeconexionesaapis.factories;

import com.fabricadeconexionesaapis.apis.API;
import com.fabricadeconexionesaapis.apis.RESTAPI;

public class RESTAPIFactory implements APIFactory {
    public API createAPI() {
        return (API) new RESTAPI();
    }

}
