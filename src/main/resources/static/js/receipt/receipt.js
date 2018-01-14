$(function () {
    $('#table').bootstrapTable({
        method: "get",
        toolbar: "#toolbar", //工具栏
        cache: false,
        sortable: true,
        isField: "id",
        uniqueId: "id",
        sortName: "id",
        sortOrder: "asc",
        sortStable: true,
        pagination: true,
        pageNumber: 1,
        pageSize: 10,
        pageList: [5, 10, 15, 20],
        selectItemName: 'id',
        smartDisplay: true,
        showRefresh: true,
        singleSelect: true,
        checkboxHeader: true,
        url: '/receipt/receiptList',
        queryParamsType: '',    //不填的话,则只传pageNumber 和pageSize 两个字段
        sidePagination: 'server', //服务端分页
        strictSearch: false,
        searchText: '', //
        minimumCountColumns: 2,
        //clickToSelect: true,
        search: true,
        searchAlign: 'right',
        queryParams: queryParams,
        formatLoadingMessage: function () {
            return "请稍等，正在加载中...";
        },
        columns: [
            {
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
            }, {
                field: 'status',
                title: '仓单状态',
                align: 'center',
                formatter:function (value,row,index) {
                    if(value == 0){
                        return "未发布";
                    }
                    if (value == 1){
                        return "已锁定";
                    }
                }
            }, {
                field: 'id',
                title: '操作',
                align: 'center',
                formatter: function (value, row, index) {
                    //通过formatter可以自定义列显示的内容
                    //value：当前field的值，即id
                    //row：当前行的数据
                    var a = '<a href="javascript:void(0);" onclick="getDetail('+value+')">查看详情</a>';
                    return a;
                }
            }]
    });

    function getDetail(value) {
        console.log(value);
    }

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
});