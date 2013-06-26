<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mytagNameSpace" tagdir="/WEB-INF/tags" %>

<html>
<body>
<h1>Spring MVC Hello World Example</h1>

<h2>${msg}</h2>

<mytagNameSpace:mytag
        firstList="${list1}"
        secondList="${list1}"/>

<c:forEach var="str" items="hello, hi, hola">
    ${str}<br>
</c:forEach>

</body>
</html>