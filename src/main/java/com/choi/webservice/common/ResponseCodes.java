package com.choi.webservice.common;

public enum ResponseCodes {

    INSPECTION(100, "Continue"),
    SUCCESS(200, "Success"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    ERROR(500, "Error"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    SERVICE_UNVALIABLE(503, "Service Unavailable");

    private int code;
    private String desc;

    ResponseCodes(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code){
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
