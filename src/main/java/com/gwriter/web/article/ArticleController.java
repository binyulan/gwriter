package com.gwriter.web.article;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gwriter.domain.article.Article;
import com.gwriter.domain.article.ArticleType;
import com.gwriter.domain.article.Comment;
import com.gwriter.service.article.ArticleService;



@Controller
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/add_article_view")
	public String addArticleView(){
		return "/article/add_article";
	}
	
	@RequestMapping("/article_list")
	public ModelAndView viewArticleList(){
		ModelAndView mav = new ModelAndView();
		List<Article> articles = articleService.getList();
		List<Article> javaArticle = new ArrayList<Article>();
		List<Article> designPattenArticle = new ArrayList<Article>();
		for(Article article : articles){
			switch (article.getType()) {
				case JAVA :
					javaArticle.add(article);
					break;
				case DESIGN_PATTERN :
					designPattenArticle.add(article);
					break;
				default:
					javaArticle.add(article);
					break;
			}
		}
		mav.addObject(ArticleType.JAVA.name(), javaArticle);
		mav.addObject(ArticleType.DESIGN_PATTERN.name(), designPattenArticle);
		mav.setViewName("/article/article_list");
		return mav;
	}
	
	@RequestMapping("/view_article")
	public ModelAndView viewArticle(int id){
		ModelAndView mav = new ModelAndView();
		mav.addObject("article", articleService.getArticle(id));
		mav.setViewName("/article/article");
		return mav;
	}

	@RequestMapping("/add_article")
	public String addArticle(Article article){
		article.setDate(new Date());
		article.setDigest(article.getBody().substring(0, 100));
		articleService.saveArticle(article);
		return "redirect:/article/article_list.do";
	}
	
	@RequestMapping("/add_comment")
	public void addCommentView(Comment comment, HttpServletResponse response) throws IOException{
		articleService.saveComment(comment);
		PrintWriter out = response.getWriter();          
        String s = "success";
        out.print(s);  
        out.close();  
	}
}
