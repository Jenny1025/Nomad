package com.nomad.nomad.Controller;

import com.nomad.nomad.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @Autowired
    LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPage(@RequestParam String user, @RequestParam String password, ModelMap model){

        boolean useValidate = service.validateUser(user, password);

        if(!useValidate) {
            model.put("errorMessage","Cannot use message");
            return "login";
        }

        model.put("user", user);
        model.put("password", password);
        return "welcome";
    }
}
