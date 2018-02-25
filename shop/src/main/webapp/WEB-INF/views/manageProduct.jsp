<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>



<div class="container">

	<div class="row">
		<div class="row">
			<c:if test="${not empty message}">

				<div class="col-xs-12 ">
					<div class="alert alert-info ">
						<button type="button" class="close" data-dismiss="alert">&times;</button>
						${message}
					</div>
				</div>
			</c:if>
		</div>


		<div class="col-md-8 offset-md-2">
			<div class="panel panel-primary">

				<div class="panel-heading">
					<h3>Product Management</h3>
				</div>



				<div class="panel-body">
					<!-- Form Elements -->

					<sf:form class="form-horizontal" modelAttribute="product"
						action="${contextRoot}/manage/products" method="POST"
						enctype="multipart/form-data">

						<div class="form-group">

							<label class="control-label col-md-4" for="name">Enter
								Product Name:</label>
							<div class="col-md-8">
								<sf:input type="text" path="name" id="name"
									placeholder="Product Name" class="form-control" />
								<sf:errors path="name" cssClass="help-block" element="em" />
							</div>

						</div>


						<div class="form-group">

							<label class="control-label col-md-8" for="brandName">Enter
								Brand Name:</label>
							<div class="col-md-8">
								<sf:input type="text" path="brand" id="brand"
									placeholder="Brand Name" class="form-control" />
								<sf:errors path="brand" cssClass="help-block" element="em" />
							</div>

						</div>


						<div class="form-group">

							<label class="control-label col-md-4" for="name">Product
								Description:</label>
							<div class="col-md-8">
								<sf:textarea rows="4" path="description" id="description"
									class="form-control" placeholder="Product Description" />
								<sf:errors path="description" cssClass="help-block" element="em" />
							</div>

						</div>



						<div class="form-group">

							<label class="control-label col-md-4" for="name">Enter
								Unit Price:</label>
							<div class="col-md-8">
								<sf:input type="text" path="unit_price" id="unit_price"
									placeholder="Unit Price in &#8377" class="form-control" />
								<sf:errors path="unit_price" cssClass="help-block" element="em" />
							</div>

						</div>



						<div class="form-group">

							<label class="control-label col-md-4" for="name">Quantity
								Available:</label>
							<div class="col-md-8">
								<sf:input type="number" path="quantity" id="quantity"
									placeholder="Numder of Units Available" class="form-control" />
								<sf:errors path="quantity" cssClass="help-block" element="em" />
							</div>

						</div>


						<!-- File Element Image -->
						<div class="form-group">
							<label class="control-label col-md-4" for="name">Select
								Image:</label>
							<div class="col-md-8">
								<sf:input type="file" path="file" id="file"
									placeholder="Product Image" class="form-control" />
								<sf:errors path="file" cssClass="help-block" element="em" />
							</div>
						</div>



						<div class="form-group">

							<label class="control-label col-md-4" for="name">Select
								Category:</label>
							<div class="col-md-8">
								<sf:select class="form-control" path="category_id"
									id="category_id" items="${categories}" itemLabel="name"
									itemValue="id" />
								<sf:errors path="category_id" cssClass="help-block" element="em" />

							</div>

						</div>

						<div class="form-group offset-md-4">

							<input type="submit" name="submit" id="submit" value="Submit"
								class="btn btn-primary" />

						</div>


						<!-- Hidden Fields -->

						<sf:hidden path="id" />
						<sf:hidden path="code" />
						<sf:hidden path="supplier_id" />
						<sf:hidden path="purchases" />
						<sf:hidden path="views" />
						<sf:hidden path="is_active" />

					</sf:form>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-md-12 offset-md-2">
		<h1
			style="color: blue; font: italic bold 42px/40px Georgia, serif; text-decoration: underline;">Available
			Products</h1>
	</div>
</div>
<div class="row">
	<div class="col-md-10 offset-md-1">
		<table id="manageProductListTable"
			class="table table-bordered table-striped table-dark">
			<thead>
				<tr>
					<td>Id</td>
					<td>Image</td>
					<td>Name</td>
					<td>Brand</td>
					<td>Qty.</td>
					<td>Unit Price</td>
					<td>Active</td>
					<td>Edit</td>


				</tr>
			</thead>

			<tbody>
				<tr>
					<td>4</td>
					<td><img class="dataTableImg"
						src="${contextRoot}/resources/images/PRD2E69992216.jpg"
						alt="Macbook Pro"></td>
					<td>Macbook Pro</td>
					<td>Apple</td>
					<td>5</td>
					<td>&#8377; 57000/-</td>
					<td><label class="switch"> <input type="checkbox"
							checked> <span class="slider round"></span>
					</label></td>

					<td><a href="${contextRoot}/manage/4/product"
						class="btn btn-warning"> <span
							class="glyphicon glyphicon-pencil"></span>
					</a></td>


				</tr>


			</tbody>

			<tfoot>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
			</tfoot>


		</table>

	</div>

</div>