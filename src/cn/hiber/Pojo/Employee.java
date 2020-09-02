package cn.hiber.Pojo;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empid;
	private String empname;
	private Integer rempid;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(Integer empid) {
		this.empid = empid;
	}

	/** full constructor */
	public Employee(Integer empid, String empname, Integer rempid) {
		this.empid = empid;
		this.empname = empname;
		this.rempid = rempid;
	}

	// Property accessors

	public Integer getEmpid() {
		return this.empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Integer getRempid() {
		return this.rempid;
	}

	public void setRempid(Integer rempid) {
		this.rempid = rempid;
	}

}