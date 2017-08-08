<html>
	<head>
		<title>Minha primeira Title</title>
	</head>
	<body>
		<jsp:include page="cabecalho.jsp"></jsp:include>
		<h1>Minha primeira pagina em JSP</h1>
		<p>Mas que raio de pagina é essa</p>
		<%
		int fat = 1;
		for(int i=1;i<=10;i++){
			fat *= i;
		%>
			<p>O fatorial de <%= i %> é igual a <%= fat %></p>
		<%} %>
	</body>
</html>