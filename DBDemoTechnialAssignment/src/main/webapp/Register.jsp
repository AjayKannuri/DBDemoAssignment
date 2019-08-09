<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<marquee><h1>TECHNICAL SUPPORT REQUEST</h1></marquee>
<hr>
<table style="border:5;color:#FF3333;border-color:#FF3333;background-color:#F0F3F4 ">
<form action="register" method="post">
<tr> <td>Please Enter the Email:</td> <td><input type="email" name="emailid"></td> </tr>
<tr></tr>
<tr> <td>Select the Software:</td> 
     <td><select name="software">
        <option value="Microsoft word">Microsoft word</option>
        <option value="Micorsoft Excel">Micorsoft Excel</option>
        <option value="Microsoft PowerPoint">Microsoft PowerPoint</option>
        <option value="Python IDE">Python IDE</option>
        <option value="Photoshop">Photoshop</option></td> </tr>
        <tr></tr>
        <tr> <td>Select the Operating System:</td> 
     <td><select name="os">
        <option value="Windows 2000">Windows 2000</option>
        <option value="Windows 2007">Windows 2007</option>
        <option value="Linus OS">Linus OS</option>
        <option value="Windows 2010">Windows 2010</option>
        <option value="Mac OS">Mac OS</option></td>  </tr>
        <tr></tr>
<tr> <td>Problem Description:</td> <td><textarea rows="4" cols="50" name="problem" placeholder="Enter the Problem Description...">
</textarea>
</td> </tr>
<tr>  </tr>
<tr><td><input type="submit" name="submit" Value="Submit Request"></td></tr>
</form>
</table>
<hr>
</body>
</html>