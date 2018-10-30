<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<body>

<table border="1">
    <tr>
        <th>ID</th>
        <th>站点名字</th>
        <th>开始检测的主页</th>
        <th>创建时间</th>
    </tr>
    <tr>
        <td>${siteDO.siteId }</td>
        <td>${siteDO.siteName }</td>
        <td>${siteDO.siteUrl }</td>
        <td>${siteDO.gmtCreated }</td>
    </tr>
</table>
</body>
</html>
