display.jsp


<br><br>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>display.jsp</title>
	</head>
<body>
	<h3>Registration Information</a></h3>
	<table align="left" border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name </th>
			<th>Salary</th>
			<th>Department</th>
			<th>Position</th>
			<th>Email Address </th>
			<th>Contact No</th>
		</tr>
		<c:forEach items="${Emp}" var="p">
			<tr>
				<td><c:out value="${p.getFirst_Name()}"></c:out></td>
				<td><c:out value="${p.getLast_Name()}"></c:out></td>
				<td><c:out value="${p.getSalary()}"></c:out></td>
				<td><c:out value="${p.getDepartment()}"></c:out></td>
				<td><c:out value="${p.getPosition()}"></c:out></td>
				<td><c:out value="${p.getEmail_Address()}"></c:out></td>
				<td><c:out value="${p.getContact_No()}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>