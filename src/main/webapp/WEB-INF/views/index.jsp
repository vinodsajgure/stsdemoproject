<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page session="false"%>
<html>
<head>
<title>SAJGURE FURNITURE</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<%@include file="templates/imports-top.jsp"%>

</head>
<body>
	<%@include file="templates/header/header.jsp"%>

	 <section class="section1"> 
		<div id="carouselExampleAutoplaying" class="carousel slide"
				data-bs-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="https://mdbcdn.b-cdn.net/img/Photos/Slides/img%20(10).webp" class="img-fluid d-block w-100"
							alt="...">
					</div>
					<div class="carousel-item">
						<img src="https://mdbcdn.b-cdn.net/img/Photos/Slides/img%20(11).webp" class="img-fluid d-block w-100"
							alt="...">
					</div>
					<div class="carousel-item">
						<img src="https://mdbcdn.b-cdn.net/img/Photos/Slides/img%20(13).webp" class="img-fluid d-block w-100"
							alt="...">
					</div>
					<div class="carousel-item">
						<img src="https://mdbcdn.b-cdn.net/img/Photos/Slides/img%20(16).webp" class="img-fluid d-block w-100"
							alt="...">
					</div>
				</div>
				<button class="carousel-control-prev" type="button"
					data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Previous</span>
				</button>
				<button class="carousel-control-next" type="button"
					data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Next</span>
				</button>
			</div>  	  
		 </section> 
		
		
		 <section class="section2"> 
			<h1>What Makes Us Different</h1>
			<br><br><br><br>
		<div class="row">
			<div class="col-6">
				<!-- Content for the first column goes here -->
				<ol class="list">
					<li>
						<h3>High-quality materials</h3>
						<p>We only use the finest materials in our furniture, such as
							solid wood, premium leather, and durable fabrics. This ensures
							that our furniture is built to last and will stand the test of
							time.</p>
					</li>
					<li>
						<h3>Customizable options</h3>
						<p>We offer a wide range of customizable options for our
							furniture, such as different finishes, colors, and fabrics. This
							allows customers to create a truly unique piece that reflects
							their personal style and taste.</p>
					</li>
					<li>
						<h3>Fast and efficient delivery</h3>
						<p>We have an efficient logistics and delivery system that
							ensures that our customers receive their orders in a timely
							manner. We also offer professional assembly services to make the
							process as smooth as possible for our customers</p>
					</li>
					<li>
						<h3>Personalized customer service</h3>
						<p>We have a team of experienced furniture experts who are
							dedicated to providing personalized customer service. We offer
							design advice, product recommendations and after-sales services
							to make sure that our customers are completely satisfied with
							their purchase.</p>
					</li>
				</ol>
			</div>
			<div class="col-6">
				<!-- Content for the second column goes here -->
				<img src="<c:url value='/resources/images/sec2.jpg'/>" alt="image">
			</div>
		</div>
	</section >
	
		
		 <section class="section3"> 
		 	<h1>Services Offered By Us</h1>
		 	<br><br><br>
			<div class="row">
				<div class="col-4"><img src="<c:url value='/resources/images/image3.png'/>" alt="image"></div>
				<div class="col-4"><img src="<c:url value='/resources/images/image3.png'/>" alt="image"></div>
				<div class="col-4"><img src="<c:url value='/resources/images/image3.png'/>" alt="image"></div>
				
				
			</div>
		
		 </section > 
		 
	<%@include file="templates/footer/footer.jsp"%>

	<%@include file="templates/imports-bottom.jsp"%>
</body>


</html>


