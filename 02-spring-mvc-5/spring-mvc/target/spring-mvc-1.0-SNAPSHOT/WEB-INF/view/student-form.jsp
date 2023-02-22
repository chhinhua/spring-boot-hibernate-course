<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fomr" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by EricNguyen - 2/15/2023
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Register Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>

    Favorite Language:
        <form:radiobuttons items="${student.favoriteLanguageOptions}" path="favoriteLanguage"/>
    <%--Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C# <form:radiobutton path="favoriteLanguage" value="C#"/>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>--%>

    <br>
    <br>

    OS:
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
        MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
    <br><br>

    Country:
    <form:select path="country">
        <%--<form:option value="Brazil" label="Brazil"/>
        <form:option value="France" label="France"/>--%>
        <form:options items="${student.countryOptions}"/>
    </form:select>

    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
