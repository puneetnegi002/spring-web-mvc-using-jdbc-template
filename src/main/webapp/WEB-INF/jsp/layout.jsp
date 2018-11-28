<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: dz-gg-06
  Date: 26/11/18
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:insertAttribute name="title" ignore="true"/></title>
</head>
<body>
<div><tiles:insertAttribute name="header"/></div>
<%--<div style="float:left;padding:10px;width:15%;"><tiles:insertAttribute name="menu" /></div>--%>
<div style="float:left;padding:10px;width:80%;border-left:1px solid pink;">
    <tiles:insertAttribute name="body"/></div>
<div style="clear:both"><tiles:insertAttribute name="footer"/></div>


</body>
</html>