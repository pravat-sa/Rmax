<%@ page contentType="text/html; charset = UTF-8"%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
	<%-- <div>${message}</div> --%>
	<div>
		<h3>Login Details</h3>
		<form name="login" method="post">
			User Name: <input type="text" id="userName" name="userName">
			Password: <input type="password" id="password" name="password">
			<input type="submit" value="Login">
		</form>
		Are you a new user? Please <a href="signUp">click here</a> to register.	
	</div>
</body>
</html>