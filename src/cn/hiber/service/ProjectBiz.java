package cn.hiber.service;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import cn.hiber.Pojo.Project;
import cn.hiber.dao.ProjectDao;

public class ProjectBiz {
	private ProjectDao projDao=new ProjectDao();
	public void addNewProject(Project proj) {
		Transaction tx=null;
		try {
			tx=projDao.currentSession().beginTransaction();
			projDao.save(proj);
			tx.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
			if (tx!=null) {
				tx.rollback();
			}
		}
	}
}
