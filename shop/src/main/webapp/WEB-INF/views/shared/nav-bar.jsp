<%-- <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="${contextRoot}/home">e-Com Place</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li id="about" class="nav-item"><a class="nav-link"
					href="${contextRoot}/about">About</a></li>
				<li id="viewProducts" class="nav-item"><a class="nav-link"
					href="${contextRoot}/show/all/products">View Products</a></li>
				<li id="contact" class="nav-item"><a class="nav-link"
					href="${contextRoot}/contact">Contact</a></li>
			</ul>
		</div>
	</div>
</nav>
 --%>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="${contextRoot}/home">e-Com</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
 <!--      <li class="nav-item active">
        <a class="nav-link" id="about" href="#">Home <span class="sr-only">(current)</span></a>
      </li> -->
      <li class="nav-item">
        <a class="nav-link" id="viewProducts" href="${contextRoot}/show/all/products">View Products</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="contact" href="${contextRoot}/contact">Contact Us</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="about" href="${contextRoot}/about">About</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0" data-dpmaxz-eid="1">
      <input class="form-control mr-sm-2" type="text" placeholder="Search" data-dpmaxz-eid="2">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit" data-dpmaxz-eid="3">Search</button>
    </form>
  </div>
</nav>