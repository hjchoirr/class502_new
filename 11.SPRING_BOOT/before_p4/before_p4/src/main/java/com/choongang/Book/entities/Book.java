package com.choongang.Book.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseEntity{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookSeq;

    @Column(length=100, nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorCd")
    private Author author;

    @Column(length = 50, nullable = false)
    private String publisher;

    @Column(nullable = false)
    private int pubYear;

    private String content;

}
