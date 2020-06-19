<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html >
<head>
<title>用户列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/admin/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/admin/js/public.js"></script>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="user"></i><em>用户列表</em></span>
  </div>
  <div class="operate">
   <form>
    <input type="text" class="textBox length-long" placeholder="输入会员昵称、姓名、手机号码..."/>
    <input type="button" value="查询" class="tdBtn"/>
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
     <th>用户ID</th>
     <th>用户昵称</th>
     <th>性别</th>
     <th>手机号码</th>
     <th>生日</th>
     <th>收货地址</th>
   </tr>
   <c:forEach var="user" items="${users }">
   <tr>
    <td>
     <input type="checkbox"/>
     <span class="middle">${user.getUid()}</span>
    </td>
    <td class="center">${user.getUsername()}</td>
    <td class="center">${user.getGender()}</td>
    <td class="center">${user.getTelephone()}</td>
    <td class="center">${user.getBirthday()}</td>
    <td class="td-name">
      <span class="ellipsis td-name block">${user.getAddress()}</span>
    </td>
   </tr>
   </c:forEach>
  </table>
  <!-- BatchOperation -->
  <div style="overflow:hidden;">

	  <div class="turnPage center fr">
	   <a>第一页</a>
	   <a>1</a>
	   <a>最后一页</a>
	  </div>
  </div>
 </div>
</body>
</html>