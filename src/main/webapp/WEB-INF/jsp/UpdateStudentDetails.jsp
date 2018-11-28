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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="height: 400px">
    <h2><b><u>Update Student Details</u></b></h2>
    <form:form method="post" action="/updatestudent">


        <div class="form-group">
            <label class="control-label col-sm-2" for="id">Student Id :</label>
            <div class="col-sm-10">
                <form:input path="id" readonly="true" class="form-control"/>
            </div>
        </div>


        <div class="form-group">
            <label class="control-label col-sm-2" for="name">Student Name :</label>
            <div class="col-sm-10">
                <form:input path="name" class="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="age">Student Age :</label>
            <div class="col-sm-10">
                <form:input path="age" class="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Update" class="btn btn-success"
                       style="height: 40px;width: 200px;"/>
            </div>
        </div>

    </form:form>

</div>
</body>
</html>
