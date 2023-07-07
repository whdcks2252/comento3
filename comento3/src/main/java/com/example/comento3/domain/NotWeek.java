package com.example.comento3.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class NotWeek {
    LocalDateTime datetime;
    String daynotweek;

    public  void converter(NotWeek notWeek){
        Map<String, String> day = new HashMap<>();
        day.put("1","일");
        day.put("2","월");
        day.put("3","화");
        day.put("4","수");
        day.put("5","목");
        day.put("6","금");
        day.put("1","토");

        if (day.containsKey(notWeek.getDaynotweek())){
          notWeek.setDaynotweek(day.get(notWeek.getDaynotweek()));
        }
    }
}

