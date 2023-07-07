package com.example.comento3.repository.mybatis;

import com.example.comento3.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<MonthCount> selectMonthLogin() {
        List<MonthCount> count = mapper.selectMonthLogin();
        return count;
    }
    public List<DayCount> selectDayLogin() {
        List<DayCount> count = mapper.selectDayLogin();
        return count;
    }
    public DayAvg  selectDayAvgLogin(){
        DayAvg dayAvg = mapper.selectDayAvgLogin();
        return dayAvg;
    }
    public List<NotWeek> selectNotWeek(){
        List<NotWeek> notWeek = mapper.selectNotWeek();
        return notWeek;
    }
    public List<HrOrganCount> selectHrMonthLogin() {
        List<HrOrganCount> count = mapper.selectHrMonthLogin();
        return count;
    }
}
