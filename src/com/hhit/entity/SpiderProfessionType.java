package com.hhit.entity;
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : SpiderProfessionType.java
//  @ Date : 2016/4/18
//  @ Author : 
//
//




public class SpiderProfessionType {
	private Integer id;
	private String name;
	private String url;
	/** 默认构造函数 */
	public SpiderProfessionType(){
		
	}
	/** 构造函数 */
	public SpiderProfessionType(String n,String u){
		name=n;
		url=u;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
