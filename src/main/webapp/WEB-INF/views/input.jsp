<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
		<title>input.jsp</title>
	</head>
<body>
  
	<form:form action="addemp"  method="post" modelAttribute="registration">
	  <table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="First_Name" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input path="Last_Name" /></td>
			</tr>
			<tr>
				<td>Salary :</td>
				<td><form:input path="Salary" /></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><form:input path="Department" /></td>
			</tr>
			<tr>
				<td>Position:</td>
				<td><form:input path="Position" /></td>
			</tr>
			<tr>
			<tr>
				<td>Email Address :</td>
				<td><form:input path="Email_Address" /></td>
			</tr>
			<tr>
				<td>Contact No :</td>
				<td><form:input path="Contact_No" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Register"></td>
			</tr>
		</table>
		
	</form:form>
	
</body>
</html>

