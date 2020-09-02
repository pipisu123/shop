package cn.hiber.dao;

import cn.hiber.Pojo.Project;

public class ProjectDao extends BaseDao{
public void save(Project proj){
	this.currentSession().save(proj);
}
}
