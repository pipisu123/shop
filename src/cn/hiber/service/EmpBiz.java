package cn.hiber.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import cn.hiber.Pojo.Dept;
import cn.hiber.Pojo.Emp;
import cn.hiber.Pojo.Project;
import cn.hiber.dao.EmpDao;
import cn.hiber.dao.ProjectDao;

public class EmpBiz {

	private EmpDao empDao =new EmpDao();
	
	public void addNewEmp(Emp emp) {
		Transaction tx=null;
		try {
			tx=empDao.currentSession().beginTransaction();
			empDao.save(emp);
			tx.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
			if (tx!=null) {
				tx.rollback();
			}
		}
	}
	
	public List<Emp> findEmpsByDept(Dept dept) {
		Transaction tx=null;
		List<Emp> result=null;
		try {
			tx=empDao.currentSession().beginTransaction();
			result=empDao.findByDept(dept);
			tx.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
			if (tx!=null) {
				tx.rollback();
			}
		}
		return result;
	}
	
	public List<Emp> findEmpsByDept(int deptNo) {
		Transaction tx=null;
		List<Emp> result=null;
		try {
			tx=empDao.currentSession().beginTransaction();
			result=empDao.findByDept(deptNo);
			tx.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
			if (tx!=null) {
				tx.rollback();
			}
		}
		return result;
	}
	
	public List<Emp> findAllEmps() {
		Transaction tx=null;
		List<Emp> result=null;
		try {
			tx=empDao.currentSession().beginTransaction();
			result=empDao.findAll();
			for (Emp emp : result) {
				System.out.println("员工姓名："+emp.getEname());
				System.out.println("所在部门："+emp.getDept().getDname());
			}
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
			if (tx!=null) {
				tx.rollback();
			}
		}
		return result;
	}
//public class ProjectBiz{
//	private ProjectDao projDao=new ProjectDao();
//	public void addNewProject(Project proj) {
//		Transaction tx=null;
//		try {
//			tx=projDao.currentSession().beginTransaction();
//			projDao.save(proj);
//			tx.commit();
//		} catch (HibernateException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			if (tx!=null) {
//				tx.rollback();
//			}
//		}
//	}
//}
}
