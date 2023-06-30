package com.example.comento3.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RequestInfo {
    public RequestInfo(Long requestID, String requestCode, String userId) {
        this.requestID = requestID;
        this.requestCode = requestCode;
        this.userId = userId;
    }

    private Long requestID;
    private String requestCode;
    private String userId;
    private String createDate;

}
