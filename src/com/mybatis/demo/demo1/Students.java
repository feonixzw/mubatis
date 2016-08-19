package com.mybatis.demo.demo1;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Students")
public class Students implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2558987453600893160L;
	
	
	private Integer iid;
	
	private String name;
	
	private Double sal;

	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
	

}
