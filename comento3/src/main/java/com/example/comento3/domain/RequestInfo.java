package com.example.comento3.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RequestInfo {
    private Long requestID;
    private String requestCode;
    private String userId;
    private String createDate;

}
