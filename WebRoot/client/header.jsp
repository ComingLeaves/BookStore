<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML >
<html>

<head>
      <link rel="stylesheet" href="${pageContext.request.contextPath }/client/css/header.css" type="text/css" />
      <style type="text/css">
         a{margin-right:40px}
      </style>
</head>

<body>
<div id="divheader">
	<table class="header_table">
    <tr class="header_row1">
        <td width="10%">
        </td>
        <td align="left" width="20%">
              <p style="color:#FFFFFF">网罗天下图书 传承中华文明</p>
        </td>
        <td style="text-align:right">
                 <c:choose>
                   <c:when test="${username eq null}">
                 
					 <a href="${pageContext.request.contextPath }/client/login.jsp" class="header_a">登录</a> 
				     <a href="${pageContext.request.contextPath }/client/register.jsp" class="header_a">注册</a> 
			     </c:when>
			     <c:otherwise>
			      <a class="header_a">欢迎您！${username}</a>
			      <a href="${pageContext.request.contextPath }/servlet/LoginOut" class="header_a">退出</a> 
			     </c:otherwise>
			     </c:choose>

				 <a href="${pageContext.request.contextPath }/client/cart.jsp" class="header_a">购物车</a> 
				 <a href="${pageContext.request.contextPath }/client/order.jsp" class="header_a">我的订单</a>
				 <a href="${pageContext.request.contextPath }/client/user_info.jsp" class="header_a">个人中心</a>								
		</td>	
        <td width="10%">
        </td>	
    </tr>

    <tr class="header_row2" height="100px" valign="middle">
        <td >
        </td>
        <td  width="300px">
                <img alt="校徽" src="${pageContext.request.contextPath }/client/img/logo.png">
        </td>
        <td align="right" valign="middle">
              <form action="" method="post" style="font-size:0px">
				<input type="text" placeholder="请输入书名" class="searchinput" style="width:350px;height:30px;border:2px solid #c5464a">
				 <input type="submit" value="搜 索" style="width:70px;height:34px;background-color:#c5464a;font-color:#ffffff;border:0px">
              </form>
        </td>
        <td>
        </td>
    </tr>

    </table>
</div>
</body>
</html>