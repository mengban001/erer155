package com.xxxy.erer15.controller;

import com.xxxy.erer15.base.result.PageTableRequest;
import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.model.Student;
import com.xxxy.erer15.service.StudentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.security.access.prepost.PreAuthorize;

@Controller
@RequestMapping("student")
@Slf4j
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/list")
	@ApiOperation(value = "分页获取用户信息", notes = "分页获取用户信息")//描述
	@ApiImplicitParam(name = "request", value = "分页查询实体类", required=false)
	@ResponseBody
	@PreAuthorize("hasAuthority('sys:studnet:query')")
	public Results<Student> getStudnets(PageTableRequest request) {
		request.countOffset();
		return studentService.getAllstudnetsByPage(request.getOffset(),request.getLimit());
	}


}
