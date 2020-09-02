package cn.hiber.Pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private Integer proid;
	private String proname;
	private Integer rproid;

	// Constructors
private Set<Employee> employees=new HashSet<Employee>(0);
public Set<Employee> getEmployees(){
	return employees;
}
public void setEmployees(Set<Employee> employees){
	this.employees=employees;
}
	/** default constructor */
	public Project() {
	}

	/** minimal constructor */
	public Project(Integer proid) {
		this.proid = proid;
	}

	/** full constructor */
	public Project(Integer proid, String proname, Integer rproid) {
		this.proid = proid;
		this.proname = proname;
		this.rproid = rproid;
	}

	// Property accessors

	public Integer getProid() {
		return this.proid;
	}

	public void setProid(Integer proid) {
		this.proid = proid;
	}

	public String getProname() {
		return this.proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public Integer getRproid() {
		return this.rproid;
	}

	public void setRproid(Integer rproid) {
		this.rproid = rproid;
	}

}