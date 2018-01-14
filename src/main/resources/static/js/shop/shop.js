$(function () {
    $('#table').bootstrapTable({
        method: "get",
        //toolbar: "#toolbar", //工具栏
        cache: false,
        sortable: true,
        uniqueId:"id",
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
        //queryParams: queryParams,
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
                    return index + 1;
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
                field: 'brand',
                title: '品牌',
                align: 'center'
            }, {
                field: 'depotAddress',
                title: '仓储名称',
                align: 'center'
            }, {
                field: 'valid',
                title: '仓单有效期',
                align: 'center'
            }]
    })

    function queryParams(params) {
        return {
            //name : $('#table input[name=\'name\']').val(),    // 请求时向服务端传递的参数
            //seqNo : $('#eventqueryform input[name=\'seqNo\']').val(),

            limit : params.limit, // 每页显示数量
            offset : params.offset, // SQL语句偏移量
        }
    }





    $("#inputReceiptNo").focus(function () {
        $('#myModal').modal('show');
    });

    $("#modalSave").click(function () {
        var a = $('#table').bootstrapTable('getSelections');
        if (a.length >= 1) {
            console.log(a[a.length - 1].id);
        } else {
            alert("请选择一条仓单")
        }
    });

})