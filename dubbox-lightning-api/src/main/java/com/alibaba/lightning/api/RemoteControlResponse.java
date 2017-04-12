package com.alibaba.lightning.api;

import java.io.Serializable;

/**
 * Created by michael on 4/12/17.
 */
public class RemoteControlResponse implements Serializable {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
