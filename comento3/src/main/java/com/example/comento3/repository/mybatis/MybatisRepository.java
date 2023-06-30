package com.example.comento3.repository.mybatis;

import com.example.comento3.domain.Count;
import com.example.comento3.domain.RequestInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MybatisRepository {

    private final Mapper mapper;

    public RequestInfo save(RequestInfo requestInfo) {
        mapper.save(requestInfo);
        return requestInfo;
    }

    public Count selectYearLogin(String year) {
        Count count = mapper.selectYearLogin(year);
        return count;
    }

}
