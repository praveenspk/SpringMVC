package com.spk.dto;

import java.io.Serializable;

public class EmpDTO implements Serializable{

	private int id;
	private String name;
	private String job;
	private int sal;
	
	public EmpDTO(int id, String name, String job, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
