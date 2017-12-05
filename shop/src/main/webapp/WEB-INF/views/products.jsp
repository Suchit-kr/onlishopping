<div class="container">
	<div class="row">

		<div class="col-md-3">
			<%@ include file="./shared/side-bar.jsp"%>
		</div>

		<div class="col-md-9">
			<div class="row">
				<div class="col-md-12">
					<c:if test="${userClickViewProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home /</a></li>
							<li class="breadcrumb-item active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryViewProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home"> Home </a></li>
							<li class="breadcrumb-item active">Category </li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>

						<!-- <link rel="stylesheet"
							href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
							integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
							crossorigin="anonymous">

						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="#">First Page</a></li>
							<li class="breadcrumb-item active">Home Page</li>
						</ol> -->
					</c:if>
				</div>
			</div>
		</div>

	</div>

</div>