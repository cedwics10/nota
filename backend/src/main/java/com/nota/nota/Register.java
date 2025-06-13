package com.nota.nota;

import dao.ArticleRepository;
import entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class Register {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/register")
    public String register() {
  
        List<Article> tout = articleRepository.findAll();

        boolean test = true;
        return test ? "foo" : "bar2";
    }
}
