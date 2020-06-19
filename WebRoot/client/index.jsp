<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML >
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath }/client/css/index.css" type="text/css" />
 <style type="text/css">
     a{text-decoration:none}
    </style>
<script type="text/javascript" src="${pageContext.request.contextPath }/client/js/autoplay.js"></script>
<head>
   <title>金科书城</title>
   <body class="main">
       <%@include file="header.jsp"%>
	   <%@include file="menu.jsp" %>
	 <div id="divcontent">
	   <table class="content" >
          <tr>
             <td width="10%">
             </td>
             <td>
                 <div id="box_autoplay">
    	            <div class="list">
        	            <ul>
            	            <li><img src="${pageContext.request.contextPath }/client/ad/1.jpg" width="100%" height="500" /></li>
            	            <li><img src="${pageContext.request.contextPath }/client/ad/2.jpg" width="100%" height="500" /></li>
            	            <li><img src="${pageContext.request.contextPath }/client/ad/3.jpg" width="100%" height="500" /></li>
            	            <li><img src="${pageContext.request.contextPath }/client/ad/4.jpg" width="100%" height="500" /></li>
            	            <li><img src="${pageContext.request.contextPath }/client/ad/5.jpg" width="100%" height="500" /></li>
        	            </ul>
    	            </div>
	             </div>
	           
	           
	            
	            <div id="book_recommend">
	                  <div style="width:100%" class="book_recommend_title">
	                           <p class="book_recommendfont"><span>好书推荐</span> <i> / </i> <a href="#" target="_blank">更多</a></p>
	                  </div>
	                  <div style="width:100%" class="book_recommend_list">
	                    <c:forEach items="${rlist}" var="book">
	                    <div  style="border:black solid 0px;width:300px;height:210px;float:left;margin-left:40px;margin-right:40px;margin-top:40px">
	                       <table class="goodbook" border="0">
			                  <tr style="height:70px">
				                <td class="goodbook_img" rowspan="3">
				                   <a href="${pageContext.request.contextPath }/servlet/GetBookDetils?bookid=${book.getBoobid()}"> <img src="${book.getBookpic()}" width="150" height="200" /></a>
				                </td>
				                <td class="goodbook_info">
				                   <a href="${pageContext.request.contextPath }/servlet/GetBookDetils?bookid=${book.getBoobid()}"> <p style="overflow:hidden;height:40px">${book.getBookname() }</p></a>
				                </td>
                              </tr>
                              <tr style="height:70px">
                                <td class="goodbook_info">
				                    <p>${book.getAuthor() }</p>
				                </td>
				              </tr>
				              <tr style="height:70px">
                                <td class="goodbook_info">
				                    <p>￥${book.getPrice() }</p>
				                </td>
				              </tr>  
					      </table>
					      </div>
					      </c:forEach>
		              </div>
	          </div>
	             <div id="book_new">
                
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