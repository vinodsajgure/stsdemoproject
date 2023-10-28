<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page session="false"%>
<html>
<head>
<title>About Us</title>
<%@include file="templates/imports-top.jsp"%>

</head>
<body>
	<%@include file="templates/header/header.jsp"%>

	<section id="trending-products" class="trending-products-area">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <div class="section-title text-center pb-20">
                        <h3 class="title">Trending Products</h3>
                    </div> <!-- row -->
                </div>
            </div> <!-- row -->
            <div class="row">
            </div> <!-- row -->
            <div class="row grid">
                <div class="col-lg-4 col-sm-6 branding-3 planning-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.2s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img1.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img1.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">Chairs</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
                <div class="col-lg-4 col-sm-6 branding-3 planning-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.2s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img2.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img2.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">Chair</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
                <div class="col-lg-4 col-sm-6 branding-3 planning-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.2s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img3.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img3.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">SideBoard</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
                
                <div class="col-lg-4 col-sm-6 marketing-3 research-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.4s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img4.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img4.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">Chairs</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
                <div class="col-lg-4 col-sm-6 branding-3 marketing-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.7s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img5.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img5.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">Chair</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
                <div class="col-lg-4 col-sm-6 planning-3 research-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.2s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img6.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img6.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">Sideboard</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
                <div class="col-lg-4 col-sm-6 marketing-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.4s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img7.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img7.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">Chairs</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
                <div class="col-lg-4 col-sm-6 planning-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.7s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img8.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img8.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">Chair</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
                <div class="col-lg-4 col-sm-6 planning-3">
                    <div class="single-trending-products mt-30 wow fadeInUp" data-wow-duration="1.5s" data-wow-delay="0.7s">
                        <div class="trending-products-image">
                            <img src="<c:url value='/resources/images/blog-img9.png'/>" alt="">
                            <div class="trending-products-overlay d-flex align-items-center justify-content-center">
                                <div class="trending-products-content">
                                    <div class="trending-products-icon">
                                        <a class="image-popup" href="<c:url value='/resources/images/blog-img9.png'/>"><i class="lni-zoom-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="trending-products-text">
                            <h4 class="trending-products-title"><a href="#">Sideboard</a></h4>
                            <p class="text">Short description for the ones who look for something new. Awesome!</p>
                        </div>
                    </div> <!-- single trending-products -->
                </div>
            </div> <!-- row -->
        </div> <!-- container -->
    </section>


	<%@include file="templates/imports-bottom.jsp"%>

	<%@include file="templates/footer/footer.jsp"%>

	
</body>


</html>
