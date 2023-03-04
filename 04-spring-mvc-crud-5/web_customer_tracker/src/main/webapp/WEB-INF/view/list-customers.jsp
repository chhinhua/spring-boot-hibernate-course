<%--
  Created by EricNguyen - 2/28/2023
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.luv2code.springdemo.utils.SortUtils" %>

<html>
<head>
    <title>List Customers</title>
    <%--    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/WEB-INF/resources/css/style.css">--%>
    <style>
        html, body {
            margin-left: 15px;
            margin-right: 15px;
            padding: 0;
            font-family: Verdana, Arial, Helvetica, sans-serif;
        }

        table {
            border-collapse: collapse;
            border-bottom: 1px solid gray;
            font-family: Tahoma, Verdana, Segoe, sans-serif;
            width: 72%;
        }

        th {
            border-bottom: 1px solid gray;
            background: none repeat scroll 0 0 #09c332;
            padding: 10px;
            color: #FFFFFF;
        }

        tr {
            border-top: 1px solid gray;
            text-align: center;
        }

        tr:nth-child(even) {
            background: #FFFFFF
        }

        tr:nth-child(odd) {
            background: #BBBBBB
        }

        #wrapper {
            width: 100%;
            margin-top: 0;
        }

        #header {
            width: 70%;
            background: #09c332;
            margin-top: 0;
            padding: 15px 0 15px 15px;
        }

        #header h2 {
            width: 100%;
            margin: auto;
            color: #FFFFFF;
        }

        #container {
            width: 100%;
            margin: auto
        }

        #container h3 {
            color: #000;
        }

        #container #content {
            margin-top: 20px;
        }

        .add-button {
            border: 1px solid #666;
            border-radius: 5px;
            padding: 4px;
            font-size: 12px;
            font-weight: bold;
            width: 120px;
            padding: 5px 10px;

            margin-bottom: 15px;
            background: #cccccc;
        }
    </style>

</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <%--            put new button: Add customer --%>
        <input type="button" value="Add Customer"
               onclick="window.location.href='showFormForAdd'; return false;"
               class="add-button"
        />
        <br>
        <!--  add a search box -->
        <form:form action="search" method="GET">
            Search customer:
            <label>
                <input type="text" name="theSearchName"/>
            </label>

            <input type="submit" value="Search" class="add-button"/>
        </form:form>

        <%--            add out html table here--%>
        <!-- construct a sort link for first name -->
        <c:url var="sortLinkFirstName" value="/customer/list">
            <c:param name="sort" value="<%= Integer.toString(SortUtils.FIRST_NAME) %>"/>
        </c:url>

        <!-- construct a sort link for last name -->
        <c:url var="sortLinkLastName" value="/customer/list">
            <c:param name="sort" value="<%= Integer.toString(SortUtils.LAST_NAME) %>"/>
        </c:url>

        <!-- construct a sort link for email -->
        <c:url var="sortLinkEmail" value="/customer/list">
            <c:param name="sort" value="<%= Integer.toString(SortUtils.EMAIL) %>"/>
        </c:url>

        <table>
            <tbody>

            <tr>
                <th><a href="${sortLinkFirstName}">First Name</a></th>
                <th><a href="${sortLinkLastName}">Last Name</a></th>
                <th><a href="${sortLinkEmail}">Email</a></th>
                <th>Action</th>
            </tr>
            </tbody>

            <%-- loop over and print out customers --%>
            <c:forEach var="tempCustomer" items="${customers}">

                <%-- contruct an "update" link with customer id --%>
                <c:url var="updateLink" value="/customer/showFormForUpdate">
                    <c:param name="customerId" value="${tempCustomer.id}"/>
                </c:url>

                <%-- contruct an "delete" link with customer id --%>
                <c:url var="deleteLink" value="/customer/delete">
                    <c:param name="customerId" value="${tempCustomer.id}"/>
                </c:url>


                <tr>
                    <td>${tempCustomer.firstName}</td>
                    <td>${tempCustomer.lastName}</td>
                    <td>${tempCustomer.email}</td>
                    <td>
                            <%-- display the update/delete link--%>
                        <a href="${updateLink}">Update</a>
                        |
                        <a href="${deleteLink}"
                           onclick="if(!(confirm('Delete customer?'))) return false">
                            Delete
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>
