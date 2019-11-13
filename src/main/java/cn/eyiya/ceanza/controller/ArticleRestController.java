package cn.eyiya.ceanza.controller;

import cn.eyiya.ceanza.model.AjaxResponse;
import cn.eyiya.ceanza.model.Article;
import cn.eyiya.ceanza.service.ArticleRestService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Api(tags = "本类作用", value = "这是value值")
@Slf4j
@Controller
@RequestMapping("/rest")
public class ArticleRestController {

    @Resource
    ArticleRestService articleRestService;

    @Resource
    MongoRepository mongoRepository;

    @PostMapping("/article")
    public @ResponseBody AjaxResponse saveArticle(@RequestBody Article article) {
        mongoRepository.save(article);
        return  AjaxResponse.success(article);
    }
 
    @DeleteMapping("/article/{id}")
    public @ResponseBody AjaxResponse deleteArticle(@PathVariable String id) {
        mongoRepository.deleteById(id);
        return AjaxResponse.success(id);
    }
 
    @PutMapping("/article/{id}")
    public @ResponseBody AjaxResponse updateArticle(@PathVariable String id, @RequestBody Article article) {
        article.setId(id);
        mongoRepository.save(article);
        return AjaxResponse.success(article);
    }
 
    @GetMapping( "/article/{id}")
    public @ResponseBody AjaxResponse getArticle(@PathVariable String id) {
        Optional<Article> article = mongoRepository.findById(id);
        return AjaxResponse.success(article.get());
    }

    @GetMapping( "/article")
    public @ResponseBody AjaxResponse getAllArticle() {
        List<Article> article = mongoRepository.findAll();
        return AjaxResponse.success(article);
    }
}