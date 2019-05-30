<%--
  Created by IntelliJ IDEA.
  User: chentianyi
  Date: 19-5-30
  Time: 上午9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String key=request.getParameter("key");
        if (key==null) {
            out.print("没有参数");
            return;
        } else {
            out.print(key);
        }
    %>



</body>
</html>
