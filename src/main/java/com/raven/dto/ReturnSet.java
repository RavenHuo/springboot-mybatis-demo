package com.raven.dto;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.raven.entity.User;

public class ReturnSet {

	
	private int totals;
	
	
	private List<?> rows;
	
	private String method;
	
	public ReturnSet() {
		System.err.println("  method: Construct");	
	}

	@PostConstruct
	public void init() {
		System.err.println("  method:   PostConstruct");
	}
	
	@PreDestroy
	public void destory() {
		System.err.println("   method:  PreDestory");
	}

	public int getTotals() {
		return totals;
	}


	public void setTotals(int totals) {
		this.totals = totals;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}


	
}
