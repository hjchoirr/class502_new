package com.choongang.Book.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Author extends BaseEntity{
    @Id
    @Column(length = 5, nullable = false, unique = true)
    private String authorCd;

    @Column(length = 50, nullable = false, unique = true)
    private String authorName;

    @ToString.Exclude
    @OneToMany(mappedBy = "author")
    private List<Book> books;

}
