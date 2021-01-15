<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%
    pageContext.setAttribute("Path",request.getContextPath());

%>
<html>
<body>
<h2>Hello World!</h2>
<a href="${Path}/hello.do">点击</a>
<br>

<a href="${Path}/testMap">testMap</a>
<br>

<a href="${Path}/testMaModel">testMaModel</a>
<br>

<a href="${Path}/testSession">testSession</a>
<br>

<a href="${Path}/testParam?id=100">点击testParam</a>
<br>

<a href="${Path}/testHeader?id=100">点击testHeader</a>


<br><a href="${Path}/testCookie">点击testCookie</a>
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

<br>
<br>

<form action="${Path}/testPojo">
    账户：<input type="text" name="userName" /><br>
    密码：<input type="password" name="password" /><br>
    姓名：<input type="text" name="name" /><br>
    年龄：<input type="text" name="age" /><br>
    email：<input type="text" name="email" /><br>
    城市：<input type="text" name="adress.city"/> <br>
    省份：<input type="text" name="adress.province"/> <br>
    兴趣爱好：<input type="checkbox" name="lll" value="lq" checked="checked"/>篮球<input name="lll" value="pq" type="checkbox"/>排球<input type="checkbox"/>玩游戏<br/>

    <input type="submit" value="提交" />
</form>

<br>
<br>
<h2>testModelAttribute</h2>
<form action="${Path}/testModelAttribute">
    账户：<input type="text" name="userName" /><br>
    姓名：<input type="text" name="name" /><br>
    年龄：<input type="text" name="age" /><br>
    email：<input type="text" name="email" /><br>

    <input type="submit" value="提交" />
</form>

<br>

<iframe name="i" align="center" ></iframe>
<ul>
    <li><a href="/WEB-INF/pages/success.jsp" target="i">iframe按钮</a></li>
</ul>
</body>
</html>
