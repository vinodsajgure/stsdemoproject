<header>
	<div class="brand">
		<span class="brand-logo">logo</span>
		<div class="brand-text">SajgureFurniture</div>
	</div>
	<ul class="nav">
		<li><a href="<c:url value='/'/>">Home</a></li>
		<li><a href="<c:url value='/aboutus'/>">About Us</a></li>
		<li><a href="<c:url value='/contactus'/>">Contact Us</a></li>
		<li><a href="<c:url value='/gallery'/>">Gallery</a></li>
		
			<security:authorize access="!isAuthenticated()">
		<li><a href="<c:url value='/login'/>">Login</a></li>
			</security:authorize>
			
			
			<security:authorize access="hasAuthority('ADMIN')">
		<li><a href="<c:url value='/admin/dashboard'/>">Admin</a></li>
			</security:authorize>
	</ul>
	
	<security:authorize access="isAuthenticated()">
		<div class="btn-group">
			<button type="button" class="btn btn-info dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false" id="profile">
				<security:authentication property="principal.username" />
			</button>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="<c:url value='/logout'/>">Logout</a> 
			</div>
		</div>
	</security:authorize>


</header>