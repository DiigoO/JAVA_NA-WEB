<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem Aluno</title>
<sx:head />
</head>
<body>
	<s:iterator value="aluno" >
  		<tr> 
      		<td><s:property/></td>
  		</tr>
	</s:iterator>
</body>
</html>