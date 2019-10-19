package com.jpmc.cfg.team17.api;

import com.jpmc.cfg.team17.daos.UserRepository;
import com.jpmc.cfg.team17.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String hello()
    {
        return "hello world!";
    }

    @RequestMapping(value="/users", method=RequestMethod.GET)
    public Iterable<User> users()
    {
        return userRepository.findAll();
    }

    @RequestMapping(value="/saveUser", method=RequestMethod.POST)
    public void saveUser(@RequestBody User user)
    {
        userRepository.save(user);
    }
}

