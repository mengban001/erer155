package com.xxxy.erer15.contoller;

import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.model.SysRole;
import com.xxxy.erer15.service.ImpRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * UserContoller
 *
 * @author erer
 * @date 2020/2/29
 */
@Controller
@RequestMapping("role")
@Slf4j
public class RoleContoller {
    @Autowired
    public ImpRoleService impRoleService;
    @GetMapping("/all")
    @ResponseBody
    public Results<SysRole> getAll() {
      log.info("impRoleService.getAllRoles()");
      return impRoleService.getAllRoles();
    }
}
