<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"  src="../js/ckeditor/ckeditor.js"></script>
<script type="text/javascript"  src="../js/syntaxhighlighter_3.0.83/scripts/shCore.js"></script>
<script type="text/javascript"  src="../js/syntaxhighlighter_3.0.83/scripts/shBrushJava.js"></script>
<!-- 
<script type="text/javascript"  src="../js/jquery-1.11.0.min.js"></script>
 -->
<link href="../js/syntaxhighlighter_3.0.83/styles/shCore.css" rel="stylesheet" type="text/css" />
<link href="../js/syntaxhighlighter_3.0.83/styles/shCoreEmacs.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	SyntaxHighlighter.all();
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章</title>
</head>
<body>
	${article.body}
</body>
</html>