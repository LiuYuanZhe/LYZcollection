<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改扫描信息</title>
    
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
    	<h1>修改扫描信息</h1>
  
  <form action="frigment?action=updateRecord&scannerid=${requestScope.srecord.scannerId }" method="post">
    			<table align="center"  border="5">
    		
    				<tr>
    					<td>资产编号</td>
    					<td style="width: 100px;"><input type="text" name="zichanId" value="${requestScope.srecord.zichanId }"/></td>
    				</tr>    				
    				<input type="hidden" name="shengchanriqi" value="${requestScope.srecord.frig.shengchanriqi }"/>
    				<tr>
    					<td>产品型号</td>
    					<td style="width: 100px;"><input type="text" name="chanpinxinghao" value="${requestScope.srecord.frig.chanpinxinghao }"/></td>
    				</tr>
    				<tr>
    					<td>扫描地点</td>
    					<td style="width: 100px;"><input type="text" name="GPSAddress" value="${requestScope.srecord.GPSAddress }"/></td>
    				</tr>
    				<tr>
    					<td>扫描时间</td>
    					<td style="width: 100px;"><input type="text" name="GPStime" value="${requestScope.srecord.GPStime }"/></td>
    				</tr>
    				<tr>
    					<td>经销商</td>
    					<td style="width: 100px;"><input type="text" name="jingxiaoshang" value="${requestScope.srecord.jingxiaoshang }"/></td>
    				</tr>
    				<tr>
    					<td>状态</td>
    					<td style="width: 100px;"><input type="text" name="status" value="${requestScope.srecord.status }"/></td>
    				</tr>
    				<tr>
    					<td>备注1</td>
    					<td style="width: 100px;"><input type="text" name="beizhu1" value="${requestScope.srecord.beizhu1 }"/></td>
    				</tr>
    				<tr>
    					<td>备注2</td>
    					<td style="width: 100px;"><input type="text" name="beizhu2" value="${requestScope.srecord.beizhu2 }"/></td>
    				</tr>
    				<tr>
    					<td>备注3</td>
    					<td style="width: 100px;"><input type="text" name="beizhu3" value="${requestScope.srecord.beizhu3 }"/></td>
    				</tr>
    				<tr>
    					<td >
   							<input type="submit" value="修改"/>&nbsp;
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
