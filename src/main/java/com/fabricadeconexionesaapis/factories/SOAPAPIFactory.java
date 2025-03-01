package com.fabricadeconexionesaapis.factories;

import com.fabricadeconexionesaapis.apis.API;
import com.fabricadeconexionesaapis.apis.SOAPAPI;

public class SOAPAPIFactory implements APIFactory {

    public API createAPI() {
        return (API) new SOAPAPI();
    }

}
