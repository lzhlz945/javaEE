<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("Path",request.getContextPath());

%>
<html>
<body>
<h2>Hello World!</h2>
<a href="${Path}/hello.do">点击</a>

<a href="${Path}/test/get/1">get请求</a>

<form action="test/post" method="post">
    <input type="submit"  value="pos请求" />
</form>
    <form action="test/delete/1" method="post">
       <input type="hidden" value="DELETE" name="_method"/>
        <input type="submit" value="delete请求"/>
    </form>
        <form action="test/put/1" method="post">
       <input type="hidden" value="PUT" name="_method"/>
        <input type="submit" value="put请求"/>
    </form>
</body>
</html>
