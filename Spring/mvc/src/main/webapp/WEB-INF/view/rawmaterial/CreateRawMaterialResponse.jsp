<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	${message}
	<br>
	
	<!-- We can use bean here as it is even though we cant see its init like stuff here -->
	Name is : ${rawMaterial.getName()} 
	<br><br>
	<!-- This is the beauty -->
	Id is : ${rawMaterial.getId()}
	<br><br>
	Currency  is : ${rawMaterial.getCurrency()}
	
</body>
</html>