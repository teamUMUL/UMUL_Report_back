package com.umul_report.UMUL_report.repository;


import com.umul_report.UMUL_report.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

    @Query(value = "SELECT nickname FROM Member WHERE memberEmail = ?1", nativeQuery = true)
    String getNickNameByMemberEmail(String memberEmail);
}
