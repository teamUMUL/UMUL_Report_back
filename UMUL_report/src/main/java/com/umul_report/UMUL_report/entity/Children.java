package com.umul_report.UMUL_report.entity;


import lombok.*;

import javax.persistence.*;

@Entity(name = "Children")
@Table(name = "Children")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer childID;

    @Column(name = "height", nullable = false)
    private Float height;

    @Column(name = "weight", nullable = false)
    private Float weight;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "gender",nullable = false, length = 2)
    private String gender;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="memberEmail", nullable = false)
    private Member memberData;

}


