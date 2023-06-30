package com.example.comento3.Controller;

import com.example.comento3.domain.Count;
import com.example.comento3.domain.RequestInfo;
import com.example.comento3.repository.mybatis.MybatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @GetMapping("sqlyearStatistic")
    @ResponseBody
    public Count year(@RequestParam("year") String year) {

        Count count = mybatisRepository.selectYearLogin(year);
        count.setYear(year);
        count.setIs_success("true");
        return count;
    }

}
