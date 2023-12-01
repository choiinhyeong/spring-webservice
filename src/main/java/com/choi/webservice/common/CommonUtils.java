package com.choi.webservice.common;

public class CommonUtils {

    public static ResponseCodes getCommonResultCode(int result) {
        return result > 0 ? ResponseCodes.SUCCESS : ResponseCodes.ERROR;
    }

}
