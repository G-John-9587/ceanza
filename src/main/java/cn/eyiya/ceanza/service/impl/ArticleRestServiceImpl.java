package cn.eyiya.ceanza.service.impl;

import cn.eyiya.ceanza.dao.ArticleRepository;
import cn.eyiya.ceanza.model.ArticleVO;
import cn.eyiya.ceanza.po.Article;
import cn.eyiya.ceanza.service.ArticleRestService;
import cn.eyiya.ceanza.util.DozerUtils;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author G
 * @date 2019/11/8 14:40
 */
@Slf4j
@Service
public class ArticleRestServiceImpl implements ArticleRestService {
    @Resource
    private ArticleRepository articleRepository;
    @Resource
    private Mapper dozerMap;

    public ArticleVO saveArticle(ArticleVO article){
        Article article1Po = dozerMap.map(article, Article.class);
        articleRepository.save(article1Po);
        return article;
    }

    public void deleteArticle(Long id){
        articleRepository.deleteById(id);
    }

    public void updateArticle(ArticleVO article){
        Article article1Po = dozerMap.map(article, Article.class);
        articleRepository.save(article1Po);
    }

    public ArticleVO getArticle(Long id){
        Optional<Article> article = articleRepository.findById(id);
        return dozerMap.map(article.get(), ArticleVO.class);
    }

    public List<ArticleVO> getAll(){
        List<Article> articleList = articleRepository.findAll();
        return DozerUtils.mapList(articleList, ArticleVO.class);
    }

}
