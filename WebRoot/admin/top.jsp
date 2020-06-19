<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>header</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
<script type="text/javascript">
function logout()
{
	window.parent.location.href="${pageContext.request.contextPath }/servlet/LoginOut";
}
</script>
</head>
<body>
<div class="header">
 <div class="logo">
  <img src="images/logo.png" title="金科书城"/>
 </div>
 <div class="fr top-link">
  <a href="${pageContext.request.contextPath }/servlet/RecommendBook" target="_blank" title="访问书城"><i class="shopLinkIcon"></i><span>书城主页</span></a>
  <a  target="mainCont" title="管理员个人信息"><i class="adminIcon"></i><span>管理员：admin</span></a>
  <a href="revise_password.jsp" target="mainCont" title="修改密码"><i class="revisepwdIcon"></i><span>修改密码</span></a>
  <a href="" onclick="logout()" title="安全退出" style="background:rgb(60,60,60);"><i class="quitIcon"></i><span>安全退出</span></a>
 </div>
</div>
</body>
</html>