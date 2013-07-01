<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
this is the first page

<br/>
session hash:
<%= session.hashCode() %>
<br/>
someclass hash:
<%= session.getAttribute("someClass").hashCode() %>

</body>
</html>