<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
    <style>
        .error {
            color: red;
        }

        .error-block {
            color: #000;
            background-color: #ffeeee;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;

        }
    </style>
</head>
<body>

<form:form commandName="goal">
    <form:errors cssClass="error-block" path="*" element="div"/>
    <table>
        <tr>
            <td><spring:message code="goal.enter_minutes"/></td>
            <td><form:input path="minutes"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter Goal Minutes">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
