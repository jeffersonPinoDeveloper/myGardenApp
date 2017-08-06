package com.developer.jeffersonpino.myGardenApp.model.request;

/**
 * Created by jeffersonpino on 18/06/17. Este modelo debe ser igual al de webservices.
 */

public class LoginRequest {

    public String nombreUsuario;
    public String password;
    public String token;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
