package com.qaprosoft.mybatisExample.dao.mysql.impl;

import com.qaprosoft.mybatisExample.dao.mysql.SessionFactory;
import com.qaprosoft.mybatisExample.dao.mysql.interfaces.IUnionDAO;
import com.qaprosoft.mybatisExample.model.Union;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class UnionDAO implements IUnionDAO {


    public void createUnion(Union union) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.insert("unionMapping.createUnion", union);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Override
    public void createUnions(List<Union> unions) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.insert("unionMapping.insertUnions", unions);
            session.commit();
        } finally {
            session.close();
        }

    }

    public Union getUnionById(long id) {
        Union union;
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            union = session.selectOne("unionMapping.getUnionById", id);
            session.commit();
        } finally {
            session.close();
        }
        return union;
    }

    public void updateUnionName(Union union) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.update("unionMapping.updateUnionName", union);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteUnionById(long id) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.delete("unionMapping.deleteUnionById", id);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteUnion(Union union) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.delete("unionMapping.deleteUnion", union);
            session.commit();
        } finally {
            session.close();
        }
    }
}
