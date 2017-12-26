<%--
  Created by IntelliJ IDEA.
  User: sqm
  Date: 2017-12-25
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/http-request-controller.do">welcome</a>  <br/>
  <%--<a href="${pageContext.request.contextPath}/abstract-controller.do">welcome</a>--%>
  <form action="${pageContext.request.contextPath}/abstract-controller.do" method="post">
      <input type="submit" value="abstract-controller"/>
  </form>
  <a href="${pageContext.request.contextPath}/bean-name-view-resolver.do">welcome</a><br/>
  </body>
</html>
