package com.xxxy.erer15.contoller;

import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.service.ImpRoleUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RoleUserController
 *
 * @author erer
 * @date 2020/3/1
 */

@RestController
@RequestMapping("roleuser")
@Slf4j
public class RoleUserController {
    @Autowired
    private ImpRoleUserService impRoleUserService;
    @PostMapping("/getRoleUserByUserId")
    public Results savaUser(Integer userId){
        log.info("RoleUserController.getRoleUserController:pram="+userId);
        return impRoleUserService.getSysRoleUserByUserId(userId);
    }

}
