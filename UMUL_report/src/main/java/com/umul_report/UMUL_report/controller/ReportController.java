package com.umul_report.UMUL_report.controller;

import com.umul_report.UMUL_report.DTO.Report;
import com.umul_report.UMUL_report.entity.Member;
import com.umul_report.UMUL_report.service.FeedbackService;
import com.umul_report.UMUL_report.service.ReportServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportController {

    private final ReportServiceImpl umulServiceImpl;

    private final FeedbackService feedbackService;

    public ReportController(ReportServiceImpl umulServiceImpl, FeedbackService feedbackService) {
        this.umulServiceImpl = umulServiceImpl;
        this.feedbackService = feedbackService;
    }

    @PostMapping("/umul")
    public Report reportData(Member member){

        Report report = new Report();

        //정보
        int totalCnt = umulServiceImpl.getTotalCntByMemberEmail(member.getMemberEmail()); //총 저작횟수
        int totalTimeBySecond = umulServiceImpl.getTotalTimeSecondByMemberEmail(member.getMemberEmail()); //총 식사시간(~초)(피드백에 사용)
        String totalTime = umulServiceImpl.getTotalTimeByMemberEmail(member.getMemberEmail()); //총 식사시간(~분 ~초)
        int avgABiteCnt = umulServiceImpl.getAvgABiteCntByMemberEmail(member.getMemberEmail()); //한 입당 평균 저작횟수
        String nickname = member.getNickname(); //닉네임

        //닉네임
        report.setNickname(nickname);

        //유저정보
        report.setUserTotalCnt(totalCnt);
        report.setUserTotalTime(totalTime);
        report.setUserAvgABiteCnt(avgABiteCnt);

        //피드백
        report.setTotalCntFeedback(feedbackService.getTotalCntFeedback(totalCnt));
        report.setTotalTimeFeedback(feedbackService.getTotalTimeFeedback(totalTimeBySecond));
        report.setAvgABiteCntFeedback(feedbackService.getAvgABiteCntFeedback(avgABiteCnt));

        return report;
    }

}
