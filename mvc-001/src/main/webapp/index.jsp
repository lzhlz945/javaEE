<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%
    pageContext.setAttribute("Path",request.getContextPath());

%>
<html>
<body>
<h2>Hello World!</h2>
<a href="${Path}/hello.do">点击</a>
<br>

<a href="${Path}/testParam?id=100">点击testParam</a>
<br>

<a href="${Path}/testHeader?id=100">点击testHeader</a>
<br>

<a href="${Path}/test/get/1">get请求</a>

    <form action="test/post" method="post">
        <input type="submit"  value="pos请求" />
    </form>

    <form action="test/delete/1" method="post">
       <input type="hidden" value="delete" name="_method"/>
        <input type="submit" value="delete请求"/>
    </form>

    <form action="test/put/1" method="post">
       <input type="hidden" value="put" name="_method"/>
        <input type="submit" value="put请求"/>
    </form>
</body>
</html>
