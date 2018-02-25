$(function() {
	// solving the active menu problem
	switch (menu) {

	case 'About-Us':
		$('#about').addClass('active');
		break;
	case 'Contact-Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#products').addClass('active');
		break;
	case 'Manage Products':
		$('#manageProduct').addClass('active');
		break;
	default:
		if (menu == "Home")
			break;
		$('#products').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

	var $table = $('#productListTable');

	// execute the below code only where we have Product list Table in Product
	// display page
	if ($table.length) {

		var jsonUrl = '';
		if (window.categoryId == '') {

			jsonUrl = window.contextRoot + '/json/data/all/products';
		} else {

			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';
		}

		$table
				.DataTable({

					lengthMenu : [ [ 3, 5, 10, -1 ],
							[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
					pageLength : 5,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'code',
								bSortable : false,

								mRender : function(data, type, row) {

									return '<img src="' + window.contextRoot
											+ '/resources/images/' + data
											+ '.jpg"  class="dataTableImg" />';
								}

							},
							{
								data : 'name'
							},
							{
								data : 'brand'
							},
							{
								data : 'unit_price',
								mRender : function(data, type, row) {
									return '&#8377; ' + data
								}
							},
							{
								data : 'quantity',
								mRender : function(data, type, row) {

									if (data < 1) {
										return '<span style="color:red">Out of Stock!</span>';
									}

									return data;

								}
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {

									var str = '';
									str += '<a href="'
											+ window.contextRoot
											+ '/show/'
											+ data
											+ '/product"  class="btn btn-info btn-sm"><span class="glyphicon glyphicon-eye-open"></span> </a> &#160;';

									if (row.quantity < 1) {
										str += '<a href="javascript:void(0) class="btn btn-success btn-sm disabled" ></a> &#160;';
									} else {
										str += '<a href="'
												+ window.contextRoot
												+ '/addToCart/'
												+ data
												+ '/product" class="btn btn-success btn-sm" ><span class="glyphicon glyphicon-shopping-cart" />Add to Cart</a> &#160;';
									}

									return str;

								}

							} ]
				});
	}

	var $table = $('#manageProductListTable');
	// execute the below code only where we have Product list Table in Product
	// Management Page

	/*
	 * if ($table.length) {
	 * 
	 * var jsonUrl= window.contextRoot+'/json/data/all/products';
	 * 
	 * $table.DataTable({ ajax: { url : jsonUrl, dataSrc='' }, columns:[ {
	 * data:'code', bSortable :false, mRender : function(data,type,row){
	 * 
	 * return 'img<src="' + window.contextRoot +'/resources/images'+ data
	 * +'.jpg class="dataTableImg" />'; } }
	 *  ]
	 *  }) }
	 */

	// dismissing alert after 3 seconds
	var $alert = $('.alert');

	if ($alert.length) {
		setTimeout(function() {
			$alert.fadeOut('slow');
		}, 5000)

	}

	$('.switch input[type="checkbox"]').on('change',	function() {

				var checkbox = $(this);
				var ischecked = checkbox.prop('checked');

				var dmsg = (ischecked) ? 'You want to activate the Product'
						: 'You want to deactivate the Product';
				var value = checkbox.prop('value');

				bootbox.confirm({
					size : 'medium',
					title : ' Product Avtivation/Deactivation',
					message : dmsg,
					callback : function(confirmed) {

						if (confirmed) {
							console.log(value);
							bootbox.alert({
								size : 'medium',
								title : 'information',
								message : 'Please confirm again ' + value
							});
						} else {
							checkbox.prop('checked', !checked);
						}

					}

				});
			})

});
