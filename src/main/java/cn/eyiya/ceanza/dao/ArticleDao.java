package cn.eyiya.ceanza.dao;

import cn.eyiya.ceanza.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author G
 * @date 2019/11/13 10:20
 */
public interface ArticleDao extends MongoRepository<Article, String> {
    //支持关键字查询，和jpa用法一样
    Article findByAuthor(String author);
}
