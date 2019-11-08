package cn.eyiya.ceanza.controller;

import cn.eyiya.ceanza.model.AjaxResponse;
import cn.eyiya.ceanza.model.ArticleVO;
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

    @Resource(name = "articleRestServiceImpl")
    ArticleRestService articleRestService;

    @PostMapping("/article")
    public @ResponseBody AjaxResponse saveArticle(@RequestBody ArticleVO articleVO) {
        articleRestService.saveArticle(articleVO);
        return  AjaxResponse.success(articleVO);
    }
 
    @DeleteMapping("/article/{id}")
    public @ResponseBody AjaxResponse deleteArticle(@PathVariable Long id) {
        articleRestService.deleteArticle(id);
        return AjaxResponse.success(id);
    }
 
    @PutMapping("/article/{id}")
    public @ResponseBody AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVO articleVO) {
        articleVO.setId(id);
        articleRestService.updateArticle(articleVO);
        return AjaxResponse.success(articleVO);
    }
 
    @GetMapping( "/article/{id}")
    public @ResponseBody AjaxResponse getArticle(@PathVariable Long id) {
        return AjaxResponse.success(articleRestService.getArticle(id));
    }

    @GetMapping( "/article")
    public @ResponseBody AjaxResponse getAll() {
        return AjaxResponse.success(articleRestService.getAll());
    }
}