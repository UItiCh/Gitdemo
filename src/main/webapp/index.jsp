<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<body>
<h2>
    <a href="/index">点击一下跳转</a>

    <a href="/index2">点击一下跳转</a>

    <a href="/index3" >点击一下跳转</a>

    <button type="button" onclick="ajaxdemo()">点击</button>
</h2>

<script type="text/javascript">
    function ajaxdemo(){
        $.post("index3")

    }
</script>

</body>
</html>
