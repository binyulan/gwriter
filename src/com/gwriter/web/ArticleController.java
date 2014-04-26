package com.gwriter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gwriter.ArticleService;
import com.gwriter.domain.Article;

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
}
