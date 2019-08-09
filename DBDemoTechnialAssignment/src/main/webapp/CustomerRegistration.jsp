<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<marquee><h1>Customer Registration</h1></marquee>
<hr>
<form action="CustomerRegistration" method="post">
<table align="center" style="border:5;color:#FF3333;border-color:#FF3333;background-color:#F0F3F4 ">
<h3 align="center" >Please Register!!!!</h3>
<tr> <td>Please Enter FirstName</td> <td><input type="text" name="FirstName"></td> </tr>
<tr></tr>
<tr> <td>Please Enter LastName</td> <td><input type="text" name="LastName"></td> </tr>
<tr></tr>
<tr> <td>Please Enter the Email:</td> <td><input type="email" name="EmailID"></td> </tr>
<tr> <td>Please Enter PhoneNumber</td> <td><input type="number" name="PhoneNumber" pattern="[1-9]{1}[0-9]{9}"> </td> </tr>
<tr></tr>
<tr>  </tr>
<tr><td><input type="submit" name="submit" Value="Customer Registration"></td></tr>
</table>
</form>
</body>
</html>