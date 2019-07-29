package com.project.streamsql.controller;

import com.project.streamsql.entity.User;
import com.project.streamsql.repository.UserRepository;
import com.project.streamsql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("all")
    public List<User> loadCustomers() {
        return userRepository.findAll();
    }

    @RequestMapping("get/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userRepository.findById(id).get();
    }

    /**
     * @param user
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @Transactional
    public User addUser(@RequestBody User user) {

        userService.addUser(user);

        Long id = user.getId();

        return userService.getUserById(id);

    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
//    @Transactional
    public User updateUser(@RequestBody User user) {

        userService.updateUserById(user);

        Long id = user.getId();

        return userService.getUserById(id);

    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
//    @Transactional
    public User deleteUser(@RequestBody User user) {

        Long id = user.getId();
        user = getUser(id);
        userService.deleteUserById(id);
        return user;

    }

}
