package com.cg.LAB2.bean;

public class student {
	private int studrollno;
	 private String studname;
	 private Float studmarks;
	public student(int studrollno, String studname, Float studmarks) {
		super();
		this.studrollno = studrollno;
		this.studname = studname;
		this.studmarks = studmarks;
	}
	public int getStudrollno() {
		return studrollno;
	}
	public void setStudrollno(int studrollno) {
		this.studrollno = studrollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public Float getStudmarks() {
		return studmarks;
	}
	public void setStudmarks(Float studmarks) {
		this.studmarks = studmarks;
	}
	 
	

}
