<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"  src="../js/ckeditor/ckeditor.js"></script>
<script type="text/javascript"  src="../js/syntaxhighlighter_3.0.83/scripts/shCore.js"></script>
<script type="text/javascript"  src="../js/syntaxhighlighter_3.0.83/scripts/shBrushJava.js"></script>
<script type="text/javascript"  src="../js/menu/menu.js"></script>
<script type="text/javascript"  src="../js/menu/menu_items.js"></script>
<script type="text/javascript"  src="../js/menu/menu_tpl.js"></script>
<link href="../js/syntaxhighlighter_3.0.83/styles/shCore.css" rel="stylesheet" type="text/css" />
<link href="../js/syntaxhighlighter_3.0.83/styles/shCoreEmacs.css" rel="stylesheet" type="text/css" />
<link href="../js/menu/menu.css" rel="stylesheet" type="text/css" />
<link href="../css/header/style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章列表</title>
</head>
<body style="margin: 0; padding: 0">
	<div id="header" style="border-bottom: 0">
		<div class="inner">
			<div class="logo">
				<h1>
					<a title="返回首页" href="http://www.youxiuboke.com">优秀博客</a>
				</h1>
				<h2>我的博客收藏夹</h2>
			</div>
			<div id="search">
				<form class="form-search" method="get" name="search-form"
					action="#">
					<div class="input-append">
						<input type="text" name="search_text" class="search-query">
						<button class="btn" type="submit" onclick="alert('功能暂未启用，等我学完lucene再添加')">Search</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div style="height: 24px; width: 100%; background-color: #336699; border: 1px solid #336699"></div>
	<div>
	 	<div> java文章列表</div>
		<c:forEach items="${articles }" var="article">
			<a href='<c:url value="/article/view_article.do?id=${article.id }"/>'>${article.title }<br/></a>
		</c:forEach>
	</div>
</body>
<script type="text/javascript">
	SyntaxHighlighter.all();
	new menu (MENU_ITEMS, MENU_TPL);
</script>
</html>