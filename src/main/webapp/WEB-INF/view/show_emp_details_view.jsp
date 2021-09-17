<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<html>

<body>
<h2>Dear Employee, you are welcome!</h2>
<br>
<br>
<br>
Your Name: ${employee.name}
<br><br>
Your Surname: ${employee.surname}
<br><br>
Your salary: $ ${employee.salary}
<br><br>
Your department: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br><br>
Your language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
                ${lang}
        </li>
    </c:forEach>
</ul>
<br><br>
Phone number: ${employee.phoneNumber}, email: ${employee.email}
<br><br>
</body>

</html>
