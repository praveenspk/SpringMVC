<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Management | Praveen</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/sample.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">

			<h2 class="text-center">Team Rankings</h2>
			<br> <input type="button" value="Home"
				onclick="window.location.href='index.html'; return false;"
				class="btn btn-primary" />&nbsp <input type="button"
				value="List Team"
				onclick="window.location.href='list.html'; return false;"
				class="btn btn-primary" /> <br /> <br />

			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add Team</div>
				</div>
				<div class="panel-body">
					<form:form action="saveTeam" cssClass="form-horizontal"
						method="post" modelAttribute="team">


						<div class="form-group">
							<label for="id" class="col-md-3 control-label">Team Id</label>
							<div class="col-md-9">
								<form:input path="id" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="teamname" class="col-md-3 control-label">
								Team Name</label>
							<div class="col-md-9">
								<form:input path="name" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="rating" class="col-md-3 control-label">Rating</label>
							<div class="col-md-9">
								<form:input path="rating" cssClass="form-control" />
							</div>
						</div>



						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>


							</div>
						</div>

					</form:form>
				</div>
			</div>
		</div>
		<!-- Beginning of Footer-->
		<footer class="footer-one">
			<div class="row">
				<div class="col-sm-12 col-md-12 text-center">
					<p>Copyright © 2018 spk All Rights Reserved</p>
				</div>
			</div>
		</footer>
		<!-- End of Footer-->
	</div>
</body>
</html>

