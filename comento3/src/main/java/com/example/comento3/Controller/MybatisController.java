package com.example.comento3.Controller;

import com.example.comento3.domain.*;
import com.example.comento3.repository.mybatis.MybatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MybatisController {

    private final MybatisRepository mybatisRepository;

    @GetMapping("save")
    @ResponseBody
    public RequestInfo save() {
        RequestInfo save = mybatisRepository.save(
                new RequestInfo(9L,"A","AAA"));

        return save;
    }
    //년도별
    @GetMapping("sqlyearStatistic")
    @ResponseBody
    public Count year(@RequestParam("year") String year) {

        Count count = mybatisRepository.selectYearLogin(year);
        count.setYear(year);
        count.setIs_success("true");
        return count;
    }
    //월별
    @GetMapping("monthsqlStatistic")
    @ResponseBody
    public List<MonthCount> monthCounts() {

        List<MonthCount> monthCounts = mybatisRepository.selectMonthLogin();
        return monthCounts;
    }
    //일별
    @GetMapping("daysqlStatistic")
    @ResponseBody
    public List<DayCount> dayCounts() {

        List<DayCount> dayCounts = mybatisRepository.selectDayLogin();
        return dayCounts;
    }
    //평균 일별
    @GetMapping("dayAvgsqlStatistic")
    @ResponseBody
    public DayAvg dayAvg() {

       DayAvg dayAvg= mybatisRepository.selectDayAvgLogin();
        return dayAvg;
    }
    //주말제거
    @GetMapping("notweeksqlStatistic")
    @ResponseBody
    public List<NotWeek> notWeek() {

        List<NotWeek> notWeek= mybatisRepository.selectNotWeek();
        for (NotWeek notWeek1: notWeek) {
            notWeek1.converter(notWeek1);

        }

        return notWeek;
    }

    //부서별 월별
    @GetMapping("hrsqlStatistic")
    @ResponseBody
    public List<HrOrganCount> hrOrganCounts() {

        List<HrOrganCount> hrOrganCounts = mybatisRepository.selectHrMonthLogin();

        return hrOrganCounts;
    }
}
