package cn.hiber.test;

import java.util.List;

import org.junit.Test;

import cn.hiber.Pojo.Dept;
import cn.hiber.Pojo.Emp;
import cn.hiber.Pojo.Employee;
import cn.hiber.Pojo.Project;
import cn.hiber.service.EmpBiz;
import cn.hiber.service.ProjectBiz;


public class test1 {

	@Test
	public void add() {
		Emp emp=new Emp();
		emp.setEname("ggg");
		Dept dept=new Dept();
		dept.setDeptno((int)10);
		emp.setDept(dept);
		new EmpBiz().addNewEmp(emp);
	}
	@Test
	public void findEmpByDept_Obj() {
		Dept dept=new Dept();
		dept.setDeptno((int)10);
		List<Emp> empList =new EmpBiz().findEmpsByDept(dept);
		for (Emp emp : empList) {
			System.out.println("员工姓名："+emp.getEname());
		}
	}
	@Test
	public void findEmpByDept_int() {
		List<Emp> empList=new EmpBiz().findEmpsByDept(10);
		for (Emp emp : empList) {
			System.out.println("员工姓名："+emp.getEname());
		}
	}
	@Test
	public void finfAll() {
		List<Emp> empList=new EmpBiz().findAllEmps();
	}
	@Test
	public void eg13() {
		Employee employee1=new Employee(37,"张三", null);
		Employee employee2=new Employee(38,"李四", null);
		Project project1=new Project(35,"1号项目", null);
		Project project2=new Project(36,"2号项目", null);
		project2.getEmployees().add(employee1);
		project2.getEmployees().add(employee2);
		project1.getEmployees().add(employee1);
		project1.getEmployees().add(employee2);
		ProjectBiz projBiz=new ProjectBiz();
		projBiz.addNewProject(project1);
		projBiz.addNewProject(project2);
		
	}
//	@Test
//	public void eg14() {
//		Employee employee1=new Employee(1,"张三");
//		Employee employee2=new Employee(2,"李四");
//		Project project1=new Project(1,"1号项目");
//		Project project2=new Project(2,"2号项目");
//		project1.getEmployees().add(employee1);
//		project1.getEmployees().add(employee2);
//		employee1.getProjects().add()
//		ProjectBiz projBiz=new ProjectBiz();
//		projBiz.addNewProject(project1);
//		projBiz.addNewProject(project2);
//		
//	}
}
