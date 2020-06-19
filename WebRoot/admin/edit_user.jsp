<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
<head>
<title>编辑会员资料</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="edit_user"></i><em>编辑个人资料</em></span>
  </div>
  <table class="list-style">
   <tr>
    <td style="width:15%;text-align:right;">昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</td>
    <td><input type="text" class="textBox length-middle" value=""/></td>
   </tr>
      <tr>
    <td style="text-align:right;">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
    <td>
     <span>？</span>
    </td>
   </tr>
   <tr>
   <tr>
    <td style="text-align:right;">手机号码：</td>
    <td><input type="text" class="textBox length-middle" value=""/></td>
   </tr>
   <tr>
    <td style="text-align:right;">收货地址：</td>
    <td><input type="text" class="textBox length-middle" value=""/></td>
   </tr>
   <tr>
    <td style="text-align:right;">生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日：</td>
    <td>
     <span>？</span>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" class="tdBtn" value="更新保存"/></td>
   </tr>
  </table>
 </div>
</body>
</html>