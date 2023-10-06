package com.example.dasom.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/gpt")
public class OpenAiController {
    private String apiKey = "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";
    private String endPoint = "https://api.openai.com/v1/chat/completions";

    @PostMapping("/question")
    public Mono<Map> question(@RequestBody Map<String, String> body){


        System.out.println(body.get("content"));

        Map<String, Object> setting = new HashMap<>();
        setting.put("role", "system");
        setting.put("content", "너는 최고의 상담사야, 우리 웹사이트에 대해 뭐든 답변해줄 수 있어" +
                "답변 할 수 없는 내용은 회사 번호로 연락하라고 알려줘야 해" +
                "우리 회사 전화 번호는 02-1234-1234이고 고객이 물어보면 전화번호를 알려줘야해" +
                "사용자가 불평하면 위로해줘야 해");

        Map<String, Object> message = new HashMap<>();
        message.put("role", "user");
        message.put("content", body.get("content"));

        List<Map> messages = List.of(setting, message);

        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("model", "gpt-3.5-turbo");
        reqBody.put("messages", messages);
//        reqBody.put("temperature", 0.8);
//        reqBody.put("max_tokens", 1000);

        WebClient webClient = WebClient.builder()
                .baseUrl(endPoint)
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        Mono<Map> resultBody = webClient.post()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(reqBody))
                .retrieve()
                .bodyToMono(Map.class);

        System.out.println(resultBody.toString());
        return resultBody;
    }
}
