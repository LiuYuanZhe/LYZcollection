<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    <title>扫描管理界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  <div id="all" align="center">
    	<h1>扫描记录管理</h1>
    		<form action="frigment?action=searchRecord" method="post" style="height: 147px; ">
    			<table align="center" style="width: 910px; "  border=＂5＂>
    		
    				<tr>
    					<td colspan="11" style="width: 500px; ">
    						<a href="addscanner.jsp">添加扫描</a>&nbsp;&nbsp;
    						 请输入产品编号:<input type="text" name="searchId">
    						<input type="reset" value="清空"/>
    						<input type="submit" value="过滤查询">&nbsp;&nbsp;
    						<a href="frigment?action=allFrig">浏览冰箱</a>
    					</td>
    					<td colspan="3"style="width: 100px; ">
    						<a href="successlogin.jsp">返回主页</a>
    					</td>
    				</tr>
    				<tr>
    					<td>编号</td>
    					<td style="width: 100px;">资产编号</td>
    					<td style="width: 60px;">生产日期</td>
    					<td style="width: 60px;">产品型号</td>
    					<td style="width: 200px;">GPS地点</td>
    					<td style="width: 100px;">GPS时间</td>
    					<td style="width: 50px;">经销商</td>
    					<td style="width: 40px;">状态</td>
    					<td style="width: 40px;">备注1</td>
    					<td style="width: 40px;">备注2</td>
    					<td style="width: 40px;">备注3</td>
    					<td style="width: 20px;">入库</td>    					
    					<td colspan="2"style="width: 80px;">操作</td>    				    				   					
    				</tr>
    				<c:forEach items="${requestScope.srlist }" var="sr">
    				<tr>
    					<td>${sr.scannerId }</td>
    					<td style="width: 100px;">${sr.zichanId }</td>
    					<td style="width: 60px;">${sr.frig.shengchanriqi }</td>
    					<td style="width: 60px;">${sr.frig.chanpinxinghao }</td>
    					<td style="width: 200px;">${sr.GPSAddress }</td>
    					<td style="width: 100px;">${sr.GPStime }</td>
    					<td style="width: 50px;">${sr.jingxiaoshang }</td>
    					<td style="width: 40px;">${sr.status }</td>
    					<td style="width: 40px;">${sr.beizhu1 }</td>
    					<td style="width: 40px;">${sr.beizhu2 }</td>
    					<td style="width: 40px;">${sr.beizhu3 }</td>
    					<td style="width: 20px;"></td>    					
    					<td style="width: 40px;">
    						<a href="frigment?action=getOneRecord&scannerid=${sr.scannerId }">修改</a>&nbsp;
    					</td> 
    					<td style="width: 40px;">
    						<a href="frigment?action=deleteRecord&scannerid=${sr.scannerId }"
    						onclick="javascript:return confirm('确实要删除吗？')">删除</a>&nbsp;
    					</td>     				    				   					
    				</tr>
    				</c:forEach>
    			</table>
    		</form>
    	</div>
    </div>
  </body>
</html>