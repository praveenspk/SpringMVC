package com.spk.beans;

import java.io.Serializable;

public class EmpBO implements Serializable {
	private int id;
	private String ename;
	private String job;
	private int sal;
	
	public EmpBO(int id, String ename, String job, int sal) {
		super();
		this.id = id;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
