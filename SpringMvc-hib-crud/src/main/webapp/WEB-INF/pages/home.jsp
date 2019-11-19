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
<link href="<c:url value="/resources/css/home.css" />"
	rel="stylesheet">

<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>





</head>
<body>

	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Home page</h2>

			<p>Here you can add new teams</p>
			<input type="button" value="Add Team"
				onclick="window.location.href='showForm.html'; return false;"
				class="btn btn-primary" /> <br /> <br /> <input type="button"
				value="List Team"
				onclick="window.location.href='list.html'; return false;"
				class="btn btn-primary" /> <br /> <br />


			<%-- 	 ${message}<br /> <a
					href="${pageContext.request.contextPath}/team/add.html">Add new
					team</a><br />
					<a href="${pageContext.request.contextPath}/team/list.html">Team
					list</a><br /> --%>



		</div>



		<!-- Beginning of Footer-->
		<footer class="footer-one">
			<div class="row">
				<div class="col-sm-12 col-md-12 text-center">
					<p>Copyright © 2018 @Spk All Rights Reserved</p>
				</div>
			</div>
		</footer>
		<!-- End of Footer-->

	</div>
</body>
</html>