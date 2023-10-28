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

	<section class="aboutus">
	<div class="aboutsec">
    <h2>Our Story</h2>
    <p>We are a family-owned furniture store that has been in business for over 20 years. We pride ourselves on providing high-quality, stylish furniture at affordable prices. We source our products from all over the world, and we are always on the lookout for the latest trends and designs.</p>
    <h2>Our Team</h2>
    <p>Our team of experienced furniture experts are passionate about helping our customers find the perfect piece for their homes. From design advice to delivery and assembly, we are here to make the process as smooth and stress-free as possible.</p>
    <h2>Our Commitment to Sustainability</h2>
    <p>We understand the importance of being environmentally responsible and we are committed to reducing our impact on the environment. We source our products from sustainable and eco-friendly sources whenever possible and we are constantly looking for ways to improve our environmental performance.</p>
 	</div>
  </section>



	<%@include file="templates/footer/footer.jsp"%>

	<%@include file="templates/imports-bottom.jsp"%>

</body>


</html>
