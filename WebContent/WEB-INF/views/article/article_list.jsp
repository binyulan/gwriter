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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章列表</title>
</head>
<body style="margin: 0; padding: 0">
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