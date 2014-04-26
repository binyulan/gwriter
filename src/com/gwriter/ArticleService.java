package com.gwriter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwriter.dao.ArticleHibernateDAO;
import com.gwriter.domain.Article;

@Service
public class ArticleService {
   
	@Autowired
	private ArticleHibernateDAO articleHibernateDAO;
	
	public void saveArticle(Article article){
		articleHibernateDAO.save(article);
	}
	
	public List<Article> getList(){
		return articleHibernateDAO.loadAll();
	}
	
	public Article getArticle(int id){
		return articleHibernateDAO.get(id);
	}
	
}
