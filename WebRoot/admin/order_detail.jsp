<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>订单详情</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
<script type="text/javascript">
  function del(obj){
     window.location="${pageContext.request.contextPath }/servlet/DelOrder?oid="+obj;
  }
</script>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="order"></i><em>订单编号：${order.getOid() }</em></span>
  </div>
  <dl class="orderDetail">
   <dt class="order-h">订单详情</dt>
   <dd>
    <ul>
     <li>
      <span class="h-cont h-right">收件人姓名：</span>
      <span class="h-cont h-left">${order.getReceiverName() }</span>
     </li>
     <li>
      <span class="h-cont h-right">联系电话：</span>
      <span class="h-cont h-left">${order.getReceiverPhone()}</span>
     </li>
     <li>
      <span class="h-cont h-right">联系地址：</span>
      <span class="h-cont h-left">${order.getReceiverAddress()}</span>
     </li>
     <li>
      <span class="h-cont h-right">订单状态：</span>
      <span class="h-cont h-left">${order.getOrderstate()}</span>
     </li>
     <li>
      <span class="h-cont h-right">下单时间：</span>
      <span class="h-cont h-left">${order.getOrdertime() }</span>
     </li>
     <li>
      <span class="h-cont h-right">付款时间：</span>
      <span class="h-cont h-left">${order.getPaytime()}</span>
     </li>
    </ul>
   </dd>
   <dd>
    <table class="list-style">
     <tr>
      <th>缩略图</th>
      <th>书籍名称</th>
      <th>单价</th>
      <th>数量</th>
      <th>小计</th>
     </tr>
     <c:forEach var="item" items="${order.getList() }">
     <tr>
      <td><img src="${item.getBookpic() }" class="thumbnail"/></td>
      <td>${item.getBookname() }</td>
      <td>
       <span>
        <i>￥</i>
        <em>${item.getPrice()}</em>
       </span>
      </td>
      <td>${item.getBuynum()}</td>
      <td>
       <span>
        <i>￥</i>
        <em>${item.getBuynum()*item.getPrice()}</em>
       </span>
      </td>
     </tr>
     </c:forEach>
     <tr>
      <td colspan="5">
       <div class="fr">
        <span style="font-size:15px;font-weight:bold;">
         <i>订单共计金额：￥</i>
         <b>${order.getTotalprice()}</b>
        </span>
       </div>
      </td>
     </tr>
    </table>
   </dd>
   
   <dd>
	  <div class="BatchOperation">
	   <input onclick="del(${order.getOid() })" type="button" value="删除订单" class="btnStyle"/>
	  </div>
   </dd>
  </dl>
 </div>
</body>
</html>