package com.demo.constant;

public enum Message {

    HELLO(0, "WELCOME.MESSAGE"),
    BYE(1, "BYE.MESSAGE");

    private String message;
    private int code;

    Message(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() { return code;}
    public String getMessage() { return message;}
}
