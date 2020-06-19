<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
<head>
<title>产品列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/admin/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/admin/js/public.js"></script>
<script type="text/javascript">
    function next()
    {
       var page=document.getElementById("page").value;
       page++;
       window.location="../servlet/GetBook?page="+page;
    }
    function last()
    {
       var page=document.getElementById("page").value;
       if(page>1){
	       page--;
	       window.location="../servlet/GetBook?page="+page;
       }
    }
    function jump()
    {
       var page=document.getElementById("page").value;
       
	   window.location="../servlet/GetBook?page="+page;
    }
   </script>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i></i><em>书籍列表</em></span>
    <span class="modular fr"><a href="${pageContext.request.contextPath }/admin/add_product.jsp" class="pt-link-btn">+添加书籍</a></span>
  </div>
  <div class="operate">
   <form>
    <input type="text" class="textBox length-long" placeholder="输入书籍名称...">
    <input type="button" value="查询" class="tdBtn">
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
    <th>书籍ID</th>
    <th>缩略图</th>
    <th>书名</th>
    <th>作者</th>
    <th>出版日期</th>
    <th>库存</th>
    <th>价格</th>
    <th>操作</th>
   </tr>
   <c:forEach var="book" items="${list}">
   <tr>
    <td>
     <span>
     <input type="checkbox" class="middle children-checkbox"/>
     <i>${book.getBoobid()}</i>
     </span>
    </td>
    <td class="center pic-area"><img src="${book.getBookpic()}" class="thumbnail"/></td>
    <td class="td-name">
      <span class="ellipsis td-name block">${book.getBookname() }</span>
    </td>
    <td class="center">
     <span>${book.getAuthor() }</span>
    </td>
    <td class="center">
     <span>${book.getPubdate()}</span>
    </td>
    <td class="center">
     <span>
      <em>${book.getPnum() }</em>
      <i>本</i>
     </span>
    </td>
    <td class="center">
      <span>
      <i>￥</i>
      <em>${book.getPrice() }</em>
     </span>
    </td>
    <td class="center">
     <a href="${pageContext.request.contextPath }/servlet/GetBookDetils?bookid=${book.getBoobid()}&edit=1" title="编辑"><img src="images/icon_edit.gif"/></a>
     <a href="${pageContext.request.contextPath }/servlet/DeleteBook?bookid=${book.getBoobid()}" title="删除"><img src="images/icon_drop.gif"/></a>
    </td>
   </tr>
   </c:forEach>
   
  </table>
  <!-- BatchOperation -->
  <div style="overflow:hidden;">
      <!-- Operation 
	  <div class="BatchOperation fl">
	   <input type="checkbox" id="del"/>
	   <label for="del" class="btnStyle middle">全选</label>
	   <input type="button" value="批量下架" class="btnStyle"/>
	  </div>-->
	  <!-- turn page -->
	  <div class="turnPage center fr">
	   <a href="#" onclick="last()">上一页</a>
	   <input type="text" id="page" name="page" value="${page}">
	   <a href="#" onclick="jump()">跳转</a>
        <a href="#" onclick="next()">下一页</a>
	  </div>
  </div>
 </div>
</body>
</html>