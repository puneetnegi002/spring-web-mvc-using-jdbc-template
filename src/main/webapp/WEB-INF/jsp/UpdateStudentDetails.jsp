<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dz-gg-06
  Date: 20/11/18
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Update Student Details</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <code>
        <center>
            <h2><b><u>Update Student Details</u></b></h2>
            <form:form method="post" action="/updatestudent">
                <table class="table table-hover">
                    <tr>
                        <td><b>Student id:</b></td>
                        <td><form:input path="id" readonly="true"/></td>
                    </tr>
                    <tr>
                        <td><b>Student Name:</b></td>
                        <td><form:input path="name"/></td>
                    </tr>

                    <tr>
                        <td><b>Student Age :</b></td>
                        <td><form:input path="age"/></td>
                        <td><form:errors title="gdf"/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Update" class="btn btn-success"
                                   style="height: 40px;width: 200px;"/>
                        </td>
                    </tr>

                </table>
            </form:form>

        </center>
    </code>
</div>
</body>
</html>
