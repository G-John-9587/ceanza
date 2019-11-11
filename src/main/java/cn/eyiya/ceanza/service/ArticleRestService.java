package cn.eyiya.ceanza.service;

import cn.eyiya.ceanza.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ArticleRestService {

    public String saveArticle(Article article){
        log.info("success save" + article);
        return "测试";
    }
}
