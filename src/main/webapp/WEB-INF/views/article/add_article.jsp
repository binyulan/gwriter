<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"  src="../js/ckeditor/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="<c:url value="/article/add_article.do"/>">
		标题：<input name="title" type="text" ><br>
		<textarea name="body" rows="10" cols="20"></textarea><br>
		<script type="text/javascript">CKEDITOR.replace('body');</script>
		关键词：<input type="text" name="keyWords"><br>
		<select name="type">
			<option value="0">java</option>
			<option value="1">设计模式</option>
		</select><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>