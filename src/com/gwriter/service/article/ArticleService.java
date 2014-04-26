package com.gwriter.service.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwriter.dao.BaseDao;
import com.gwriter.domain.article.Article;
import com.gwriter.domain.article.Comment;

@SuppressWarnings("unchecked")
@Service
public class ArticleService {
   
	@SuppressWarnings("rawtypes")
	@Autowired
	private BaseDao baseDao;
	
	public void saveArticle(Article article){
		baseDao.save(article);
	}
	
	public List<Article> getList(){
		return baseDao.loadAll(Article.class);
	}
	
	public Article getArticle(int id){
		return (Article) baseDao.get(Article.class, id);
	}
	
	public void saveComment(Comment comment){
		baseDao.save(comment);
	}
}
