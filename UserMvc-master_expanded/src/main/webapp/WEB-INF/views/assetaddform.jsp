<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asset Form</title>
</head>

<body>
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>Asset Form</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-book"></i> Home</a></li>
			<li class="active">Master</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<div class="box">

			<div class="form-container">



				<form:form method="POST" modelAttribute="asset"
					class="form-horizontal" action="/asset/save1">

					<div class="box-body">

						<div class="form-group">
							<label class="col-md-3" for="assetnumber">A.S. Number</label>
							<div class="col-md-7">
								<form:input type="text" path="assetnumber" id="assetnumber"
									class="form-control input-sm" required="required" />
								<div class="has-error">
									<form:errors path="assetnumber" class="help-inline" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3" for="assetname">A.S. Name</label>
							<div class="col-md-7">
								<form:input type="text" path="assetname" id="assetname"
									class="form-control input-sm" required="required" />
								<div class="has-error">
									<form:errors path="assetname" class="help-inline" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3" for="assetname">Category</label>
							<div class="col-md-7">
								<form:select type="text" path="category" id="category"
									class="form-control input-sm" required="required">
									<option>SELECT CATEGORY ......</option>
									<option value="Aset Tetap" >Asset Tetap</option>
									<option value="Asset Bergerak" >Asset Bergerak</option>
								</form:select>
								<div class="has-error">
									<form:errors path="category" class="help-inline" />

								</div>
							</div>
						</div>



						<div class="box-footer">
							<input type="submit" value="save" class="btn btn-primary btn-sm">
						</div>
				</form:form>
			</div>
		</div>
	</section>
</body>
</html>