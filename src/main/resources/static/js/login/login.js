$(function () {

    $('#btn').click(function () {
        if ($('#inputName').val() == ''){
            alert('账号不能为空');
        }else if($('#inputPassword').val() == ''){
            alert('密码不能为空');
        }else {
            $.ajax({
                url:'/login',
                type: 'POST',
                dataType:'json',
                data:$('#loginFrom').serialize(),
                success:function (data) {
                    alert(data.message);
                    if (data.success){
                        //成功后该怎么做

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