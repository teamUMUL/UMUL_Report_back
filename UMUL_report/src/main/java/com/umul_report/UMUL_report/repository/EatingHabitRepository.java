package com.umul_report.UMUL_report.repository;


import com.umul_report.UMUL_report.entity.Eating_Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface EatingHabitRepository extends JpaRepository<Eating_Habit, Long> {
    Eating_Habit findByChildren_ChildID(int childID);

    @Query(value = "SELECT totalCnt FROM Eating_habit WHERE childID = ?1", nativeQuery = true)
    int getTotalCntByChildID(int childID);

    @Query(value = "SELECT avgABiteCnt FROM Eating_habit WHERE childID = ?1", nativeQuery = true)
    int getAvgABiteCntByChildID(int childID);

    @Query(value = "SELECT totalTime FROM Eating_habit WHERE childID = ?1", nativeQuery = true)
    int getTotalTimeByChildID(int childID);

}


