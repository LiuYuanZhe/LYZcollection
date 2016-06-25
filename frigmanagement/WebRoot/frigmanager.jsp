<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>冰柜管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  <style type="text/css">
  	*{padding: 0px;margin: 0px;}
  	table {text-align: left;}
  	td{width: 160px;border: 1px red solid;}
  </style>
  </head>
  
  <body>
  
  <form action="" method="post">
  	<div id="all">
  		<table>
  			<tr>
  				<td colspan="4"><a href="addfrig.jsp">添加冰柜</a></td>
  				<td><a href="successlogin.jsp">返回主页</a></td>
  			</tr>
  			<tr>
  				<td>资产编号</td>
  				<td>生产日期</td>
  				<td>产品型号</td>
  				<td colspan="2">操作</td>
  			</tr>
  			<c:forEach items="${requestScope.friglist }" var="f" varStatus="status">
  			<tr>
  				<td>${f.zichanId }</td>
  				<td>${f.shengchanriqi }</td>
  				<td>${f.chanpinxinghao }</td>
  				<td><a href="frigment?action=getFrig&zichanid=${f.zichanId }">修改</a></td>&nbsp;&nbsp;
  				<td><a href="frigment?action=deleteFrig&zichanid=${f.zichanId }" 
  				onclick="javascript:return confirm('确实要删除吗？')">删除</a></td>&nbsp;
  			</tr>
  			</c:forEach>
  			<tr>
  				<a href="">上一页</a>&nbsp;&nbsp;&nbsp;
  				<a href="frigment?action=allFrignext">下一页</a>&nbsp;&nbsp;
  				<input type="text" name="currentpage" value="${requestScope.curPage }"><input type="text" name="allpages" value="${requestScope.allPages }">  
  			</tr>	
  		</table>
  	</div>
  </form>
  </body>
</html>