package cn.eyiya.ceanza.service.impl;

import cn.eyiya.ceanza.dao.ArticleMapper;
import cn.eyiya.ceanza.pojo.Article;
import cn.eyiya.ceanza.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author G
 * @date 2019/11/11 15:50
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Article record) {
        return articleMapper.insert(record);
    }

    @Override
    public int insertSelective(Article record) {
        return articleMapper.insertSelective(record);
    }

    @Override
    public Article selectByPrimaryKey(Long id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Article record) { return articleMapper.updateByPrimaryKey(record); }

    public List<Article> selectAll(){
        return articleMapper.selectAll();
    }
}
