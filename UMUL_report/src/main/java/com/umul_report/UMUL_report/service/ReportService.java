package com.umul_report.UMUL_report.service;


import com.umul_report.UMUL_report.entity.Eating_Habit;

public interface ReportService {
    Eating_Habit getEatingHabitDataByMemberEmail(String memberEmail);

    int getTotalCntByMemberEmail(String memberEmail);

    int getAvgABiteCntByMemberEmail(String memberEmail);

    int getTotalTimeSecondByMemberEmail(String memberEmail);


    String getTotalTimeByMemberEmail(String memberEmail);

    String getNickNameByMemberEmail(String memberEmail);
}
