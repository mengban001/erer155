package com.xxxy.erer15.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ApiContoller
 *
 * @author erer
 * @date 2020/2/29
 */
@Controller
@RequestMapping("${api-url}")
public class ApiContoller {
    @RequestMapping("/getPage")
    private ModelAndView getPage(ModelAndView modelAndView,String pageName){
        modelAndView.setViewName(pageName);
        return modelAndView;
    }
}
