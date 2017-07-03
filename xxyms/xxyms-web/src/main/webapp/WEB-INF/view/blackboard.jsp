<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="common.jsp" %>
        <script src="${pageContext.request.contextPath}/static/js/content.js"></script>
    </head>
    <body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="container-fluid" style="padding: 0 !important;">
    <div class="row">
        <div class="col-sm-12">
                <c:if test="${not empty notices }">
                    <c:forEach items="${notices }" var="notice">
                        <div class="alert alert-success alert-dismissable">
                        <button aria-hidden="true" data-dismiss="alert" class="close" type="button">×</button>
                         ${notice}                       
                </div>
                    </c:forEach>
                </c:if>
        </div>
    </div>
</div>

</div>

</body></html>