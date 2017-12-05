$(function() {
	// solving the active menu
	switch (menu) {

	case 'About-Us':
		$('#about').addClass('active');
		break;
	case 'Contact-Us':
		$('#contact').addClass('active');
		break;
	case 'Products':
		$('#viewProducts').addClass('active');
		break;
	default:
		$('#viewProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;

	}
});