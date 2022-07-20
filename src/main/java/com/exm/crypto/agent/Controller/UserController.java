package com.exm.crypto.agent.Controller;


import com.exm.crypto.agent.Service.UserService;
import com.exm.crypto.agent.model.UserData;
import com.exm.crypto.agent.model.UserDataPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/home")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserData user){


        userService.saveUser(user);

        return "Save User Data";
    }
    @PostMapping("/savePoint")
    public String savePoint(@RequestBody UserDataPoint userDataPoint){


        userService.savePoint(userDataPoint);
        return "Save Data Point";
    }
}
