package com.xxxy.erer15.contoller;

import com.xxxy.erer15.base.result.PageTableRequest;
import com.xxxy.erer15.base.result.ResponseCode;
import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.dto.UserDto;
import com.xxxy.erer15.model.SysUser;
import com.xxxy.erer15.service.impl.UserServiceImpl;
import com.xxxy.erer15.util.MD5;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * UserContoller
 *
 * @author erer
 * @date 2020/2/29
 */
@Controller
@RequestMapping("user")
@Slf4j
public class UserContoller {
    @Autowired
    public UserServiceImpl userService;
    @GetMapping("/{username}")
    @ResponseBody
    public SysUser user(@PathVariable String username) {
        log.info("UserController.user(): param ( username = " + username +" )");
        return userService.getUser(username);
    }
    @GetMapping("/list")
    @ResponseBody
    public Results<SysUser> getUsers(PageTableRequest pageTableRequest) {
       pageTableRequest.countOffset();
        return userService.getAllUsersByPage(pageTableRequest.getOffset(), pageTableRequest.getLimit());
    }
    @GetMapping("/add")
    public String addUser(Model model) {
       model.addAttribute(new SysUser());
        return "user/user-add";
    }
    @PostMapping("/add")
    @ResponseBody
    public Results<SysUser> saveUser(UserDto userDto, Integer roleId){
        SysUser sysUser=null;

        sysUser= userService.getUserByPhone(userDto.getTelephone());
        if (sysUser != null && !(sysUser.getId().equals(userDto.getId()))){
            return Results.failure(ResponseCode.PHONE_REPEAT.getCode(),ResponseCode.PHONE_REPEAT.getMessage());
        }
        userDto.setStatus(1);
        userDto.setPassword(MD5.crypt(userDto.getPassword()));
        return userService.sava(userDto,roleId);
    }
    @GetMapping("/edit")
    public String addUser(Model model,SysUser sysUser) {
        model.addAttribute(userService.getUserById(sysUser.getId()));
        return "user/user-edit";
    }


    String pattern = "yyyy-MM-dd";
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder , WebRequest request){
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat(pattern),true));
    }

}
