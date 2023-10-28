<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Register Here</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<%@include file="templates/imports-top.jsp"%>
<c:url value='/register' var="registerPostUrl"/>

<style type="text/css">
.error{
color:red;	

}

</style>

</head>
<body class="register">
	<%@include file="templates/header/header.jsp"%>
	<div class=body2>
		<form:form  action="${registerPostUrl}" method="post" modelAttribute="userDto">
			<div class="container">
				<h1>Register</h1>
				<p>Please fill in this form to create an account.</p>
				<div class="formInstructionsDiv formElement">	
					<c:if test="${successMsg!=null}"><div>${successMsg},<a href="/login">login</a></div></c:if>
				</div>
				<hr>

				<label for="firstName"><b>firstName</b></label> 
				<form:input type="text" placeholder="Enter firstName" name="firstName"  id="firstName" path="firstName"/>
				<form:errors path="firstName" class="error"></form:errors><br>
				
				<label for="lastName"><b>lastName</b></label>
				<form:input type="text" placeholder="Enter lastName" name="lastName"  id="lastName" path="lastName"/>
				<form:errors path="lastName" class="error"></form:errors><br>
				
				<label for="email"><b>email</b></label>
				<form:input type="text" placeholder="Enter email" name="email"  id="email" path="email"/>
				<form:errors path="email" class="error"></form:errors><br>
				
				<label for="psw"><b>Password</b></label>
				<form:input type="password" placeholder="Enter Password" name="psw"  id="psw" path="password"/>
				<form:errors path="password" class="error"></form:errors><br> 
				
				<hr>
				<button type="submit" class="registerbtn">Register</button>
			</div>

			<div class="container signin">
				<p>
					Already have an account? <a href="<c:url value='/login'/>">login</a>.
				</p>
			</div>
		</form:form>
	</div>
	<%@include file="templates/footer/footer.jsp"%>

	<%@include file="templates/imports-bottom.jsp"%>

</body>


</html>
