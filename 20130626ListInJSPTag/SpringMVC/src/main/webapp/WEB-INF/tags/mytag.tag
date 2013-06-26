<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="firstList" required="true" %>
<%@ attribute name="secondList" required="true" type="java.util.ArrayList" %>

<div>
    this is a tag
    <br>

    <c:forEach var="item" items="${firstList}">
        ${item}
        <br>
    </c:forEach>

    <br>

    <c:forEach var="item" items="${secondList}">
        ${item}
        <br>
    </c:forEach>
</div>