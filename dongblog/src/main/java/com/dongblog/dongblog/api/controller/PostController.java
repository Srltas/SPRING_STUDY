package com.dongblog.dongblog.api.controller;

import com.dongblog.dongblog.api.controller.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {

    //SSR -> jsp, thymeleaf, mustache, freemarker -> html rendering
    //SPA -> vue
            // javascript로 화면 생성 + 서버와는 API(JSON)으로만 통신
    //  vue -> vue+SSR = nuxt.js
    //  react -> react+SSR = next.js

    @PostMapping("/posts")
    public String post(@RequestBody PostCreate postCreate) {
        log.info("postCreate={}", postCreate);
        return "Hello World";
    }
}
