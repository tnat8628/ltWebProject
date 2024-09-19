<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<style type="text/css">
* {
	box-sizing: border-box
}

/* Add padding to containers */
.container {
	padding: 16px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit/register button */
.registerbtn {
	background-color: #04AA6D;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
</head>
<body>
	<form action="/studyproject/register" method="post">
		<c:if test="${alert !=null}">
			<h3 class="alert alertdanger">${alert}</h3>
		</c:if>
		<div class="container">
			<h1>Register</h1>
			<p>Please fill in this form to create an account.</p>
			<hr>

			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" required> <label
				for="email"><b>Email</b></label> <input type="text"
				placeholder="Enter Email" name="email" required> <label
				for="fullname"><b>Fullname</b></label> <input type="text"
				placeholder="Enter Fullname" name="fullname" required> <label
				for="phone"><b>Phone</b></label> <input type="text"
				placeholder="Enter Phone" name="phone" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required> <label
				for="psw-repeat"><b>Repeat Password</b></label> <input
				type="password" placeholder="Repeat Password" name="password-repeat"
				required>
			<hr>

			<button type="submit" class="registerbtn">Register</button>
		</div>

		<div class="container signin">
			<p>
				Already have an account? <a href="#">Sign in</a>.
			</p>
		</div>
	</form>
</body>
</html>