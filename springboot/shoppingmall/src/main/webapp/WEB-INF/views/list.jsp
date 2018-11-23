<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>list</title>
</head>
<body>
<h1>Bread</h1>
<br>

<c:forEach items="${products.content}" var="product">
    ${product.productName}<br>
</c:forEach>
<br>

totalPage : ${totalPages}
<br>
<%--Pagenation--%>
<c:forEach begin="1" end="${totalPages}" step="1" var="page">
    <a href="/shop/list?page=${page}">${page}</a>
</c:forEach>

</body>
</html>