package cn.eyiya.ceanza.service;

import cn.eyiya.ceanza.model.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleRestService {

   ArticleVO saveArticle(ArticleVO article);

   void deleteArticle(Long id);

   void updateArticle(ArticleVO article);

   ArticleVO getArticle(Long id);

   List<ArticleVO> getAll();
}
