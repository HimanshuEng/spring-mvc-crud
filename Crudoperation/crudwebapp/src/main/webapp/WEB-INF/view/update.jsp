	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<%@page isELIgnored="false"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<%@include file="./base.jsp"%>
	</head>
	<body>
		<form action="<%= request.getContextPath()%>/updatedetail" method="post">
	<input type="text" name="id" value="${product.id}">
	
			<div class="container shadow bg-black p-3 mt-5 ">
				<div class="row">
					<div class="col-md-6 offset-md-3">
						<h1 class="">Update the Product Details</h1>
						<div class="form-group">
							<label for="productadd">Product Name</label> <input type="text"
								class="form-control" id="productname" name="name"
									placeholder="Product Name" value="${product.name}">
						</div>
	
						<div class="form-group">
							<label for="productDescription">Product Description</label> <input
								type="text" class="form-control" id="productDescription"
								name="description"
								placeholder=" Enter the Product Description" value="${product.description}">
						</div>
	
						<div class="form-group">
							<label for="productprice">Product Price</label> <input type="text"
								class="form-control" id="productprice" name="price"
								placeholder="Product Price" value="${product.price}">
						</div>
					</div>
				</div>
		
			<div class="container text-center mt-4">
	
				<a href="<%= request.getContextPath() %>/"
					class="btn btn-warning">Back</a>
				<button type="submit" class="btn btn-success">Update</button>
	
			</div>
		</div>
	
	
		</form>
	</body>
	</html>