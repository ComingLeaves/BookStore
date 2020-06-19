<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML >
<html>
      <link rel="stylesheet" href="${pageContext.request.contextPath }/client/css/book_list.css" type="text/css" />
<head>
   <title>金科书城</title>
   <script type="text/javascript">
    function next()
    {
       var page=document.getElementById("page").value;
       page++;
       window.location="${pageContext.request.contextPath}/servlet/GetcatagoryBook?catagory=${ca}&page="+page;
    }
    function last()
    {
       var page=document.getElementById("page").value;
       if(page>1)
       {
          page--;
          window.location="${pageContext.request.contextPath}/servlet/GetcatagoryBook?catagory=${ca}&page="+page;
       }
    }
    function jump()
    {
       var page=document.getElementById("page").value;
       window.location="${pageContext.request.contextPath}/servlet/GetcatagoryBook?catagory=${ca}&page="+page;
    }
   </script>
   </head>
   <body class="main">
       <%@include file="header.jsp"%>
	   <%@include file="menu.jsp" %>
	 <div id="divcontent">
	   <table >
          <tr>
             <td width="10%">
             </td>
             <td>
             
                 <div class="book_list_pagenumber"> 
                 
	            </div>
	             <div class="book_list">
	             <c:forEach var="book" items="${list }" >
	                 <table class="book" style="cellspacing:0px;margin-top:20px">
                      <tr height="20px" valign="top">
				                <td class="book_img" rowspan="2">
				                    <img src="${book.getBookpic()}" width="200px" height="240px" />
				                </td>
				                <td>
				                    <ul class="book_info">
				                       <li>${book.getBookname() }</li>
				                       <li>作者:${book.getAuthor() }</li>
				                       <li>价格:￥${book.getPrice() }</li>
				                       <li>简介:${book.getDescription() }</li>
				                       
				                    </ul>
				                </td>
                              </tr>
				              <tr height="50px">
                                <td>
				                    <form action="" method="post">
				                         <input type="submit" value="立即购买">
				                         <input type="submit" value="加入购物车"> 
				                    </form>
				                </td>
				              </tr>  
	               </table>
	            </c:forEach>
	            </div>
	            <div class="book_list_pagenumber"> 
	            <a href="#" onclick="last()">上一页</a>
	            <input type="text" id="page" name="page" value="${page }">
	            <a href="#" onclick="jump()">跳转</a>
                 <a href="#" onclick="next()">下一页</a>
	            </div>
	           
           </td>
           <td width="10%">
           </td>
         </tr>
      </table>
	</div>
	  <%@include file="footer.jsp" %>
</body>
</head>
</html>