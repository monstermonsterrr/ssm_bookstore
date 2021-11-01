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
