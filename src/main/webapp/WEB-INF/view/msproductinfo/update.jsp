<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>申请秒杀商品</title>
</head>
<body>
<form action="updatemsproduct" method="post">
    商品id:<input name="productid" value="${msproductinfo.productid}"></br>
    商品标题:<input name="producttitle" value="${msproductinfo.producttitle}"></br>
    商品图片地址:<input name="productpic" value="${msproductinfo.productpic}"></br>
    原价格:<input name="originalprice" value="${msproductinfo.originalprice}"></br>
    秒杀价格:<input name="miaoshaprice" value="${msproductinfo.miaoshaprice}"></br>
    秒杀开始时间:<input name="starttimeStr" value="${starttimeStr}"></br>
    秒杀结束时间:<input name="endtimeStr" value="${endtimeStr}"></br>
    商品数量:<input name="productcount" value="${msproductinfo.productcount}"></br>
    剩余库存数:<input name="stockcount" value="${msproductinfo.stockcount}"></br>
    商品描述:<input name="description" value="${msproductinfo.description}"></br>
    <input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>