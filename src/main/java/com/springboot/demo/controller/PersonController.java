package com.springboot.demo.controller;

import com.springboot.demo.model.Person;
import com.springboot.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    // 设置访问路由值为路径
    @RequestMapping("/")
    public ModelAndView index(){
       ModelAndView mav=new ModelAndView("index");
       List<Person> list=personService.getAll();
       mav.addObject("list",list);
       return mav;
    }
}
