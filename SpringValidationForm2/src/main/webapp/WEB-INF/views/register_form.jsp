<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
<style type="text/css">
	
	button {
		padding: 10px;
	}
	.error {
		color: red;
		font-style: italic;
	}
	form {
		display: table;
	}
	form div {
		display: table-row;
	}
	label, input, span, select {
		display: table-cell;
		margin: 5px;
		text-align: left;		
	}
	input[type=text], input[type=password], select, textarea {
		width: 200px;
		margin: 5px;
	}

	form div div {
		display: table-cell;
	}	
</style>
</head>
<body>
	<div align="center">
		<h2>User Registration</h2>
		<form:form action="myform" method="post" modelAttribute="user">
			<div>
			<form:label path="name">Full name:</form:label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error" />
			</div>
			
			<div>
			<form:label path="email">E-mail:</form:label>
			<form:input path="email" />
			<form:errors path="email" cssClass="error" />
			</div>

			<div>
			<form:label path="password">Password:</form:label>
			<form:password path="password"/>
			<form:errors path="password" cssClass="error" />
			</div>
			
			<div>
			<form:label path="profession">Profession:</form:label>			
			<form:input path="profession" />
			<form:errors path="profession" cssClass="error" />
			</div>
				
			

			
			
			<div>			
			<form:label path="note">Note:</form:label>
			<form:textarea path="note" cols="25" rows="5"/>
			<form:errors path="note" cssClass="error" />
			</div>
				
			<div>
				<div></div>
				<div>
				<form:button>Register</form:button>
				</div>
				<div></div>
			</div>
		</form:form>
	</div>
</body>
</html>