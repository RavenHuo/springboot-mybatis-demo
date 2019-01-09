package com.raven.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.raven.dto.ReturnSet;
import com.raven.entity.User;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public ReturnSet get(User user) {
		ReturnSet set=new ReturnSet();
		System.err.println(user.getUserId());
		set.setTotals(1);
		List<User> list=new ArrayList<>();
		list.add(user);
		set.setRows(list);
		set.setMethod("GET");
		return set;
	}

	@RequestMapping(value="/post",method=RequestMethod.POST)
	public ReturnSet post(User user) {
		ReturnSet set=new ReturnSet();
		System.err.println(user.getUserId());
		set.setTotals(1);
		List<User> list=new ArrayList<>();
		list.add(user);
		set.setRows(list);
		set.setMethod("POST");
		return set;
	}
	
	@RequestMapping(value="/put",method=RequestMethod.PUT)
	public ReturnSet put(User user) {
		ReturnSet set=new ReturnSet();
		System.err.println(user.getUserId());
		set.setTotals(1);
		List<User> list=new ArrayList<>();
		list.add(user);
		set.setRows(list);
		set.setMethod("PUT");
		return set;
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public ReturnSet delete(User user) {
		ReturnSet set=new ReturnSet();
		System.err.println(user.getUserId());
		set.setTotals(1);
		List<User> list=new ArrayList<>();
		list.add(user);
		set.setRows(list);
		set.setMethod("DELETE");
		return set;
	}
	
}
