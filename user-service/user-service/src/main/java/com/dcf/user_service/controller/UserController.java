package com.dcf.user_service.controller;


import com.dcf.user_service.VO.ResponseTemplateVO;
import com.dcf.user_service.entity.User;
import com.dcf.user_service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

   @Autowired
    private UserService userService;


   @PostMapping("/")
   public User saveUser(@RequestBody User user) {
       log.info("Inside saveUser of UserController");
       return  userService.saveUser(user);
   }

   @GetMapping("/{id}")
public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
       log.info("Inside getUserWithDepartment of UserController");
       return userService.getUserWithDepartment(userId);
}
}
