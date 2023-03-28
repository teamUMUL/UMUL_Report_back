package com.umul_report.UMUL_report.service;

import com.umul_report.UMUL_report.entity.Eating_Habit;
import com.umul_report.UMUL_report.repository.ChildrenRepository;
import com.umul_report.UMUL_report.repository.EatingHabitRepository;
import com.umul_report.UMUL_report.repository.MemberRepository;
import org.springframework.stereotype.Service;


@Service
public class ReportServiceImpl implements ReportService {

    private final EatingHabitRepository eatingHabitRepository;
    private final ChildrenRepository childrenRepository;
    private final MemberRepository memberRepository;

    public ReportServiceImpl(EatingHabitRepository eatingHabitRepository, ChildrenRepository childrenRepository, MemberRepository memberRepository) {
        this.eatingHabitRepository = eatingHabitRepository;
        this.childrenRepository = childrenRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public Eating_Habit getEatingHabitDataByMemberEmail(String memberEmail){
        int childID = childrenRepository.getChildIDByMemberEmail(memberEmail);
        return eatingHabitRepository.findByChildren_ChildID(childID);
    }

    @Override
    public int getTotalCntByMemberEmail(String memberEmail){
        int childID = childrenRepository.getChildIDByMemberEmail(memberEmail);
        return eatingHabitRepository.getTotalCntByChildID(childID);
    }

    @Override
    public int getAvgABiteCntByMemberEmail(String memberEmail){
        int childID = childrenRepository.getChildIDByMemberEmail(memberEmail);
        return eatingHabitRepository.getAvgABiteCntByChildID(childID);
    }

    @Override
    public int getTotalTimeSecondByMemberEmail(String memberEmail){
        int childID = childrenRepository.getChildIDByMemberEmail(memberEmail);
        return eatingHabitRepository.getTotalTimeByChildID(childID);
    }

    @Override
    public String getTotalTimeByMemberEmail(String memberEmail){
        int childID = childrenRepository.getChildIDByMemberEmail(memberEmail);
        int minute = eatingHabitRepository.getTotalTimeByChildID(childID)/60;
        int second = eatingHabitRepository.getTotalTimeByChildID(childID)%60;
        return minute+"분"+second+"초";
    }

    @Override
    public String getNickNameByMemberEmail(String memberEmail){
        return memberRepository.getNickNameByMemberEmail(memberEmail);
    }



}
