<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Contact Us</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<%@include file="templates/imports-top.jsp"%>
<style type="text/css">
.error{

color:red;
	
}

</style>
</head>
<body>
	<%@include file="templates/header/header.jsp"%>
	<c:url value='/contactus' var="contactusPostUrl"/>
	
	<div class="register">
	<div class=body2>	
		<div style="margin-top:150px;height:auto;color:green">${successMsg}</div>
		<div class="${showForm}">
		<form:form action="${contactusPostUrl}" method="post" modelAttribute="contactFormDto">
		<div class="container">
				<h1>Contact Us</h1>
				<p>Please fill in this form to contact us.</p>
			<label for="fname">First name:</label><br>
  			<form:input type="text" id="fname" name="fname" path="fname"/>
  			<form:errors path="fname" class="error"></form:errors><br>
  			
  			<label for="lname">Last name:</label><br>
 			<form:input type="text" id="lname" name="lname" path="lname"/>
 			<form:errors path="lname" class="error"></form:errors><br>
 			
 			<label for="email">Email Id:</label><br>
 			<form:input type="text" id="email" name="email" path="email"/>
 			<form:errors path="email" class="error"></form:errors><br>
 			
 			<label for="subject">Subject:</label><br>
 			<form:input type="text" id="sub" name="subject" path="subject"/>
 			<form:errors path="subject" class="error"></form:errors><br>
 			
 			<label for="message">Message:</label><br>
 			<form:textarea type="text" name="message" path="message"></form:textarea>
 			<form:errors path="message" class="error"></form:errors><br>
 			</div>	
 			<input type="submit" class="registerbtn" value="submit"/>
 			</form:form>
 		</div>
	
		</div>
		</div>
	
	<%@include file="templates/footer/footer.jsp"%>

	<%@include file="templates/imports-bottom.jsp"%>

</body>


</html>
