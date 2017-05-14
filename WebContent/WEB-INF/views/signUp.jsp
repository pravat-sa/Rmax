<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<body>
	<div>
		<f:form action="registerUser" name="userRegistration" method="post" modelAttribute="user">
			<table>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name" id="name"></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td><input type="radio" name="gender" id="gender" value="male">
						Male <input type="radio" name="gender" id="gender" value="female">
						Female</td>
				</tr>
				<tr>
					<td>Date Of Birth :</td>
					<td><input type="date" name="dob" id="dob"></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email" id="email"></td>
				</tr>
				<tr>
					<td>Mobile Number :</td>
					<td><input type="tel" name="mobile" id="mobile"></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username" id="username"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" id="password">
					</td>
				</tr>
				<tr>
					<td>Confirm Password :</td>
					<td><input type="password" name="confPassword"
						id="confPassword"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" id="submit"
						value="Register"></td>
					<td><input type="reset" name="reset" id="reset" value="Reset"></td>
				</tr>
			</table>
		</f:form>
	</div>
</body>
</html>