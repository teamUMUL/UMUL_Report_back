package com.umul_report.UMUL_report.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Report {
    private String nickname;
    private int userTotalCnt;
    private String userTotalTime;
    private int userAvgABiteCnt;
    private String totalCntFeedback;
    private String totalTimeFeedback;
    private String avgABiteCntFeedback;
}
