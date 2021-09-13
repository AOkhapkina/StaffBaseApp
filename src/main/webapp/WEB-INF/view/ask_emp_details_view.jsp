<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<html>
<head>

</head>
<body>
<h2>Dear Employee, please enter your details</h2>
<br>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name" placeholder="Name"/>
    <br><br>
    Surname <form:input path="surname" placeholder="Surname"/>
    <br><br>
    Salary <form:input path="salary" placeholder="Salary"/>
    <br><br>
    Department <form:select path="department" placeholder="Department">
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.}"
    </form:select>
    <br><br>

    <input type="submit" value="Ok">


</form:form>

</body>

</html>
