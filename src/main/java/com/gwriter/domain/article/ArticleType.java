package com.gwriter.domain.article;

public enum ArticleType {
	JAVA("JAVA基础"), DESIGN_PATTERN("设计模式");
	
	private String desc;
	
	public String getDesc() {
		return desc;
	}
	
	private ArticleType(String desc) {
		this.desc = desc;
	}
}
