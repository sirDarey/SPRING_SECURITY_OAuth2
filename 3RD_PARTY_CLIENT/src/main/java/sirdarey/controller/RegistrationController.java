package sirdarey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sirdarey.entity.User;
import sirdarey.service.UserService;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    //Just an end point to add a new user to the database
    
    @PostMapping("/register")
    public User registerUser(@RequestBody User newUser) {
        return userService.registerUser(newUser);
    }

}
