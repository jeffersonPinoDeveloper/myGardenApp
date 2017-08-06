package com.developer.jeffersonpino.myGardenApp.model.response;

/**
 * Created by jeffersonpino on 18/06/17. El modelo debe ser el mismo que los campos en del ws.
 */

public class LoginResponse {


    private String code;
    private String mesage;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMesage() {
        return mesage;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }

}
