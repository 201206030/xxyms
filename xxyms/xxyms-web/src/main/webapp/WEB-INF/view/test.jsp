<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>测试页面</title>
    </head>
    <body>
        <c:forEach var="aa" items="${list }">
            ${aa },
        </c:forEach>
    </body>
    
</html>