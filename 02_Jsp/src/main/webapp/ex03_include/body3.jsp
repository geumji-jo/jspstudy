<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%-- header.jsp에 title 파라미터의 전달이 없는 경우 확인 --%>
<jsp:include page="header.jsp">
	<jsp:param value="body3" name="title"/>
</jsp:include>

<h1>body3</h1>

<%@ include file="footer.jsp" %>