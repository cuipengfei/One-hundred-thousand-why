<%@ page import="com.test.common.controller.SomeClass" %>
<%@ page import="com.test.common.controller.SomeOtherClass" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
this is the first page

<br/>
<br/>
session hash:
<%= session.hashCode() %>

<br/>
<br/>
some class :
<%= ((SomeClass) session.getAttribute("someClass")).getStr() %>

<br/>
<br/>
some other class:
<%= ((SomeOtherClass) session.getAttribute("someOtherClass")).getStr() %>

</body>
</html>