<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改冰柜信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
   <body>
    <div id="all" align="center">
    	<h1>修改冰柜</h1>
    		<form action="frigment?action=updateFrig" method="post">
    			<table align="center"  border="5"><input type="hidden" name="zichanId" value="${requestScope.frig.zichanId }"/>
    				<tr>
    					<td>生产日期</td>
    					<td><input type="text" name="shengchanriqi" value="${requestScope.frig.shengchanriqi }"/></td>
    				</tr>
    				<tr>
    					<td>产品型号</td>
    					<td><input type="text" name="chanpinxinghao" value="${requestScope.frig.chanpinxinghao }"/></td>
    				</tr>
    				<tr>
    					<td colspan="2">
    						<input type="submit" value="修改"/>&nbsp;&nbsp;
    						<input type="reset" value="取消"/>&nbsp;&nbsp;
    					</td>
    				</tr>
    			</table>
    		</form>
    	</div>   
  </body>
</html>