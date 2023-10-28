<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page session="false"%>
<html>
<head>
<title>Admin</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<%@include file="../templates/imports-top.jsp"%>
</head>

<body>
	<div class="wrapper">
	<%@include file="sidebar/sidebar.jsp"%>
	<div class="main">
      <h2>Dashboard</h2>
      <p>Welcome to the dashboard.</p>
    </div>
	</div>
	
</body>


</html>