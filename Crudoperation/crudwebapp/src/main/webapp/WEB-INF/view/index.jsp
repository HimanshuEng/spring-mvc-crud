
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<html>
<head>
<title>${title}</title>

</head>
<body>


	<div class="container mt-5 ">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center">Welcome to Curde Application</h1>

				<table class="table table-striped">
					<thead class="table-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="p" items="${products}">
							<tr>
								<td class="strong">${p.id}</td>
								<td>${p.name}</td>
								<td>${p.description}</td>
								<td>${p.price}</td>
								<td>
									<!-- Edit Button --> 
					<a href="edit/${p.id}"class="btn btn-sm btn-primary">Edit</a> 
					<!-- Delete Button -->
					<a href="deleteproduct/${p.id}" class="btn btn-sm btn-danger"
					onclick="return confirm('Are you sure you want to delete this product?');">
										Delete </a>
								</td>
							</tr>
						</c:forEach>


					</tbody>
				</table>

				<div class="container text-center">

					<a href="" class="btn btn-outline-success">Add product</a>
				</div>

			</div>

		</div>
	</div>
</body>
</html>
