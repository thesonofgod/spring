<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student</h1>
<form:form action="processForm" modelAttribute= "student">
First Name : <form:input path="firstName"/>
<br></br>
Last Name : <form:input path="lastName"/>
<br></br>
Country:

<form:select path="country">
	<form:options items="${student.countryOptions}" />
</form:select>
	
<br></br>
<!-- hello ya'll -->
Favorite Language:

Java<form:radiobutton path="favoriteLanguage" value="Java"/>
C#<form:radiobutton path="favoriteLanguage" value="C#"/>
PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>

<br><br>
Favorite OS:

Windows OS<form:checkbox path="operatingSystem" value="WindowsOS"/>
Linux<form:checkbox path="operatingSystem" value="Linux"/>
Mac OS<form:checkbox path="operatingSystem" value="MacOs"/>

<br><br>

<input type = "submit" value="Submit" />
</form:form>

</body>
</html>
 