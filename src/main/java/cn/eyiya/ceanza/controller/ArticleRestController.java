package cn.eyiya.ceanza.controller;

import cn.eyiya.ceanza.model.AjaxResponse;
import cn.eyiya.ceanza.pojo.Article;
import cn.eyiya.ceanza.service.ArticleRestService;
import cn.eyiya.ceanza.service.ArticleService;
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

    @Resource
    ArticleRestService articleRestService;
    @Resource
    ArticleService articleService;

    //swagger使用示例
    //访问地址http://localhost:8900/swagger-ui.html
    //方法说明
    @ApiOperation(value = "添加文章", notes = "添加新的文章", tags = "Article",httpMethod = "POST")
    /*参数说明，这里用的是@RequestBody传的对象，不需要使用
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "文章标题", required = true, dataType = "String"),
            @ApiImplicitParam(name = "content", value = "文章内容", required = true, dataType = "String"),
            @ApiImplicitParam(name = "author", value = "文章作者", required = true, dataType = "String")
    })*/
    //返回值描述
    @ApiResponses({
            @ApiResponse(code=200,message="成功",response=AjaxResponse.class),
            @ApiResponse(code=400,message="用户输入错误",response=AjaxResponse.class),
            @ApiResponse(code=500,message="系统内部错误",response=AjaxResponse.class),

    })

    //@RequestMapping(value = "/article", method = POST, produces = "application/json")
    @PostMapping("/article")
    public @ResponseBody AjaxResponse saveArticle(@RequestBody Article article) {
    /*public @ResponseBody  AjaxResponse saveArticle(@RequestParam String  id,
                                                   @RequestParam String  author) {*/

        log.info("saveArticle：{}",article);
        //articleRestService.saveArticle(article);
        articleService.insert(article);
        articleService.updateByPrimaryKey(article);
        articleService.updateByPrimaryKey(article);
        //log.info("我要看打桩效果："+articleRestService.saveArticle(article));
        return  AjaxResponse.success(article);
    }
 
    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    public @ResponseBody AjaxResponse deleteArticle(@PathVariable Long id) {

        log.info("deleteArticle：{}",id);
        articleService.deleteByPrimaryKey(id);
        return AjaxResponse.success(id);
    }
 
    //@RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    public @ResponseBody AjaxResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        articleService.updateByPrimaryKey(article);
        log.info("updateArticle：{}",article);
        return AjaxResponse.success(article);
    }
 
    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping( "/article/{id}")
    public @ResponseBody AjaxResponse getArticle(@PathVariable Long id) {
        Article article = articleService.selectByPrimaryKey(id);
        return AjaxResponse.success(article);
    }
}