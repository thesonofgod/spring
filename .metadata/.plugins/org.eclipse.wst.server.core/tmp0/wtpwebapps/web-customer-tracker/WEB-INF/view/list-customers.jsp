<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>!!$$%%**^^##----==[[Customers List]]==----##^^**%%$$!!</title>

		<link type="text/css"
			  rel="stylesheet"
			  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

<div id="wrapper">
	<div id="header">
	<h2>CRM-Customer Relationship Manager</h2>
	</div>
</div>

<div id ="container">
	<div id="content">
	
	<input type="button" value="Add customer"
			onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"/>
		<!-- Html table goes here -->
		<table>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
			
			<!-- loop over and print our customers -->
			<c:forEach var="tempCustomer" items="${customers}">
				<tr>
					<!--  Construct a update link with customer id -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id}"></c:param>
					</c:url>
					<td> ${tempCustomer.firstName}</td>
					<td> ${tempCustomer.lastName}</td>
					<td> ${tempCustomer.email}</td>
					<td>
						<!--  update link to the action head -->
						<a href="${updateLink}">Update</a> 
					</td>
				</tr>	
			
			</c:forEach>	
		</table>
	</div>
</div>
</body>
</html>