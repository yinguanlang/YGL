<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/23
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <title>聊天室列表</title>
    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style>
        #img{
            margin: 50px;
            width: 50px;
            height: 50px;
            float: left;
        }
        #container{
            border: 1px solid ;
            color: red;
            width: 300px;
            height: 600px;
            background-color: #46b8da;
        }
        #name{
            width: 50px;
            background-color: #46b8da;

        }
    </style>
</head>
<body>
<div id="container" class="container">
    <div>
            <img src="./resources/img/timgXQFP8LC8.jpg" id="img" class="img-circle">
    </div>


</div>
</body>
</html>
