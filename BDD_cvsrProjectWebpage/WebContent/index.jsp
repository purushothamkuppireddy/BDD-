<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="login.jsp">
Name:<input type="text" name="uname"><br>
Password:<input type="text" name="pass"><br>
address:<input type="text" name="address"><br>
Country <select name="country">
<option value="" selected="selected" disabled="disabled">Select your country</option>
<option value="India">India</option> 
<option value="Pakistan">Pakistan</option>
<option value="USA">USA</option>
<option value="China">China</option>
<option value="Japan">Japan</option>
 
</select>
<br>
ZIP Code:<input type="text" name="zipcode"><br>
Sex:<input type="radio" name="gender-male" value="male"> Male
	<input type="radio" name="gender-female" value="female"> Female<br>
Language:<input type="radio" name="language-english" value="English"> English
		 <input type="radio" name="language-non" value="NonEnglish"> Non-English<br>
<input type="submit" value="submit">
</form>
</body>
</html>