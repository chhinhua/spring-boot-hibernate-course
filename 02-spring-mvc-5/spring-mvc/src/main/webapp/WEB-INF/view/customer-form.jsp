<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by EricNguyen - 2/16/2023
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {color: red}
    </style>
</head>
<body>

<i>Fill out the form. Asterisk (*) means required.</i>

<form:form action="processForm" modelAttribute="customer">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <br><br>

    <input type="submit" value="Submit" />


</form:form>

</body>
</html>