package com.example.comento3.repository.mybatis;


import com.example.comento3.domain.*;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    void save(RequestInfo requestInfo);

    Count selectYearLogin(String year);
    List<MonthCount> selectMonthLogin();

    List<DayCount> selectDayLogin();
    DayAvg selectDayAvgLogin();
    List<NotWeek> selectNotWeek();
    List<HrOrganCount> selectHrMonthLogin();
}
