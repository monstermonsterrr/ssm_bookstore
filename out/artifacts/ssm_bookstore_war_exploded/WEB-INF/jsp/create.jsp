<%--
  Created by IntelliJ IDEA.
  User: kgako
  Date: 2021/9/29
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-2.0.0.min.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add User From</title>
</head>
<body>
<form method="post">
    <fieldset>
        <legend>创建用户</legend>
        <p>
            <label>姓名：</label> <input type="text" id="name" name="name"
                                      tabindex="1">
        </p>
        <p>
            <label>年龄：</label> <input type="text" id="age" name="age"
                                      tabindex="2">
        </p>
        <p>
            <label>密码：</label> <input type="text" id="pwd" name="pwd"
                                      tabindex="3">
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4" value="取消"> <input
                id="submit" type="submit" tabindex="5" value="创建" onclick="sumbit()">
        </p>
    </fieldset>
</form>
<script type="text/javascript">
    function sumbit(){//a标签中的点击事件
        var userName=$("#name").val();//通过id获取输入框中用户输入的值
        var userPass=$("#pwd").val();
        $.ajax({
            type : 'post',
            url : '${pageContext.request.contextPath}/sav',
            //这里的/login对应LoginServlet类中注解的urlPatterns="/login"
            data:{'userName':userName,'userPass':userPass},
            traditional : true,
            async : false,
            dataType: 'json',
            success : function(data){//成功的事件
                alert("数据传送成功！");
                console.log(data.result);
            },
            error : function(data){//失败的事件
                alert("传送失败！");
            }
        });
    }

</script>
</body>
</html>