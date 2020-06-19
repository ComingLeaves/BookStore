<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  
    <style type="text/css">
     #div1{margin:0 auto;}
     a{text-decoration:none}
     body{text-align:center;}
    </style>
    <script type="text/javascript" >
    function check()
    {
       var uname=document.forms["a"]["uname"].value;
       var pass=document.forms["a"]["pw"].value;
       if(uname==null||uname==""){
       alert("请输入用户名");
          return false;
       }
       if(pass==null||pass==""){
       alert("请输入密码");
          return false;
       }
    }
    </script>
  </head>
  <%@include file="header2.jsp"%>
  <!-- background:#FF2C4C url('pic/bgimg.jpg') no-repeat -->
  <div style="height:80%;background:url('${pageContext.request.contextPath }/client/img/login_bgimg.jpg')no-repeat;background-size: cover;padding-top:5%">
     <div id="div1"style="width: 500px; height: 530px;border:black solid 0px;">
    <form name="a" action="${pageContext.request.contextPath }/servlet/LoginServlet" method="post" onsubmit="return check();">
     
     
      <table border="0" style="border-collapse:separate; border-spacing:0px 50px" align="center">
         <th style="font-size:30px;letter-spacing:14px;">账号登录</th>
         <tr>
           <td style="border:black solid 1px;height:55px"><img width="26px" height="26px" align="center" style="margin-left:10px" src="../pic/pic1.jpg">
           <input  type="text" id="uname" name="uname" style="font-size:18px;width:360px;height:50px;border:0;margin-left:10px;BACKGROUND-COLOR: transparent;" placeholder="请输入登录账号" ></td>
         </tr>
          <tr>
           <td style="border:black solid 1px;height:55px"><img width="26px" height="26px" align="center" style="margin-left:10px" src="../pic/pic2.jpg">
           <input type="password" id="pw" name="pw" style="font-size:18px;width:360px;height:50px;border:0;margin-left:10px;BACKGROUND-COLOR: transparent;" placeholder="请输入登录密码" ></td>
         </tr>
          <tr>
           <td colspan="2" align="center"><input type="submit" value="登录" style="width:400px;height:50px;font-size:25px"></td>
         </tr>
         <tr>
         <td colspan="2" align="right"><a href="${pageContext.request.contextPath }/client/register.jsp" style="font-size:15px">立即注册</a>
         </tr>
      </table>
      </form>
    
    </div>
    </div>
