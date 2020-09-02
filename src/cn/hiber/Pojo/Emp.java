package cn.hiber.Pojo;

import java.util.Date;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer empno;
	private String ename;
	private String job;
	private Double sal;
	private Date hireDate;
	private Integer deptno;
	private Dept dept;

	// Constructors

	

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(Integer empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	/** full constructor */
	public Emp(Integer empno, String ename, String job, Double sal,
			Date hireDate, Integer deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.hireDate = hireDate;
		this.deptno = deptno;
	}

	// Property accessors

	public Integer getEmpno() {
		return this.empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return this.sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Integer getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
}