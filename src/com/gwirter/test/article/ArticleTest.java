package com.gwirter.test.article;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gwriter.dao.BaseDao;
import com.gwriter.domain.article.Article;
import com.gwriter.domain.article.Comment;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class ArticleTest {
	
	@Autowired
	public BaseDao<Article> baseDao;
	
	@Autowired
	public BaseDao<Comment> commentBaseDao;
	
	@Test
	public void articleSave(){
		Article article = new Article();
		article.setTitle("logic");
		article.setBody("good text");
		baseDao.save(article);
	}
	
	@Test
	public void commentSave(){
		Comment comment = new Comment();
		comment.setContent("good text");
		Article article = new Article();
		article.setTitle("logic");
		article.setBody("good text");
		baseDao.save(article);
		comment.setArticle(article);
	}
	
}
