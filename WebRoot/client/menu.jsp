<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML >
 <link rel="stylesheet" href="${pageContext.request.contextPath }/client/css/menu.css" type="text/css" />
<div id="divmenu">
<table >
    <tr height="30px">
        <td width="10%">
        </td>
        <td style="text-align:left">
          <ul id="menu">
              <li><a href="<%=basePath %>servlet/RecommendBook" class="active page">首页
              </a></li>
              <li><a href="<%=basePath %>servlet/GetcatagoryBook?catagory=历史" class="page">历史
              </a></li>
              <li><a href="<%=basePath %>servlet/GetcatagoryBook?catagory=管理" class="page">管理
              </a></li>
              <li><a href="<%=basePath %>servlet/GetcatagoryBook?catagory=计算机与网络" class="page">计算机与网络
              </a></li>
              <li><a href="<%=basePath %>servlet/GetcatagoryBook?catagory=教材" class="page">教材
              </a></li>
              <li><a href="<%=basePath %>servlet/GetcatagoryBook?catagory=科普读物" class="page">科普读物
              </a></li>
              <li><a href="<%=basePath %>servlet/GetcatagoryBook?catagory=医学" class="page">医学
              </a></li>
           </ul>
        </td>
        <td width="10%">
        </td>	
    </tr>
</table>
</div>
