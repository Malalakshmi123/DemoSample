package com.firstproject;

public class Courses {
	private Integer cId;
	private String cName;
	private Integer cost;
	public Courses(Integer cId, String cName, Integer cost) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cost = cost;
	}
	public Integer getcId() {
		return cId;
	}
	public String getcName() {
		return cName;
	}
	public Integer getCost() {
		return cost;
	}
	

}
