<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>申请秒杀商品</title>
</head>
<body>
<form action="applymsproduct" method="post">
    商品id:<input name="productid"></br>
    商品标题:<input name="producttitle"></br>
    商品图片地址:<input name="productpic"></br>
    原价格:<input name="originalprice"></br>
    秒杀价格:<input name="miaoshaprice"></br>
    商家id:<input name="merchantid"></br>
    秒杀开始时间:<input name="starttimeStr"></br>
    秒杀结束时间:<input name="endtimeStr"></br>
    商品数量:<input name="productcount"></br>
    剩余库存数:<input name="stockcount"></br>
    商品描述:<input name="description"></br>
    <input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
