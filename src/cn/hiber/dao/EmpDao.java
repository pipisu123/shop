package cn.hiber.dao;

import java.util.List;

import cn.hiber.Pojo.Dept;
import cn.hiber.Pojo.Emp;

public class EmpDao extends BaseDao{

	public void save(Emp emp) {
		this.currentSession().save(emp);
	}
	
	@SuppressWarnings("unchecked")
	public List<Emp> findByDept(Dept dept) {
		String hql = "from Emp where dept = ?";
		return this.currentSession().createQuery(hql).setParameter(0, dept).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Emp> findByDept(int deptno) {
		String hql = "from Emp where dept.deptno = ?";
		return this.currentSession().createQuery(hql).setParameter(0, deptno).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Emp> findAll() {
		return this.currentSession().createQuery("from Emp").list();
	}
}
