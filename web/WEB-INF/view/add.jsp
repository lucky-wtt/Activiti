<%--
  Created by IntelliJ IDEA.
  User: 梓怡
  Date: 2019/11/29
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="<%=request.getContextPath()%>/commodity/add">
        <table style="width: 400px;height:300px" align="center" border="1" cellspacing="1">
            <tr>
                <th colspan="2">新增商品</th>
            </tr>
            <tr>
                <td>商品名称:</td>
                <td>
                    <input type="text" name="commname"/>
                </td>
            </tr>
            <tr>
                <td>商品数量:</td>
                <td>
                    <input type="text" name="commnum"/>
                </td>
            </tr>
            <tr>
                <td>商品类型:</td>
                <td>
                    <select name="commtype">
                        <option>电子产品</option>
                        <option>服装</option>
                        <option>水果</option>
                        <option>化妆品</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="开始新增">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
