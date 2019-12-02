package com.wt.dao;


import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
public class BaseDao {
    @Resource
    SessionFactory sessionFactory;
    //封装SessionFactory
    private Session getsession(){
        return sessionFactory.openSession();
    }

    //新增
    public void add(Object object){
        Session session = getsession();
        session.save(object);
        session.flush();
        session.close();
    }

    //查询
    public List list(String sql){
        Session session = getsession();
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        //把结果变形为Map集合
        sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List list = sqlQuery.list();
        session.close();
        return list;
    }
}