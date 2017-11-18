package com.qaprosoft.mybatisExample.services;


import com.qaprosoft.mybatisExample.interfaces.UnionMapper;
import com.qaprosoft.mybatisExample.model.Union;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UnionService {

    @Autowired
    private UnionMapper unionMapper;

    @Transactional(rollbackFor = Exception.class)
    public void createUnion(Union union){
        unionMapper.createUnion(union);
    }

    @Transactional(readOnly = true)
    public Union getUnionById(long id){
      return unionMapper.getUnionById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateUnionById(Union union){
        unionMapper.updateUnionName(union);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteUnionById(long id){
        unionMapper.deleteUnionById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteUnion(Union union){
        unionMapper.deleteUnion(union);
    }

}
