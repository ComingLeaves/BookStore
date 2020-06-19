<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>左侧导航</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/admin/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/admin/js/public.js"></script>
</head>
<body style="background:#313131">
<div class="menu-list">
 <a href="main.jsp" target="mainCont" class="block menu-list-title center" style="border:none;margin-bottom:8px;color:#fff;">首页</a>
 <ul>
  <li class="menu-list-title">
   <span>订单管理</span>
   <i>◢</i>
  </li>
  <li>
   <ul class="menu-children">
    <li><a href="${pageContext.request.contextPath }/servlet/GetOrders" title="商品列表" target="mainCont">订单列表</a></li>
   </ul>
  </li>
 
  <li class="menu-list-title">
   <span>书籍管理</span>
   <i>◢</i>
  </li>
  <li>
   <ul class="menu-children">
    <li><a href="${pageContext.request.contextPath }/servlet/GetBook" title="书籍列表" target="mainCont">书籍列表</a></li>
   </ul>
  </li>
  
  <li class="menu-list-title">
   <span>用户管理</span>
   <i>◢</i>
  </li>
  <li>
   <ul class="menu-children">
    <li><a href="${pageContext.request.contextPath }/servlet/GetUser" title="会员列表" target="mainCont">用户列表</a></li>
   </ul>
  </li>
  
    
 </ul>
</div>
</body>
</html>