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
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname" placeholder="Surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary" placeholder="Salary"/>
    <form:errors path="salary"/>
    <br><br>
    Phone number <form:input path="phoneNumber" placeholder="x-xxx-xxx-xx-xx"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Phone number <form:input path="email" placeholder="email"/>
    <form:errors path="email"/>
    <br><br>
    Department <form:select path="department" placeholder="Department">
    <form:options items="${employee.departments}"/>
    <%--    hard code, переносим из jsp в java --%>
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>
</form:select>
    <br><br>

    Choose the brand of your car:
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <%--    hard code, переносим из jsp в java --%>
    <%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
    <%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
    <%--    Mercedes-Benz <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    <br><br>

    Foreign Language(s):
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <%--    hard code, переносим из jsp в java --%>
    <%--    EN <form:checkbox path="languages" value="English"/>--%>
    <%--    DE <form:checkbox path="languages" value="Deutsch"/>--%>
    <%--    FR <form:checkbox path="languages" value="French"/>--%>

    <input type="submit" value="Ok">
</form:form>

</body>

</html>
