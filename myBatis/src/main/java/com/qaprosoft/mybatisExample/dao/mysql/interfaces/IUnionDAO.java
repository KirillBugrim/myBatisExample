package com.qaprosoft.mybatisExample.dao.mysql.interfaces;

import com.qaprosoft.mybatisExample.model.Union;

import java.util.List;

public interface IUnionDAO {

    void createUnion(Union union);

    void createUnions(List<Union> unions);

    Union getUnionById(long id);

    void updateUnionName(Union union);

    void deleteUnionById(long id);

    void deleteUnion(Union union);
}
