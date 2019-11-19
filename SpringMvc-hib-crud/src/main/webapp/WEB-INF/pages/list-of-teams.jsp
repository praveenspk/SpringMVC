<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Management | Praveen</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/sample.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>List of teams</h2>
			<p>Here you can see the list of the teams</p>
			<hr />


			<input type="button" value="Home"
				onclick="window.location.href='index.html'; return false;"
				class="btn btn-primary" />&nbsp <input type="button"
				value="Add Team"
				onclick="window.location.href='showForm.html'; return false;"
				class="btn btn-primary" /> <br /> <br />


			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Team List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">

						<tr>
							<th width="10%">Id</th>
							<th width="15%">Team Name</th>
							<th width="10%">Rating</th>
							<th width="10%">Actions</th>
						</tr>

						<tbody>
							<c:forEach var="team" items="${teams}">
								<tr>
									<td>${team.id}</td>
									<td>${team.name}</td>
									<td>${team.rating}</td>
									<td><a
										href="${pageContext.request.contextPath}/team/edit/${team.id}.html">Edit
									</a> &nbsp&nbsp &nbsp&nbsp ||&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <a
										href="${pageContext.request.contextPath}/team/delete/${team.id}.html">Delete</a><br />
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

				</div>
			</div>
		</div>
		<!-- Beginning of Footer-->
		<footer class="footer-one">
			<div class="row">
				<div class="col-sm-12 col-md-12 text-center">
					<p>Copyright © 2018 @spk All Rights Reserved</p>
				</div>
			</div>
		</footer>
		<!-- End of Footer-->

	</div>


</body>
</html>