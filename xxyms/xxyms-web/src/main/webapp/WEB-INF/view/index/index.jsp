<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Xxyms - 主页</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/favicon.ico">
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style.css?v=4.1.0" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/js/plugins/layer/skin/layer.css" id="layui_layer_skinlayercss">

</head>

<body class="fixed-sidebar full-height-layout gray-bg  pace-done" style="overflow:hidden"><div class="pace  pace-inactive"><div class="pace-progress" data-progress-text="100%" data-progress="99" style="width: 100%;">
  <div class="pace-progress-inner"></div>
</div>
<div class="pace-activity"></div></div>
    <div id="wrapper">
    
        <!--左侧导航开始-->
<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="nav-close"><i class="fa fa-times-circle"></i>
    </div>
    <div class="slimScrollDiv" style="position: relative; width: auto; height: 100%;"><div class="sidebar-collapse" style="width: auto; height: 100%;">
        <ul class="nav" id="side-menu">
            <li class="nav-header">
                <div class="dropdown profile-element">
                    <span><img alt="image" class="img-circle" src="${pageContext.request.contextPath}/static/img/a5.jpg" width="64px" height="64px"></span>
                    <a data-toggle="dropdown" class="dropdown-toggle" href="${pageContext.request.contextPath}/#">
                        <span class="clear">
                       <span class="block m-t-xs"><strong class="font-bold">${sessionUser.name }</strong></span>
                        <span class="text-muted text-xs block">超级管理员<b class="caret"></b></span>
                        </span>
                    </a>
                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
                        <li><a class="J_menuItem" href="${pageContext.request.contextPath}/user_info" data-index="0">个人资料</a></li>
                        <li><a class="J_menuItem" href="${pageContext.request.contextPath}/user_chpwd" data-index="1">修改密码</a></li>
                        <li class="divider"></li>
                        <li><a href="${pageContext.request.contextPath}/logout">安全退出</a>
                        </li>
                    </ul>
                </div>
                <div class="logo-element">Mx
                </div>
            </li>
            
                    <li>
                        <a class="J_menuItem" href="" data-index="2">
                            <i class="fa fa-rocket"></i>
                            <span class="nav-label">业务管理</span>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/#">
                            <i class="fa fa-user"></i>
                            <span class="nav-label">系统管理</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level collapse">
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/mgr" data-index="3">用户管理</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/role" data-index="4">角色管理</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/dept" data-index="5">部门管理</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/dict" data-index="6">字典管理</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/menu" data-index="7">菜单管理</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/loginLog" data-index="8">登录日志</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/log" data-index="9">业务日志</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/druid" data-index="10">监控管理</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="${pageContext.request.contextPath}/notice" data-index="11">通知管理</a>
                                    </li>
                        </ul>
                    </li>
                    <li>
                        <a class="J_menuItem" href="" data-index="13">
                            <i class="fa fa-leaf"></i>
                            <span class="nav-label">其他管理</span>
                        </a>
                    </li>

        </ul>
    </div><div class="slimScrollBar" style="width: 4px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 7px; z-index: 99; right: 1px; height: 579px; background: rgb(0, 0, 0);"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; opacity: 0.9; z-index: 90; right: 1px; background: rgb(51, 51, 51);"></div></div>
</nav>        <!--左侧导航结束-->
        
        <!--右侧部分开始-->
<div id="page-wrapper" class="gray-bg dashbard-1">
            <div class="row border-bottom">
                <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header"><a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="${pageContext.request.contextPath}/#"><i class="fa fa-bars"></i> </a>
                <form role="search" class="navbar-form-custom" method="post" action="${pageContext.request.contextPath}/search_results">
                    <div class="form-group">
                        <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                    </div>
                </form>
            </div>
            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown hidden-xs">
                    <a class="right-sidebar-toggle" aria-expanded="false">
                        <i class="fa fa-tasks"></i> 主题
                    </a>
                </li>
            </ul>
        </nav>
    </div>
    <div class="row content-tabs">
        <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
        </button>
        <nav class="page-tabs J_menuTabs">
            <div class="page-tabs-content">
                <a href="javascript:;" class="active J_menuTab" data-id="/blackboard">首页</a>
            </div>
        </nav>
        <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
        </button>
        <div class="btn-group roll-nav roll-right">
            <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

            </button>
            <ul role="menu" class="dropdown-menu dropdown-menu-right">
                <li class="J_tabShowActive"><a>定位当前选项卡</a>
                </li>
                <li class="divider"></li>
                <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                </li>
                <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                </li>
            </ul>
        </div>
        <a href="${pageContext.request.contextPath}/logout" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
    </div>
    <div class="row J_mainContent" id="content-main">
        <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="${pageContext.request.contextPath}/blackboard" frameborder="0" data-id="/blackboard" seamless=""></iframe>
    </div>
    <div class="footer">
        <div class="pull-right">© 2017 <a href="https://github.com/201206030/xxyms" target="_blank">xxyms</a>
        </div>
    </div>
