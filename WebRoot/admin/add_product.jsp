<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
<head>
<title>增加书籍</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/adminStyle.css" type="text/css" />
<script>

    function changepic(obj) {

        var newsrc=getObjectURL(obj.files[0]);

        document.getElementById('show').src=newsrc;
        document.getElementById('img').value=newsrc;
    }

    function getObjectURL(file) {

        var url = null ;

        if (window.createObjectURL!=undefined) {

            url = window.createObjectURL(file) ;

        } else if (window.URL!=undefined) { 
            url = window.URL.createObjectURL(file) ;

        } else if (window.webkitURL!=undefined) { 

            url = window.webkitURL.createObjectURL(file) ;

        }

        return url ;

    }

</script>

</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="add"></i><em>增加书籍</em></span>
    <span class="modular fr"><a href="product_list.jsp" class="pt-link-btn">书籍列表</a></span>
  </div>
 <form action="../servlet/AddBook" method="post">
  <table class="list-style">
   <tr>
    <td style="text-align:right;width:15%;">书名：</td>
    <td><input type="text" name="bookname" class="textBox length-long"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">书籍分类：</td>
    <td>
     <select name="catagory" id="ca" class="textBox">
      <option value="历史">历史</option>
      <option value="管理">管理</option>
      <option value="计算机与网络">计算机与网络</option>
      <option value="建筑">建筑</option>
      <option value="教材">教材</option>
      <option value="医学">医学</option>
      <option value="科普读物">科普读物</option>
     </select>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">作者：</td>
    <td>
     <input type="text" class="textBox length-short" name="author"/>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">出版日期：</td>
    <td>
     <input type="text" class="textBox length-short" name="pubdate"/>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">库存：</td>
    <td>
     <input type="text" class="textBox length-short" name="pnum"/>
     <span>本</span>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">价格：</td>
    <td>
    <span>¥</span>
     <input type="text" class="textBox length-short" name="price"/>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">产品缩图片：</td>
    <td>
     <input type="file" accept="image/*" id="suoluetu" onchange="changepic(this)" class="hide"/>
     <input type="hidden" name="bookimg" id="img">
     <label for="suoluetu" class="labelBtnAdd">+</label>
     <img src="#" id="show" width="60" height="60" class="mlr5"/>
    </td>
   </tr>
   
   <tr>
    <td style="text-align:right;">产品详情：</td>
    <td><textarea class="textarea" name="description"></textarea></td>
   </tr>
   <tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" value="保存修改" class="tdBtn"/></td>
   </tr>
  </table>
  </form>
 </div>
</body>
</html>