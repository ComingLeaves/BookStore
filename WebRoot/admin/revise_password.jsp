<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
<head>
<title>修改密码</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
<script type="text/javascript" >
    function check()
    {
       var pw=document.forms["a"]["pw"].value;
       var pw2=document.forms["a"]["pw2"].value;
       if(pw==null||pw==""){
       alert("请输入新密码");
          return false;
       }
       if(pw2==null||pw2==""){
       alert("请输入确认密码");
          return false;
       }
       if(pw!=pw2)
       {
        alert("两个密码不同，请重新输入！");
          return false;
       }
    }
    </script>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="user"></i><em>修改密码</em></span>
  </div>
  <form name="a" action="${pageContext.request.contextPath }/servlet/ModifyPass" method="post" onsubmit="return check();">
  <table class="noborder">
    
   <tr>
    <td style="text-align:right;">新密码：</td>
    <td><input type="hidden" name="uid" value="${uid}"><input type="password" name="pw" class="textBox length-middle"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">再次确认密码：</td>
    <td><input type="password" name="pw2" class="textBox length-middle"/></td>
   </tr>
   <tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" class="tdBtn" value="保存"/></td>
   </tr>
  </table>
  </form>
 </div>
</body>
</html>