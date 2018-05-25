<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${! empty empList}">
		<table border="1" bgcolor="teal" width="100%" height="">
			<tr>
				<th>empno</th>
				<th>emp name</th>
				<th>Job</th>
				<th>salary</th>

			</tr>
			<c:forEach var="dto" items="${empList}">
				<tr>
					<td>${dto.empno }</td>
					<td>${dto.ename }</td>
					<td>${dto.job }</td>
					<td>${dto.sal }</td>
				</tr>


			</c:forEach>
	</c:when>




</c:choose>