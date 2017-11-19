package com.qaprosoft.mybatisExample.services;


import com.qaprosoft.mybatisExample.interfaces.UnionMapper;
import com.qaprosoft.mybatisExample.model.Country;
import com.qaprosoft.mybatisExample.model.Union;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UnionService {

    @Autowired
    private UnionMapper unionMapper;

    @Transactional(rollbackFor = Exception.class)
    public void createUnions(List<Union> unions){
        unionMapper.createUnions(unions);
    }

    @Transactional(rollbackFor = Exception.class)
    public void createUnion(Union union){
        unionMapper.createUnion(union);
    }

    @Transactional(readOnly = true)
    public Union getUnionById(long id){
      return unionMapper.getUnionById(id);
    }

    @Transactional(readOnly = true)
    public Union getUnionByName(String name){
        return unionMapper.getUnionByName(name);
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

    @Transactional(rollbackFor = Exception.class)
    public void deleteAllUnions(){
        unionMapper.deleteAllUnions();
    }

    @Transactional(rollbackFor = Exception.class)
    public void addCountryToUnion(Union union, Country country){
        unionMapper.addCountry2Union(union.getId(), country.getId());
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCountryFromUnion(Union union, Country country){
        unionMapper.deleteCountryFromUnion(union.getId(), country.getId());
    }

    @Transactional(readOnly = true)
    public Long getCountAllUnoins(){
        return unionMapper.getCountAllUnions();
    }

    @Transactional(readOnly = true)
    public List<Union> getAllUnionsByCountryName(String name){
        return unionMapper.getAllUnionsByCountryName(name);
    }

    @Transactional(readOnly = true)
    public List<Union> getAllUnionsByCountry(Country country){
        return unionMapper.getAllUnionsByCountry(country);
    }

}
