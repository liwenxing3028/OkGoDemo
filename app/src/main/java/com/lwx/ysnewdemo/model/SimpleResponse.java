package com.lwx.ysnewdemo.model;


import com.lwx.ysnewdemo.rx.LwxResponse;

import java.io.Serializable;

public class SimpleResponse implements Serializable {

    private static final long serialVersionUID = -1477609349345966116L;

    public int errcode;
    public String message;

    public LwxResponse toLwxResponse() {
        LwxResponse lwxResponse = new LwxResponse();
        lwxResponse.errcode = errcode;
        lwxResponse.message = message;
        return lwxResponse;
    }
}