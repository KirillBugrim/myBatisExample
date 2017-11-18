package com.qaprosoft.mybatisExample.interfaces;

import com.qaprosoft.mybatisExample.model.Union;
import org.apache.ibatis.annotations.Insert;

import java.util.List;


public interface UnionMapper {


    void createUnion(Union union);

    void createUnions(List<Union> unions);

    Union getUnionById(long id);

    void updateUnionName(Union union);

    void deleteUnionById(long id);

    void deleteUnion(Union union);
}
