<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 
<html> 
<head> 
　　<title>演示</title> 

</head> 
<body> 
	${user}
	<#if sex==1>
	男
	<#elseif sex==0>
	女
	<#else>
	其他
	</#if>
	<#list userList as user>
	${user}
	</#list>

</body> 
</html>