</div>        <!--右侧部分结束-->
        
        <!--右侧边栏开始-->
<div id="right-sidebar">
    <div class="slimScrollDiv" style="position: relative; width: auto; height: 100%;"><div class="sidebar-container" style="width: auto; height: 100%;">

        <ul class="nav nav-tabs navs-3">
            <li class="active"><a data-toggle="tab" href="${pageContext.request.contextPath}/#tab-1"> <i class="fa fa-gear"></i> 主题
            </a></li>
        </ul>

        <div class="tab-content">
            <div id="tab-1" class="tab-pane active">
                <div class="sidebar-title">
                    <h3>
                        <i class="fa fa-comments-o"></i> 主题设置
                    </h3>
                    <small><i class="fa fa-tim"></i>
                        你可以从这里选择和预览主题的布局和样式，这些设置会被保存在本地，下次打开的时候会直接应用这些设置。</small>
                </div>
                <div class="skin-setttings">
                    <div class="title">主题设置</div>
                    <div class="setings-item">
                        <span>收起左侧菜单</span>
                        <div class="switch">
                            <div class="onoffswitch">
                                <input type="checkbox" name="collapsemenu" class="onoffswitch-checkbox" id="collapsemenu"> <label class="onoffswitch-label" for="collapsemenu"> <span class="onoffswitch-inner"></span> <span class="onoffswitch-switch"></span>
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="setings-item">
                        <span>固定顶部</span>

                        <div class="switch">
                            <div class="onoffswitch">
                                <input type="checkbox" name="fixednavbar" class="onoffswitch-checkbox" id="fixednavbar"> <label class="onoffswitch-label" for="fixednavbar"> <span class="onoffswitch-inner"></span> <span class="onoffswitch-switch"></span>
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="setings-item">
                        <span> 固定宽度 </span>

                        <div class="switch">
                            <div class="onoffswitch">
                                <input type="checkbox" name="boxedlayout" class="onoffswitch-checkbox" id="boxedlayout"> <label class="onoffswitch-label" for="boxedlayout"> <span class="onoffswitch-inner"></span> <span class="onoffswitch-switch"></span>
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="title">皮肤选择</div>
                    <div class="setings-item default-skin nb">
                        <span class="skin-name "> <a href="${pageContext.request.contextPath}/#" class="s-skin-0">
                                默认皮肤 </a>
                        </span>
                    </div>
                    <div class="setings-item blue-skin nb">
                        <span class="skin-name "> <a href="${pageContext.request.contextPath}/#" class="s-skin-1">
                                蓝色主题 </a>
                        </span>
                    </div>
                    <div class="setings-item yellow-skin nb">
                        <span class="skin-name "> <a href="${pageContext.request.contextPath}/#" class="s-skin-3">
                                黄色/紫色主题 </a>
                        </span>
                    </div>
                </div>
            </div>

        </div>

    </div><div class="slimScrollBar" style="width: 4px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px; height: 510.122px; background: rgb(0, 0, 0);"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; opacity: 0.4; z-index: 90; right: 1px; background: rgb(51, 51, 51);"></div></div>
</div>        <!--右侧边栏结束-->
       
    </div>

    <!-- 全局js -->
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath}/static/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/plugins/layer/layer.min.js"></script>

    <!-- 自定义js -->
    <script src="${pageContext.request.contextPath}/static/js/hplus.js?v=4.1.0"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/contabs.js"></script>

    <!-- 第三方插件 -->
    <script src="${pageContext.request.contextPath}/static/js/plugins/pace/pace.min.js"></script>
    
    
</body></html>