<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Enquiry</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<%@include file="../templates/imports-top.jsp"%>
</head>

<body>
	<div class="wrapper">
		<%@include file="sidebar/sidebar.jsp"%>
		<div class="main">
			<h2>Enquiry</h2>
			<table class="table table-striped" id="enquiryTable">
				<thead>
					<tr>
						<th>ID</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Email</th>
						<th>Subject</th>
						<th>Message</th>
						<th>Status</th>
						<th>Action</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${enquiries}" var="enquiry">
						<tr>
							<td>${enquiry.id}</td>
							<td>${enquiry.fname}</td>
							<td>${enquiry.lname}</td>
							<td>${enquiry.email}</td>
							<td>${enquiry.subject}</td>
							<td>${enquiry.message}</td>
							<td>${enquiry.status}</td>
							<td>
								<form:form action="/admin/enquiries/${enquiry.id}" method="post" modelAttribute="statusDto">
								<form:select name="status" id="status" path="status" onchange="this.form.submit()">
									<option value="NEW"
										${enquiry.status.equals('COMPLETED') || enquiry.status.equals('INPROGRESS') || enquiry.status.equals('NEW')? 'disabled':''}
										${enquiry.status.equals('NEW') ? 'selected':''}>NEW</option>
									<option value="INPROGRESS"
										${enquiry.status.equals('COMPLETED') || enquiry.status.equals('INPROGRESS')? 'disabled':''}
										${enquiry.status.equals('INPROGRESS') ? 'selected':''}>INPROGRESS</option>
									<option value="COMPLETED"
										${enquiry.status.equals('COMPLETED') ? 'disabled':''}
										${enquiry.status.equals('COMPLETED') ? 'selected':''}>COMPLETED</option>
								</form:select>
								
								</form:form>
							</td>
							<td><button class="btn btn-danger" type="button"
								 onclick="function myDeleteFunction() {
  									document.getElementById("${enquiry.id}").deleteRow()}">Delete</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>	
</body>
</html>