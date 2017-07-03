<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>登录</title>

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/favicon.ico">
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style.css?v=4.1.0" rel="stylesheet">
    <script>if (window.top !== window.self) {
        window.top.location = window.location;
    }</script>
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js?v=3.3.6"></script>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div style="padding: 100px 0px;">
        <div>
            <h1 class="logo-name">XM</h1>
        </div>
        <h3>欢迎使用 Xxyms</h3>
        <br>
        <h4 style="color: red;">${failInfo }</h4>
        <form class="m-t" role="form" action="login" method="post">
            <div class="form-group">
                <input name="username" class="form-control" placeholder="用户名" required="" type="text">
            </div>
            <div class="form-group">
                <input name="password" class="form-control" placeholder="密码" required="" type="password">
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>
            <p></p>
        </form>
    </div>
</div>

<script>
    $(function(){
        $("#kaptcha").on('click',function(){
            $("#kaptcha").attr('src', '/kaptcha?' + Math.floor(Math.random()*100) ).fadeIn();
        });
    });
</script>




</body></html>