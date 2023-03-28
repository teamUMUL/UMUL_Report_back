package com.umul_report.UMUL_report.service;


import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService{

    @Override
    public String getTotalCntFeedback(int totalCnt) {
        String totalCntFeedback = "";
        if(totalCnt>=610){
            totalCntFeedback = "잘하고 있습니다! 지금의 식습관을 유지하세요!";
        }
        else{
            totalCntFeedback = "꼭꼭 씹어먹을수록 침의 분비가 활성화되어 원활한 소화작용을 돕습니다. 다음번 식사에서는 목표치에 도전해보세요!";
        }
        return totalCntFeedback;
    }

    @Override
    public String getTotalTimeFeedback(int totalTime) {
        String totalTimeFeedback = "";
        if(totalTime>=960){
            totalTimeFeedback="잘하고 있습니다! 지금의 식습관을 유지하세요!";
        }
        else {
            totalTimeFeedback="일반적으로 식사 시작 후 20분부터 포만감을 느낍니다. 이를 통해 과식을 방지하고 비만을 예방할 수 있습니다. 다음번 식사에서는 목표치에 도전해보세요!";
        }
        return totalTimeFeedback;
    }

    @Override
    public String getAvgABiteCntFeedback(int avgABiteCnt) {
        String avgABiteCntFeedback = "";
        if (avgABiteCnt>=33){
            avgABiteCntFeedback="잘하고 있습니다! 지금의 식습관을 유지하세요! ";
        }
        else{
            avgABiteCntFeedback="꼭꼭 씹어먹을수록 잇몸근육을 자극해 치아건강을 지킬 수 있습니다. 다음번 식사에서는 목표치에 도전해보세요!";
        }
        return avgABiteCntFeedback;
    }
}
