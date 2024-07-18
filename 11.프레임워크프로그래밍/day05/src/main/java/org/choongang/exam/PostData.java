package org.choongang.exam;

import lombok.Data;

@Data
public class PostData {
    private String userId;
    private long id;
    private String title;
    private String body;
}
