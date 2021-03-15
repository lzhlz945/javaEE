<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/12
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        div{
            color: red;
        }
    </style>
</head>
<body>
  <div align="center">

  <h1>点击跳转成功</h1>

      map: ${requestScope.map}<br><br>
      model: ${requestScope.model}<br><br>
      session:${sessionScope.session}<br><br>
      session-user:${sessionScope.user}<br><br>
      mapAndSession:${sessionScope.mapAndSession}<br><br>
  </div>

<fmt:message key="i18n.password"/>
</body>
</html>
