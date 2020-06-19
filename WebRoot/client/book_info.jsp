<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML >
<html>
  <link rel="stylesheet" href="${pageContext.request.contextPath }/client/css/book_info.css" type="text/css" />
<head>
   <title>金科书城</title>
   <body class="main">
       <%@include file="header.jsp"%>
	   <%@include file="menu.jsp" %>
	 <div id="divcontent">
	   <table >
          <tr>
             <td width="10%">
             </td>
             <td>
                 <div class="book_list"> 
                       <table class="book" style="cellspacing:0px">
                         <tr height="200px" valign="top">
				                <td class="book_img" rowspan="2">
				                    <img src="${book.getBookpic()}" width="400" height="480" />
				                </td>
				                <td style="	border:0px solid #0094ff">
				                    <ul class="book_info">
				                       <li style="font-size:25px;line-height:40px"><p></p>${book.getBookname() }</li>
				                       <li style="font-size:25px;line-height:40px">作者：${book.getAuthor() }</li>
				                       <li style="font-size:25px;line-height:40px">出版日期：${book.getPubdate()}</li>
				                       <li style="font-size:25px;line-height:40px">价格：￥${book.getPrice()}</li>
				                       <li style="font-size:25px;line-height:40px;height:140px">简介：${book.getDescription()}</li>       
				                    </ul>
				                </td>
                       </tr>
				       <tr height="100px">
                                <td>
				                    <form action="" method="post">
				                         <button type="button">-</button>
                                         <input type="number" id="buynumber" value="1" min="1" max="99" step="1"/>
                                         <button type="button">+</button>
                                         <br><br>
				                         <input type="submit" value="立即购买">
				                         <input type="submit" value="加入购物车"> 
				                    </form>
				                </td>
				       </tr>  
	               </table>        
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