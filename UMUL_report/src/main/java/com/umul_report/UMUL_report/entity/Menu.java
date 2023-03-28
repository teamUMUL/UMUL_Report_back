package com.umul_report.UMUL_report.entity;


import lombok.*;

import javax.persistence.*;

@Entity(name = "Menu")
@Table(name = "Menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuID", nullable = false)
    private Integer menuID;

    @Column(name = "menuName", nullable = false, length = 30)
    private String menuName;

    @Column(name = "gram", nullable = false)
    private Float gram;

    @Column(name = "kcal", nullable = false)
    private Integer kcal;
}
