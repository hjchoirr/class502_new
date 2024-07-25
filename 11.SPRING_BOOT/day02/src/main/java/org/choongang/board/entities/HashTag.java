package org.choongang.board.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HashTag {
    @Id
    private String tag;

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private List<BoardData> items;
}
