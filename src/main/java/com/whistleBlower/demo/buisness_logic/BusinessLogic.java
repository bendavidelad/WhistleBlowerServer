package com.whistleBlower.demo.buisness_logic;

import com.whistleBlower.demo.buisness_logic.model.Group;
import com.whistleBlower.demo.buisness_logic.model.Message;
import com.whistleBlower.demo.buisness_logic.model.User;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)

public class BusinessLogic {

    private List<Message> messages;
    private List<Group> groups;
    private List<User> users;

    public BusinessLogic() {
        messages = new ArrayList<>();
        groups = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void createUser(){
        users.add(new User("000000"));
    }

    public List<User> getUsers(){
        return users;
    }


}
