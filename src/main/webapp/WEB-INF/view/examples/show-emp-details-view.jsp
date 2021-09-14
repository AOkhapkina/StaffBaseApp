<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %> &lt;%&ndash;декларация о том, что это код java&ndash;%&gt;--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ page isELIgnored="false" %>--%>
<!DOCTYPE html>
<html>

<body>
<h2>Dear Employee, you are WELCOME!</h2>
<br>
<br>
<br>

<%--Your name is: ${param.employeeName} --%> <%--извлекаем введенное имя--%>

Your name is: ${nameAttribute} ${description}

</body>

</html>
