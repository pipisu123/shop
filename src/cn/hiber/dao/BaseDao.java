package cn.hiber.dao;

import org.hibernate.Session;

public class BaseDao {
    public Session currentSession() {
        return HibernateUtil.currentSession();
    }
}
