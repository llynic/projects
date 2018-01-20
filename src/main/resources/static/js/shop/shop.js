$(function () {

    /*$('#table').bootstrapTable({
        method: "get",
        //toolbar: "#toolbar", //工具栏
        cache: false,
        sortable: true,
        uniqueId: "id",
        //sortName: "id",
        //sortOrder: "asc",
        sortStable: true,
        pagination: true,
        pageNumber: 1,
        pageSize: 10,
        pageList: [5, 10, 15, 20],
        selectItemName: 'id',
        smartDisplay: true,
        showRefresh: true,
        //paginationPreText: '',
        //paginationNextText: '',
        singleSelect: true,
        checkboxHeader: true,
        url: '/receipt/receiptList',
        queryParamsType: '',    //不填的话,则只传pageNumber 和pageSize 两个字段
        sidePagination: 'server', //服务端分页
        strictSearch: false,
        searchText: '', //
        minimumCountColumns: 2,
        clickToSelect: true,
        search: true,
        searchAlign: 'left',
        queryParams: queryParams,
        columns: [
            {
                radio: true
            }, {
                title: 'ID',
                field: 'id',
                visible: false
            }, {
                title: '序号',
                field: 'number',
                formatter: function (value, row, index) {
                    //return index + 1;
                    var pageSize = $('#table').bootstrapTable('getOptions').pageSize;//通过表的#id 可以得到每页多少条
                    var pageNumber = $('#table').bootstrapTable('getOptions').pageNumber;//通过表的#id 可以得到当前第几页
                    return pageSize * (pageNumber - 1) + index + 1;    //返回每条的序号： 每页条数 * （当前页 - 1 ）+ 序号
                },
                align: 'center'
            }, {
                field: 'code',
                title: '仓单号',
                align: 'center'
            }, {
                field: 'price',
                title: '价格',
                align: 'center'
            }, {
                field: 'depotAddress',
                title: '仓储名称',
                align: 'center'
            }]
    })*/


    function queryParams(params) {
        var temp = {
            //minPrice: $('#minPrice').val(),
            //maxPrice: $('#maxPrice').val(),
            //searchText: params.searchText,
            pageSize: params.pageSize,
            pageNumber: params.pageNumber
        };
        return temp;
    }


    $("#inputReceiptNo").focus(function () {
        $('#table').bootstrapTable({
            method: "get",
            //toolbar: "#toolbar", //工具栏
            cache: false,
            sortable: true,
            uniqueId: "id",
            //sortName: "id",
            //sortOrder: "asc",
            sortStable: true,
            pagination: true,
            pageNumber: 1,
            pageSize: 10,
            pageList: [5, 10, 15, 20],
            selectItemName: 'id',
            smartDisplay: true,
            showRefresh: true,
            //paginationPreText: '',
            //paginationNextText: '',
            singleSelect: true,
            checkboxHeader: true,
            url: '/receipt/receiptList',
            queryParamsType: '',    //不填的话,则只传pageNumber 和pageSize 两个字段
            sidePagination: 'server', //服务端分页
            strictSearch: false,
            searchText: '', //
            minimumCountColumns: 2,
            clickToSelect: true,
            search: true,
            searchAlign: 'left',
            queryParams: queryParams,
            columns: [
                {
                    radio: true
                }, {
                    title: 'ID',
                    field: 'id',
                    visible: false
                }, {
                    title: '序号',
                    field: 'number',
                    formatter: function (value, row, index) {
                        //return index + 1;
                        var pageSize = $('#table').bootstrapTable('getOptions').pageSize;//通过表的#id 可以得到每页多少条
                        var pageNumber = $('#table').bootstrapTable('getOptions').pageNumber;//通过表的#id 可以得到当前第几页
                        return pageSize * (pageNumber - 1) + index + 1;    //返回每条的序号： 每页条数 * （当前页 - 1 ）+ 序号
                    },
                    align: 'center'
                }, {
                    field: 'code',
                    title: '仓单号',
                    align: 'center'
                }, {
                    field: 'price',
                    title: '价格',
                    align: 'center'
                }, {
                    field: 'depotAddress',
                    title: '仓储名称',
                    align: 'center'
                }]
        });
        $('#myModal').modal('show');
    });

    $("#modalSave").click(function () {
        var a = $('#table').bootstrapTable('getSelections');
        if (a.length >= 1) {
            $('#myModal').modal('hide');
            var id = a[a.length - 1].id;
            console.log(a[a.length - 1].id);
            $.ajax({
                url: "/shop/selectReceipt",
                type: "POST",
                dataType: "json",
                data: {"id": id},
                timeout: 15000,
                beforeSend: function (XMLHttpRequest) {
                    //alert('远程调用开始...');
                    console.log("调用开始");
                    $("#loading").html("<img src='/images/timg.gif'/>");
                },
                success: function (data, textStatus) {
                    //alert('开始回调，状态文本值：'+textStatus+' 返回数据：'+data);
                    $("#loading").empty();
                    window.location.href = "/shop/add/" + id;
                },
                complete: function (XMLHttpRequest, textStatus) {
                    //alert('远程调用成功，状态文本值：'+textStatus);
                    $("#loading").empty();
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    //alert('error...状态文本值：'+textStatus+" 异常信息："+errorThrown);
                    $("#loading").empty();
                }
            })
            //window.location.href="";
        } else {
            alert("请选择一条仓单")
        }
    });

    $("#save").click(function () {
        console.log("save shop");
        $.ajax({
            type: "POST",//方法类型
            dataType: "json",//预期服务器返回的数据类型
            contentType: 'application/json;charset=UTF-8',
            url: "/shop/handlerShop" ,//url
            data: $('#shopInfo').serialize(),
            success: function (result) {
                console.log(result);//打印服务端返回的数据(调试用)
                if (result.errCode == 0000) {
                    alert("SUCCESS");
                }
                ;
            },
            error : function() {
                alert("异常！");
            }
        })
    })
    $("#shelves").click(function () {
        console.log("shelves shop");
    })


})