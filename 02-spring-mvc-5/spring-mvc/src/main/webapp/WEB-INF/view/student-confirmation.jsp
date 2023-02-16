<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by EricNguyen - 2/16/2023
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>

<body>
    The student is confirmed: ${student.firstName} ${student.lastName}
<br>
<br>

    The country is confirmed: ${student.country}

<br>
<br>

    Favorite Language: ${student.favoriteLanguage}

    <br>
    <br>

    OS:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>

</body>
</html>
