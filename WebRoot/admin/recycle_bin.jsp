<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
<head>
<title>下架管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i></i><em>下架书籍</em></span>
  </div>
  
  <table class="list-style">
   <tr>
    <th>书籍ID</th>
    <th>缩略图</th>
    <th>书名</th>
    <th>价格</th>
    <th>操作</th>
   </tr>
   <tr>
    <td>
     <span>
     <input type="checkbox" class="middle children-checkbox"/>
     <i>0</i>
     </span>
    </td>
    <td class="center pic-area"><img src="#" class="thumbnail"/></td>
    <td class="td-name">
      <span class="ellipsis td-name block">软件项目管理</span>
    </td>
    <td class="center">
        <span>
      <i>￥</i>
      <em>0.00</em>
     </span>
    </td>
    <td class="center">
     <a href="#" title="恢复" target="_blank">上架</a>
     <a href="#" title="彻底删除">删除</a>
    </td>
   </tr>
  </table>
  <!-- BatchOperation -->
  <div style="overflow:hidden;">
      <!-- Operation -->
	  <div class="BatchOperation fl">
	   <input type="checkbox" id="del"/>
	   <label for="del" class="btnStyle middle">全选</label>
	   <input type="button" value="批量上架" class="btnStyle"/>
	   <input type="button" value="批量删除" class="btnStyle"/>
	  </div>
	  <!-- turn page -->
	  <div class="turnPage center fr">
	   <a>第一页</a>
	   <a>1</a>
	   <a>最后一页</a>
	  </div>
  </div>
 </div>
</body>
</html>