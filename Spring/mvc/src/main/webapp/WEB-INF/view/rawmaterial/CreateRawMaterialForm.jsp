<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Raw Material Form</title>

<style type="text/css" >
	form{
		margin-top : 50px;
		margin-left : 10px;
	}
	
	form label {
		padding-right : 10px;
	}
	
	.theme{
		right:0px;
	}
	
	
</style>

</head>
<body>
	
	<link rel="stylesheet" href="<spring:theme code='stylesheet'/>" type="text/css"/>
	
	<a href="/SpringMVC/RawMaterial/createRawMaterial?appLanguage=fr" >French |</a>
	<a href="/SpringMVC/RawMaterial/createRawMaterial?appLanguage=en">English </a>
	
	<a class="theme" href="/SpringMVC/RawMaterial/createRawMaterial?appTheme=light" >Light Theme |</a>
	<a class="theme" href="/SpringMVC/RawMaterial/createRawMaterial?appTheme=dark">Dark Theme</a>
	
	
	
	<b style="color:red">${errorObject.get(0).getDefaultMessage()}</b>
	
	<form action="/SpringMVC/RawMaterial/createRawMaterial"    
			method="post"  name="rawMaterialbean">
			
		<!-- USING SPRING TAG LIBRARY FOR I18N  -->	
		<label> 	
			<spring:message code="label.name" />
		</label> 
		<input type="text" id="name" maxlength="100" name="rawMaterialName"/><br>
		
		 <label><spring:message code="label.title" /></label> <input type="text" id="title" maxlength="100" name="title"/><br>
		
		<label>Currency :</label> <select name="currency"> <option> Dollar</option><option> Yuan </option><option> Rupee</option> </select> <br>
		
		<label>Id :</label> <input type="number" id="id" maxlength="5" name="id"/> <br>
		
		<!-- <label>date of Creation : </label> <input type="date" name="creataionDate" /><br> -->
		
		<label>Seasonal Libraries</label> <select name="seasonalLibraries" multiple> <option> Winter Library </option><option> Autumn Library </option><option> Summer Library</option> </select>  <br>
		
		<label>Vendor :</label> <input type="text" id="vendor" maxlength="100" name="vendor"/><br>
		
		<label>Model Number :</label> <input type="text" id="model" maxlength="100" name="modelNumber"/><br>
		
		
		<input type="submit" value="Create" /> 
	</form>
	
</body>
</html>