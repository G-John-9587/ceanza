package cn.eyiya.ceanza.controller;

import cn.eyiya.ceanza.model.AjaxResponse;
import cn.eyiya.ceanza.model.Article;
import cn.eyiya.ceanza.service.ArticleRestService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "本类作用", value = "这是value值")
@Slf4j
@Controller
@RequestMapping("/rest")
public class ArticleRestController {

    @Resource(name="articleRestJDBCServiceImpl")
    ArticleRestService articleRestService;

    @PostMapping("/article")
    public @ResponseBody AjaxResponse saveArticle(@RequestBody Article article) {
        articleRestService.saveArticle(article);
        return  AjaxResponse.success(article);
    }
 

    @DeleteMapping("/article/{id}")
    public @ResponseBody AjaxResponse deleteArticle(@PathVariable Long id) {

        log.info("deleteArticle：{}",id);
        articleRestService.deleteById(id);
        return AjaxResponse.success(id);
    }
 

    @PutMapping("/article/{id}")
    public @ResponseBody AjaxResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);

        log.info("updateArticle：{}",article);
        articleRestService.updateById(article);
        return AjaxResponse.success(article);
    }
 

    @GetMapping( "/article/{id}")
    public @ResponseBody AjaxResponse getArticle(@PathVariable Long id) {

        return AjaxResponse.success(articleRestService.findById(id));
    }

    @GetMapping( "/article")
    public @ResponseBody AjaxResponse getAllArticle() {

        return AjaxResponse.success(articleRestService.findAll());
    }
}