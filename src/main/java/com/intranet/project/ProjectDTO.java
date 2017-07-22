package com.intranet.project;

import java.sql.Date;

import com.intranet.emp.EmpDTO;

public class ProjectDTO{
	private int p_num;
	private String p_title;
	private int p_budget;
	private Date p_start;
	private Date p_last;
	private String p_contents;
	private int p_dday;
	private String emp_name;
	private String emp_grade;
	private String dept_name;
	private int [] emp_num;
	
	
	public String getEmp_grade() {
		return emp_grade;
	}
	public void setEmp_grade(String emp_grade) {
		this.emp_grade = emp_grade;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	public int[] getEmp_num() {
		return emp_num;
	}
	public void setEmp_num(int[] emp_num) {
		this.emp_num = emp_num;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public int getP_budget() {
		return p_budget;
	}
	public void setP_budget(int p_budget) {
		this.p_budget = p_budget;
	}
	public Date getP_start() {
		return p_start;
	}
	public void setP_start(Date p_start) {
		this.p_start = p_start;
	}
	public Date getP_last() {
		return p_last;
	}
	public void setP_last(Date p_last) {
		this.p_last = p_last;
	}
	public String getP_contents() {
		return p_contents;
	}
	public void setP_contents(String p_contents) {
		this.p_contents = p_contents;
	}
	public int getP_dday() {
		return p_dday;
	}
	public void setP_dday(int p_dday) {
		this.p_dday = p_dday;
	}
	
	

	
	
	
}
