
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post"> <%--실행하면 액션링크로 감--%>
username: <input type="text" name="username" />
age: <input type="text" name="age" />
<button type="submit">전송</button>
</form>
</body>
</html>
