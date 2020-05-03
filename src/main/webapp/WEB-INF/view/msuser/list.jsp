<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户vo查询</title>
</head>
<body>
<c:forEach items="${msuserlist}" var="item">
    用户姓名:${item.username},
    用户账号:${item.useraccount},
    用户密码:${item.userpassword},
    用户性别:${item.usersex},
    用户年龄:${item.userage},
    用户地址:${item.useraddress},
    用户邮箱:${item.useremail} </br>
</c:forEach>
</body>
</html>
