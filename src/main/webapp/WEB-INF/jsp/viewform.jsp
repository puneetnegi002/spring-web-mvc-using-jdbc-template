<%--
  Created by IntelliJ IDEA.
  User: dz-gg-06
  Date: 19/11/18
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student Details</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>
        <center><b><u>Student Details</u></b></center>
    </h2>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>Student Age</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td><a href="<c:url value="/remove/${student.id}"/>" class="btn btn-danger" role="button">Delete</a>
                </td>
                <td><a href="<c:url value="/update/${student.id}"/>" class="btn btn-info" role="button">Update</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
    <br>
    <center><h4><c:out value="${message}"/></h4></center>
    <br><br>
    <center><a href="<c:url value="/addstudent"/>"><input type="button" value="Add Student Details"
                                                          class="btn btn-primary"> </a></center>
</div>
</body>
</html>
