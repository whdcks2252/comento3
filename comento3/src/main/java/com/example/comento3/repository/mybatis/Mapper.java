package com.example.comento3.repository.mybatis;


import com.example.comento3.domain.Count;
import com.example.comento3.domain.RequestInfo;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    void save(RequestInfo requestInfo);

    Count selectYearLogin(String year);
}
