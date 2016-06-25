<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加扫描信息</title>
    
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
    	<h1>添加扫描信息</h1>
    		<form action="frigment?action=addRecord" method="post">
    			<table align="center"  border="5">
    		
    				<tr>
    					<td>资产编号</td>
    					<td style="width: 100px;"><input type="text" name="zichanId"/></td>
    				</tr>
    				<tr>
    					<td>生产日期</td>
    					<td style="width: 100px;"><input type="text" name="shengchanriqi"/></td>
    				</tr>
    				<tr>
    					<td>产品型号</td>
    					<td style="width: 100px;"><input type="text" name="chanpinxinghao"/></td>
    				</tr>
    				<tr>
    					<td>扫描地点</td>
    					<td style="width: 100px;"><input type="text" name="GPSAddress"/></td>
    				</tr>
    				<tr>
    					<td>扫描时间</td>
    					<td style="width: 100px;"><input type="text" name="GPStime"/></td>
    				</tr>
    				<tr>
    					<td>经销商</td>
    					<td style="width: 100px;"><input type="text" name="jingxiaoshang"/></td>
    				</tr>
    				<tr>
    					<td>状态</td>
    					<td style="width: 100px;"><input type="text" name="status"/></td>
    				</tr>
    				<tr>
    					<td>备注1</td>
    					<td style="width: 100px;"><input type="text" name="beizhu1"/></td>
    				</tr>
    				<tr>
    					<td>备注2</td>
    					<td style="width: 100px;"><input type="text" name="beizhu2"/></td>
    				</tr>
    				<tr>
    					<td>备注3</td>
    					<td style="width: 100px;"><input type="text" name="beizhu3"/></td>
    				</tr>
    				<tr>
    					<td >
   							<input type="submit" value="添加"/>&nbsp;
   						</td>
   						<td>
   							<input type="reset" value="取消"/>&nbsp;
   						</td>
   					</tr>
    				</table>
    		</form>
    	</div>
  
  </body>
</html>
