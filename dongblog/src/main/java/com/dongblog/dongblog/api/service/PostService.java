package com.dongblog.dongblog.api.service;

import com.dongblog.dongblog.api.domain.Post;
import com.dongblog.dongblog.api.repository.PostRepository;
import com.dongblog.dongblog.api.request.PostCreate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void write(PostCreate postCreate) {
        Post post = Post.builder()
                .title(postCreate.getContent())
                .content(postCreate.getContent())
                .build();

        postRepository.save(post);
    }
}