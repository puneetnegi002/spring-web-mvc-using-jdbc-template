<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dz-gg-06
  Date: 21/11/18
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Student Details</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <code>
        <h2>
            <center><b><u>Add Student Details</u></b></center>
        </h2>
        <form:form method="post" action="/save">
            <table class="table table-hover">
                <tr>
                    <td>Name :</td>
                    <td><form:input path="name"/></td>
                </tr>

                <tr>
                    <td>Age :</td>
                    <td><form:input path="age"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Save" class="btn btn-success"/></td>
                </tr>
            </table>
        </form:form>
    </code>
</div>
</body>
</html>
