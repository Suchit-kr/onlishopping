<div class="container">
	<div class="row">

		<div class="col-md-3">
			<%@ include file="./shared/side-bar.jsp"%>
		</div>
		<!-- To display Actual Products Here -->
		<div class="col-md-9">

			<!-- Display BreadCrumbs component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickViewProducts == true}">
						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryViewProducts == true}">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">
									Home </a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>

					</c:if>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<table id="productListTable"
						class="table table-striped table-borderd">
						<thead>
							<tr>
								<td></td>
								<td>Name</td>
								<td>Brand</td>
								<td>Price</td>
								<td>Qty. Available</td>
								<td></td>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</tfoot>

					</table>

				</div>
			</div>

		</div>

	</div>

</div>