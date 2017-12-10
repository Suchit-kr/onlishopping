<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />



<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<!--   <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- <script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  -->

<title>eCom - ${title}</title>
<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom Readable Theme for page -->
<link href="${css}/bootstrap-theme.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/shop-custom.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@ include file="./shared/nav-bar.jsp"%>


	<!-- Page Content -->

	<div class="content">
		<div class="conatainer">
			<div class="row">
				<div class="col-lg-12">

					<div class="jumbotron">
						<h1>${errorTitle}</h1>
						<hr>
						<blockquote>${errorDescription}</blockquote>

					</div>

				</div>

			</div>
		</div>


	</div>




	<!-- jQuey -->
	<script src="${js}/jquery.js"></script>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/bootstrap.js"></script>


	<!-- Custom JS file -->
	<script src="${js}/ecom.js"></script>

</body>

<!-- Footer -->
<%@ include file="./shared/footer.jsp"%>


</html>
