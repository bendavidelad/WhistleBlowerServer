package com.whistleBlower.demo.api;

import com.whistleBlower.demo.buisness_logic.BusinessLogic;
import com.whistleBlower.demo.buisness_logic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BusinessLogic businessLogic;


    @GetMapping("/")
    public String test() {
        return "Hello World!";
    }

    @GetMapping("/createUser")
    public void createUser(){
        businessLogic.createUser();
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return businessLogic.getUsers();
    }



}
