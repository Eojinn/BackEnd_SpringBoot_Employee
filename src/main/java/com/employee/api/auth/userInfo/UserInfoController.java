package com.employee.api.auth.userinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userinfos")
public class UserInfoController {
    @Autowired
    private com.employee.api.auth.userinfo.UserInfoUserDetailsService service;

    @PostMapping("/new")
    public String addNewUser(@RequestBody com.employee.api.auth.userinfo.UserInfo userInfo){
        return service.addUser(userInfo);
    }
}