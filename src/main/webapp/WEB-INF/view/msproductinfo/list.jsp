<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品vo查询</title>
</head>
<body>
<div style="text-align: center;"><a href="toApplymsproduct">申请秒杀商品</a></div>
<table border="2">
    <tr>
        <td>商品id</td>
        <td>商品标题</td>
        <td>商品图片地址</td>
        <td>原价格</td>
        <td>秒杀价格</td>
        <td>商家id</td>
        <td>申请时间</td>
        <td>申请状态</td>
        <td>秒杀开始时间</td>
        <td>秒杀结束时间</td>
        <td>秒杀商品数量</td>
        <td>剩余库存数</td>
        <td>商品描述</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.productid}</td>
            <td>${item.producttitle}</td>
            <td>${item.productpic}</td>
            <td>${item.originalprice}</td>
            <td>${item.miaoshaprice}</td>
            <td>${item.merchantid}</td>
            <td>${item.applydate}</td>
            <td>${item.auditstate}</td>
            <td>${item.starttimeStr}</td>
            <td>${item.endtimeStr}</td>
            <td>${item.productcount}</td>
            <td>${item.stockcount}</td>
            <td>${item.description}</td>
            <td><a href="toupdate?id=${item.id}">修改</a>||<a href="del?id=${item.id}">删除</a>||<a href="querybyid?id=${item.id}">查看</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>