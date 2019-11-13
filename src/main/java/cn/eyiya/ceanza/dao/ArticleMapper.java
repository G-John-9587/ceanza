package cn.eyiya.ceanza.dao;

import cn.eyiya.ceanza.pojo.Article;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> selectAll();
}