package com.umul_report.UMUL_report.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Member")
@Table(name = "Member")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    @Column(name = "memberEmail", nullable = false, length = 40)
    private String memberEmail;

    @Column(name = "nickname", nullable = false, length = 10)
    private String nickname;
}

