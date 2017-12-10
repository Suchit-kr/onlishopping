<div class="container">
	<div class="row">
		
		<div class="col-lg-12">
			<!-- BreadCrumbs -->

			<div class="row">

				<div class="col-xs-12 col-md-12">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
						<li class="breadcrumb-item"><a
							href="${contextRoot}/show/all/products">Products</a></li>
						<li class="breadcrumb-item active">${product.name}</li>
					</ol>

				</div>


			</div>


			<div class="row">

				<div class="col-xs-12 col-md-6">
					<div class="thumbnail">
						<img src="${images}/${product.code}.jpg" class="singleImg" />
					</div>
				</div>

				<div class="col-xs-12 col-md-6">
					<h3>${product.name}</h3>
					<hr />

					<p>${product.description}</p>
					<hr>

					<h4>
						Price :<strong> &#8377 ${product.unit_price} </strong>
					</h4>
					<hr />
					<h6>Quantity Available : ${product.quantity}</h6>
					<a href="${contextRoot}/cart/add/${product.id}/product"
						class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span>Add to Cart </a>

					<!-- Back to all products page -->
					<a href="${contextRoot}/show/all/product" class="btn btn-primary">Back</a>



				</div>
			</div>
		</div>
	</div>
</div>