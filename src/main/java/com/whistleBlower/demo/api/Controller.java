package com.whistleBlower.demo.api;

import com.whistleBlower.demo.buisness_logic.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    @GetMapping("/")
    public String createGroup(List<Contact> contacts) {
        return "Hello World!";
    }



}
