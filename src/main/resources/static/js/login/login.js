$(function () {
    $('#btn').click(function () {
        if ($('#username').val() == ''){
            alert('账号不能为空');
        }else if($('#password').val() == ''){
            alert('密码不能为空');
        }else {
            $.ajax({
                url:'/user/login',
                type: 'POST',
                dataType:'json',
                data:$('#loginFrom').serialize(),
                success:function (data) {
                    if (data.success){
                        //成功后该怎么做
                        window.location.href="/home"
                    }else{
                        //失败后该怎么做
                    }
                },
                error:function () {
                    alert("请求连接超时");
                }
            })
        }
    });
});