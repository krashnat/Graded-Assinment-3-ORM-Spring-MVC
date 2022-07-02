<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>New Customer</title>
</head>

<body>

	<div class="container">

		<nav class="navbar navbar-dark bg-success">
			<h1 class="text-light">CUSTOMER RELATIONSHIP MANAGEMENT  </h1>
			<hr>
		</nav>

		<p class="h4 mb-4">Save Customer</p>

		<form action="/Customermanagement/manage/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Customer.id}" />

			<div class="form-inline">
				<input type="text" name="firstname" value="${Customer.firstName}"
					class="form-control mb-4 col-4" placeholder="First name">



			</div>

			<div class="form-inline">

				<input type="text" name="lastname" value="${Customer.lastName}"
					class="form-control mb-4 col-4" placeholder="Last name">



			</div>

			<div class="form-inline">

				<input type="text" name="email" value="${Customer.email}"
					class="form-control mb-4 col-4" placeholder="E-mail Address">



			</div>

			<button type="submit" class="btn btn-success col-2">Save</button>

		</form>


		<hr>

		<a href="/CustomerManagement/manage/list"
			class="btn btn-success btn-sm mb-3">Back to Customers List</a>

	</div>
</body>

</html>










