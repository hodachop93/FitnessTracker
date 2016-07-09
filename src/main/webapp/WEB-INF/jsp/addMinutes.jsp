<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Minutes</title>
</head>
<body>

Language: <a href="?lang=en">English</a> | <a href="?lang=es">Spanish</a>

<h1><spring:message code="title.text"/></h1>
<form:form commandName="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text"/></td>
                <%--<td>Minutes Exercise For Today:</td>--%>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Exercise"/>
            </td>
        </tr>
    </table>
</form:form>
<h2>Our goal for the day is: ${goal.minutes}</h2>
</body>
</html>
