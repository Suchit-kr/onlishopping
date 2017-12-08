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
	default:
		if (menu == "Home")
			break;
		$('#products').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

	var $table = $('#productListTable');

	// execute the below code only where we have this table
	if ($table.length) {
		console.log('Inside the table!');

		var jsonUrl = '';
		if (window.categoryId == '') {
			console.log('Inside the table!--- Inside all Products');
			jsonUrl = window.contextRoot + '/json/data/all/products';
		} else {
			console.log('Inside the table!--- Inside Category Products');
			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';
		}

		$table.DataTable({
		
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
								  
								  return '<img src="' + window.contextRoot +
								  '/resources/images/' + data + '.jpg"  class="dataTableImg" />';
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
									str += '<a href="' + window.contextRoot	+ '/show/'+ data+ '/product">View / 	</a> &#160;';

									str += '<a href="' + window.contextRoot	+ '/addToCart/'	+ data + '/product"  >Add to Cart</a> &#160;';

									
									
									return str;

								}

							} ]
				});
	}

});
