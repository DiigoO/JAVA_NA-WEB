<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
<sx:head />
</head>
<body>
	<s:form action="/cadastrar" namespace="/pessoa" method="post"
		enctype="multipart/form-data">
		<s:textfield name="pessoa.nome" label="Nome" />
		<sx:datetimepicker
		name="pessoa.dataNasc" 
		label="Format (dd-MMM-yyyy)"
		displayFormat="dd-MMM-yyy" value="%{'today'}"></sx:datetimepicker>
		<s:submit />
	</s:form>
</body>
</html>