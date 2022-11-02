package com.dummy.service.dummyService.controller;


import com.dummy.service.dummyService.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("admin-service/users")
public interface UserRestConsumer {
    @GetMapping("signUp")
    String savingAUser(@RequestBody User user);

    @GetMapping("getAll")
    List<User> getAll();
}
