package cn.eyiya.ceanza.dao;

import cn.eyiya.ceanza.po.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author G
 * @date 2019/11/8 14:27
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
    public Article findByAuthor(String name);
}
