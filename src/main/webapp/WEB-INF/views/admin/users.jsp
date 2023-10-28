<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page session="false"%>
<html>
<head>
<title>Users</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<%@include file="../templates/imports-top.jsp"%>
</head>

<body>
	<div class="wrapper">
	<%@include file="sidebar/sidebar.jsp"%>
	<div class="main">
      <h2>Users</h2>
      <button class="btn btn-primary" type="button">Add New User</button>  
      <table class="table table-striped" id="UsersTable">
				<thead>
					<tr>
						<th>ID</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Email</th>
						<th>Roles</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${user}" var="users">
						<tr>
							<td>${users.userId}</td>
							<td>${users.firstName}</td>
							<td>${users.lastName}</td>
							<td>${users.email}</td>	
							<td><c:forEach items="${users.roles}" var="userrole">
								${userrole.role}
								</c:forEach>
							</td>
							<td><button class="btn btn-danger" type="button" >Delete</button></td>	
						</tr>	
					</c:forEach>		
				</tbody>
			</table>			
    	</div>
	</div>
	
</body>
</html>