<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Minutes</title>
    <script type="text/javascript" src="../../jquery-3.0.0.js"></script>
    <script>
        $(document).ready(
                function () {
                    $.getJSON('<spring:url value="activities.json"/>', {
                        ajax: 'true'
                    }, function (data) {
                        console.log(data);
                        var html = '<option value="">--Please select one--</option>';
                        var length = data.length;
                        for (var i = 0; i < length; i++) {
                            html += '<option value="' + data[i].desc + '">' + data[i].desc + '</option>';
                        }

                        $('#activities').html(html);
                    });
                });
    </script>
</head>
<body>

Language: <a href="?lang=en">English</a> | <a href="?lang=es">Spanish</a>

<h1><spring:message code="title.text"/></h1>
<form:form commandName="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text"/></td>
            <td><form:input path="minutes"/></td>
            <td><form:select id="activities" path="activity"/></td>
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
