<%--
  Created by IntelliJ IDEA.
  User: 梓怡
  Date: 2019/11/29
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="<%=request.getContextPath()%>/js/echarts.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
</head>
<body>
    <div id='shangping' style="width:600px;height: 600px;"></div>
</body>
    <script type="text/javascript">
        var myecharts = echarts.init(document.getElementById("shangping"));
        myecharts.setOption({
            title:{
                text:'商品展示'
            },
            dataset:{
                source:${list}
            },
            //X轴
            xAxis:{
                type:'category'
            },
            yAxis:{},
            series:[
                {type:'bar'}
            ]
        })
    </script>
</html>