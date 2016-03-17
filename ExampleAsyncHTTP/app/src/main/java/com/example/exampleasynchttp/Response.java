package com.example.exampleasynchttp;

/**
 * This is the simple response given from the HTTP get request, to obtain the pubblic IP address of your device
 */
public class Response {

    private String ip;

    public Response(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    @Override
    public String toString() {
        return "The ip address is: " + ip;
    }
}
