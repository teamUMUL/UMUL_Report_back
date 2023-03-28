package com.umul_report.UMUL_report.repository;



import com.umul_report.UMUL_report.entity.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ChildrenRepository extends JpaRepository<Children, Long> {
    //Children findByMemberData_MemberEmail(String memberEmail);

    //Long findChildIDByMemberData_MemberEmail(String memberEmail);

    @Query(value = "SELECT childID FROM Children WHERE memberEmail = ?1", nativeQuery = true)
    int getChildIDByMemberEmail(String memberEmail);
}

