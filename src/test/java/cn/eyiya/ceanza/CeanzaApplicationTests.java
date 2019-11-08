package cn.eyiya.ceanza;

import cn.eyiya.ceanza.dao.ArticleRepository;
import cn.eyiya.ceanza.po.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CeanzaApplicationTests {

    @Autowired
    ArticleRepository articleRepository;

    @Test
    void contextLoads() {
        Article article = articleRepository.findByAuthor("laogao");
        System.out.println(article);
    }

}
