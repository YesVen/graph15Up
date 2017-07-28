<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Raw Material Form</title>
</head>
<body>
	<form action="http://localhost:7001/SpringMVC/RawMaterial/createRawMaterial"    
			method="post"  name="rawMaterialbean">
		<label>Name :</label> <input type="text" border="1px" id="name" maxlength="100" name="name"/><br>
		
		 <label>Title :</label> <input type="text" border="1px" id="title" maxlength="100" name="title"/><br>
		
		<label>Currency :</label> <select name="currency"> <option> Dollar</option><option> Yuan </option><option> Rupee</option> </select> <br>
		
		<label>Id :</label> <input type="number" border="1px" id="id" maxlength="5" name="id"/> <br>
		
		<!-- <label>date of Creation : </label> <input type="date" name="creataionDate" /><br> -->
		
		<label>Seasonal Libraries</label> <select name="seasonalLibraries" multiple> <option> Winter Library </option><option> Autumn Library </option><option> Summer Library</option> </select>  <br>
		
		<input type="submit" value="Create" /> 
	</form>
	
</body>
</html>