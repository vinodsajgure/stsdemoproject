<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<title>login</title>
<%@include file="../templates/imports-top.jsp"%>

</head>

<body class="body1">

	<%@include file="../templates/header/header.jsp"%>
	<div class="loginform">
		<div class="form-wrapper">
			<h1>Sign In</h1>
			<form class="login" method="post">
				${logout}<br>
				<c:if test="${param.error == ''}">
					<div style="color: red; margin: 10px 0px;">
						Login Failed!!!<br /> Reason :
						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
					</div>
				</c:if>
				<br>

				<c:if test="${param.logout == ''}">
					<div style="color: green; margin: 10px 0px;">
						Logout Successfully...<br />
					</div>
				</c:if>
				<div class="form-item">
					<label for="username"></label> 
					<input type="text" name="username" required="required" placeholder="Username"></input>
				</div>
				<div class="form-item">
					<label for="password"></label>
					 <input type="password" name="password" required="required" placeholder="Password"></input>
				</div>
				<div class="button-panel">
					<input type="submit" class="button" title="Sign In" value="Sign In"></input>
				</div>
			</form>
			<div class="form-footer">
				<p>
					<a href="<c:url value='/register'/>">Create an account</a>
				</p>
				<p>
					<a href="#">Forgot password?</a>
				</p>
			</div>
		</div>
	</div>
	<%@include file="../templates/footer/footer.jsp"%>

	<%@include file="../templates/imports-bottom.jsp"%>

	</body>
</html>


