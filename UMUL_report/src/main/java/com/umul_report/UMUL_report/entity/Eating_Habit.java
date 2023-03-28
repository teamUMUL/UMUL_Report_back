package com.umul_report.UMUL_report.entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "Eating_habit")
@Table(name = "Eating_habit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eating_Habit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "habitID", nullable = false)
    private Integer habitID;

    @Column(name = "eatdate", nullable = false)
    private Timestamp eatdate;

    @Column(name = "totalTime", nullable = false)
    private Integer totalTime;

    @Column(name = "totalCnt", nullable = false)
    private Integer totalCnt;

    @Column(name = "aBiteCnt", nullable = false)
    private Integer aBiteCnt;

    @Column(name = "avgABiteCnt", nullable = false)
    private Integer avgABiteCnt;

    @Column(name = "speed", nullable = false)
    private Float speed;

    @Column(name = "successCnt", nullable = false)
    private Integer successCnt;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="menuID", nullable = false)
    private Menu menu;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="childID", nullable = false)
    private Children children;
}
