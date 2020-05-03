<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商家vo查询</title>
</head>
<body>
<c:forEach items="${msmerchantlist}" var="item">
    商家的姓名:${item.merchantname},
    商家的店铺名称:${item.merchantshopname},
    商家账号:${item.merchantaccount},
    商家密码:${item.merchantpassword},
    商家经营范围:${item.merchantscope} </br>
</c:forEach>
</body>
</html>
