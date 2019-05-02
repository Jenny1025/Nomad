package com.nomad.nomad.Service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("cappuccino")
                && password.equalsIgnoreCase("123");
    }
}


