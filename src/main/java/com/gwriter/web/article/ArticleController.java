package com.gwriter.web.article;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gwriter.domain.article.Article;
import com.gwriter.domain.article.Comment;
import com.gwriter.service.article.ArticleService;



@Controller
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/add_article_view")
	public String addArticleView(){
		System.out.println("aaaaaa");
		return "/article/add_article";
	}
	
	@RequestMapping("/article_list")
	public ModelAndView viewArticleList(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("articles", articleService.getList());
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
