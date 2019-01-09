package com.raven.controller;

import com.raven.dto.ReturnSet;
import com.raven.entity.User;
import com.raven.service.UserService;
import com.raven.serviceImpl.ScopeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {

    @Autowired
    UserService userService;
    
    @Autowired
    ScopeService ScopeService1;
    
    @Autowired
    ScopeService ScopeService2;

    @ResponseBody
    @RequestMapping(value="/Scope",method=RequestMethod.GET)
    public String index(){
    	System.err.println("  "+ScopeService1.equals(ScopeService2));
        return "123";
    }

    @ResponseBody
    @RequestMapping("/users/user")
    public com.raven.entity.User getUser(@RequestParam("userId") Integer userId){
        return userService.getUser(userId);
    }
    
    @ResponseBody
    @RequestMapping("/users")
    public ReturnSet listUser() {
    	ReturnSet set=new ReturnSet();
    	List<User> userList=userService.listUser();
    	set.setTotals(userList.size());
    	set.setRows(userList);
    	set.destory();
    	return set;
    }
    
    @RequestMapping("/hello")
    public String hello(Model model) {
    	model.addAttribute("hello", "123");
    	return "/index";
    }
    
    @RequestMapping("/an")
    public String angular() {
    	return "/an";
    }
}
