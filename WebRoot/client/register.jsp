<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML >
<head>
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
       var pass2=document.forms["a"]["pw2"].value;
       var gender=document.forms["a"]["gender"].value;
       var address=document.forms["a"]["address"].value;
       var phone=document.forms["a"]["phone"].value;
       var birth=document.forms["a"]["birthday"].value;
       if(uname==null||uname==""){
       alert("请输入用户名");
          return false;
       }
       if(pass==null||pass==""){
       alert("请输入密码");
          return false;
       }
       if(pass2==null||pass2==""){
       alert("请输入确认密码");
          return false;
       }
       if(pass!=pass2)
       {
       alert("密码不一致，请重新输入");
          return false;
       }
       if(gender==null||gender==""){
       alert("请选择性别");
          return false;
       }
       if(address==null||address==""){
       alert("请输入地址");
          return false;
       }
       if(phone==null||phone==""){
       alert("请输入电话");
          return false;
       }
       if(birth==null||birth==""){
       alert("请输入生日");
          return false;
       }
    }
    </script>
</head>
<%@include file="header2.jsp"%>
 <div style="height:90%;background:url('${pageContext.request.contextPath }/client/img/login_bgimg.jpg')no-repeat;background-size: cover;padding-top:0%">
 <div id="div1"style="width: 600px; height: 800px;border:black solid 0px;">
<form name="a" action="${pageContext.request.contextPath }/servlet/RegisterServlet" method="post" onsubmit="return check();">
     <table border="0" style="border-collapse:separate; border-spacing:0px 20px" align="center">
     <th style="font-size:30px;letter-spacing:14px;" colspan="2">账号注册</th>
       <tr>
         <td style="font-size:22px;" align="right"><p style="margin-right:20px">用户名</p></td>
         <td><input type="text" name="uname" style="font-size:20px;width:300px;height:40px;margin-left:10px;padding-left:10px"></td>
       </tr>
       <tr>
         <td style="font-size:22px" align="right"><p style="margin-right:20px">密码</p></td>
         <td><input type="password" name="pw" style="font-size:20px;width:300px;height:40px;margin-left:10px;padding-left:10px"></td>
       </tr>
       <tr>
         <td style="font-size:22px" align="right"><p style="margin-right:20px">确认密码</p></td>
         <td><input type="password" name="pw2"  style="font-size:20px;width:300px;height:40px;margin-left:10px;padding-left:10px"></td>
       </tr>
       <tr>
         <td style="font-size:22px" align="right"><p style="margin-right:20px">性别</p></td>
         <td align="left" style="padding-left:80px"><p style="font-size:22px"><input type="radio" name="gender" id="inlineRadio1" value="男" style="width:19px;height:19px;margin-left:10px">男
	       <input type="radio" name="gender" id="inlineRadio1" value="女" style="width:19px;height:19px;margin-left:10px">女</p></td>
       </tr>
       <tr>
         <td style="font-size:22px" align="right"><p style="margin-right:20px">电话号码</p></td>
         <td><input type="text" name="phone" style="font-size:20px;width:300px;height:40px;margin-left:10px;padding-left:10px"></td>
       </tr>
       <tr>
         <td style="font-size:22px" align="right"><p style="margin-right:20px">地址</p></td>
         <td><input type="text" name="address" style="font-size:20px;width:300px;height:40px;margin-left:10px;padding-left:10px"></td>
       </tr>
       <tr>
         <td style="font-size:22px" align="right"><p style="margin-right:20px">生日</p></td>
         <td><input type="text" name="birthday" style="font-size:20px;width:300px;height:40px;margin-left:10px;padding-left:10px"></td>
       </tr>
       <tr>
       <td colspan="2" align="center"> <input type="submit" value="立即注册" style="width:100px;height:40px;font-size:20px;border:0"></td>
       </tr>
     </table>
     </form>
     </div>
     </div>
 <%@include file="footer.jsp" %>