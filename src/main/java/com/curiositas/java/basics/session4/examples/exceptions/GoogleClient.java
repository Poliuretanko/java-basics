package com.curiositas.java.basics.session4.examples.exceptions;

import java.net.http.HttpConnectTimeoutException;

public class GoogleClient {

    public String search(String request) throws HttpConnectTimeoutException {
        throw new HttpConnectTimeoutException("Can't get connection with google.com while searching \"" + request + "\"");
    }
}
