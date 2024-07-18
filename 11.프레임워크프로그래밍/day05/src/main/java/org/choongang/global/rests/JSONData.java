package org.choongang.global.rests;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor // 기본 생성자도..
@RequiredArgsConstructor  // NonNull 인 필드 생성자 매개 변수에..
public class JSONData {
    private HttpStatus status = HttpStatus.OK; // 성공이 대부분
    private boolean success = true;
    private Object message;
    @NonNull
    private Object data;
}
