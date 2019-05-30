<%@ page import="service.DeptService" %>
<%@ page import="service.impl.DeptServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Dept" %><%--
  Created by IntelliJ IDEA.
  User: chentianyi
  Date: 19-5-29
  Time: 下午6:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    DeptService deptService = new DeptServiceImpl();
    List<Dept> depts = deptService.listAllDept();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <th>
            <td>部门编号</td>
            <td>部门名称</td>
            <td>部门位置</td>
            <td>部门负责人</td>
        </th>
        <%
            for (Dept d:depts) {
        %>
        <tr>
            <td><%=d.getDeptId()%></td>
            <td><%=d.getDeptName()%></td>
            <td><%=d.getDeptLoc()%></td>
            <td><%=d.getDeptManager()%></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
