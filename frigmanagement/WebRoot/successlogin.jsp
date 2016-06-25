<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆成功</title>
    
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
    	<h3>登陆成功</h3>
    		<form action="successlogin.jsp" method="post" >
    			<table align="center"  border="5">    		
    				<tr>    				
    					<td>
    						<a href="usermanager.jsp">用户管理</a>
						</td>    					    					
    				</tr>
    				<tr>    				
    					<td>
    						<a href="frigment?action=allScannerRecord">扫描管理</a>
						</td>    					    					
    				</tr>
    				<tr>    				
    					<td>
    						<a href="frigment?action=allFrig">冰柜管理</a>
						</td>    					    					
    				</tr>
    			</table>
    		</form>
    	</div>
    </div>
  </body>
</html>