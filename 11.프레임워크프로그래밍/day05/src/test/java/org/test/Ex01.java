package org.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.choongang.config.MvcConfig;
import org.choongang.exam.PostData;
import org.choongang.member.controllers.RequestJoin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class Ex01 {

    @Autowired
    private ObjectMapper om;

    @Test
    void test1() throws UnsupportedEncodingException {
        URI uri = UriComponentsBuilder.fromUriString("https://www.naver.com")
            .path("/news/{0}")
            .queryParam("t1", "v1")
            .queryParam("t2", "v2")
            .queryParam("t3", "한글")
            .queryParam("t4", "aa{1}")
            .fragment("hash")
            //.encode()  // encoding 된 문자열이 존재함을 알려주기
            .build("AAA", "BBB");
        System.out.println(uri);
    }

    @Test
    void test2() {

        RestTemplate restTemplate = new RestTemplate();
        PostData data = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", PostData.class);

        System.out.println(data);
    }

    @Test
    void test3() throws Exception{
        RestTemplate restTemplate = new RestTemplate();
        String body = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", String.class);


        PostData data = om.readValue(body, PostData.class);
        System.out.println(data);

        String itemsBody = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", String.class);

        List<PostData> items = om.readValue(itemsBody, new TypeReference<>(){});
        //List<PostData> items = om.readValue(itemsBody, new TypeReference<List<PostData>>(){});
        items.forEach(System.out::println);
    }

    @Test
    void test4() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        RequestJoin requestJoin = new RequestJoin();
        requestJoin.setEmail("user02@test.com");
        requestJoin.setPassword("user02@test.com");
        requestJoin.setConfirmPassword(requestJoin.getPassword());
        requestJoin.setUserName("사용자02");
        requestJoin.setRegDt(LocalDateTime.now());
        requestJoin.setAgree(true);

        String params = om.writeValueAsString(requestJoin);
        System.out.println(params);

        HttpHeaders headers = new HttpHeaders();
        //headers.add("Content-Type", "application/json"); //아래 줄과 동일
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>(params, headers);
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:3000/day05/api/member", request, String.class);

        System.out.println(response);
    }

    @Test
    @DisplayName("일반 양식 POST : Content-Type: application/x-www-form-urlencoded")
    void test5() {
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> joinParams = new LinkedMultiValueMap<>();
        joinParams.add("email", "user03@test.com");
        joinParams.add("password", "user03@test.com");
        joinParams.add("confirmPassword", "user03@test.com");
        joinParams.add("userName", "user03");
        joinParams.add("regDt", LocalDateTime.now().toString());
        joinParams.add("agree", "true");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(joinParams, headers);

        String url = "http://localhost:3000/day05/member/join";
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

        System.out.println(response);
    }
}
