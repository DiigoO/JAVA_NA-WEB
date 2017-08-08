<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="usuario" class="br.com.fiap.bean.UsuarioSessaoBean" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="usuario"/>

<p><fmt:formatDate value="${usuario.primeiroAcesso}" pattern="dd.MM.yy HH:mm:ss"/></p>
<p><fmt:formatDate value="${usuario.ultimoAcesso}" pattern="dd.MM.yy HH:mm:ss"/></p>