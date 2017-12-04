$(function() {
	// solving the active menu
	switch (menu) {
	case 'Home' :
	$('#home').addClass('active');
	break;
	case 'About-Us':
		$('#about').addClass('active');
		break;
	case 'Contact-Us':
		$('#contact').addClass('active');
		break;
	case 'View-Products' :
		$('#viewProducts').addClass('active');
		break;

	}
});