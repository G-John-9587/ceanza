package cn.eyiya.ceanza.controller;

import cn.eyiya.ceanza.pojo.Article;
import cn.eyiya.ceanza.service.ArticleRestService;
import cn.eyiya.ceanza.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author G
 * @date 2019/11/13 15:35
 */
@Controller
@RequestMapping("/template")
public class TemplateController {

    @Resource(name = "articleServiceImpl")
    ArticleService articleService;

    @GetMapping("/freemarker")
    public String index(Model model){
        List<Article> articles = articleService.selectAll();
        model.addAttribute("articles", articles);
        return "freemarkerTemp";
    }
}
