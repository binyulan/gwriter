package com.gwriter.domain;

import org.springframework.core.convert.converter.Converter;

import com.gwriter.domain.article.ArticleType;

public class String2EnumConverter implements Converter<String, Enum<ArticleType>> {

	public Enum<ArticleType> convert(String arg0) {
		if(arg0.equals("0")){
			return ArticleType.JAVA;
		}else{
			return ArticleType.DESIGN_PATTERN;
		}
	}
	
}
