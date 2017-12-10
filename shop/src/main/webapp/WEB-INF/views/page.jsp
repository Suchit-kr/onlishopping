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

<!-- Datable Bootstrap css -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop-custom.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@ include file="./shared/nav-bar.jsp"%>


	<!-- Page Content -->

	<!-- Load Home page content on userclick -->
	<c:if test="${userClickHome == true}">
		<%@ include file="home.jsp"%>
	</c:if>

	<!-- Load About Us page content on userclick -->
	<c:if test="${userClickAbout == true}">
		<%@ include file="about.jsp"%>
	</c:if>

	<!-- Load Contact Us page content on userclick -->
	<c:if test="${userClickContactus == true}">
		<%@ include file="contact.jsp"%>
	</c:if>

	<!-- Load View Products page content on userclick -->
	<c:if
		test="${userClickViewProducts == true or userClickCategoryViewProducts == true}">
		<%@ include file="products.jsp"%>
	</c:if>
	
	<!-- Load single Product view -->
	<c:if test="${ userClickCategoryViewSingleProducts== true}">
	<%@include file="singleProduct.jsp"%>
	</c:if>
	
	

	



	<!-- jQuey -->
	<script src="${js}/jquery.js"></script>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/bootstrap.js"></script>

	<!-- JQuery Data Tables Plugin -->
	<script src="${js}/jquery.dataTables.js"></script>

	<!-- DataTable Bootstrap Js -->
	<%-- <script src="${js}/dataTables.bootstrap.js"></script> --%>

	<!-- Custom JS file -->
	<script src="${js}/ecom.js"></script>
	
</body>

<!-- Footer -->
	<%@ include file="./shared/footer.jsp"%>


</html>
