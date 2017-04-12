package com.alibaba.lightning.api;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by michael on 4/12/17.
 */
public class RemoteControlRequest implements Serializable {

    private String vin;
    private String token;
    private Map<String,String> param;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }
}
