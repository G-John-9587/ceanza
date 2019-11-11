package cn.eyiya.ceanza.service;

import cn.eyiya.ceanza.pojo.Article;

/**
 * @author G
 * @date 2019/11/11 15:49
 */
public interface ArticleService {
    int deleteByPrimaryKey(Long id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}
