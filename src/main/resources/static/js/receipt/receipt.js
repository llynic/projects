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
                title: '价格(元)',
                align: 'center'
            },/* {
                field: 'brand',
                title: '品牌',
                align: 'center'
            },*/ {
                field: 'depotAddress',
                title: '仓储名称',
                align: 'center'
            }, /*{
                field: 'valid',
                title: '仓单有效期',
                align: 'center'
            },*/ {
                field: 'status',
                title: '仓单状态',
                align: 'center',
                formatter: function (value, row, index) {
                    if (value == 0) {
                        return "未发布";
                    }
                    if (value == 1) {
                        return "已锁定";
                    }
                }
            }, {
                field: 'id',
                title: '操作',
                align: 'center',
                formatter: function (value, row, index) {
                    return '<a href="javascript:void(0);" class="detail" title="查看详情">查看详情</a>';
                },
                events:{
                    //此处注意,click 后面要跟一个英文的空格,否则没有效果
                    'click .detail':function (event,value, row, index) {
                        window.location.href="/receipt/detail/"+value;
                    }
                }
            }]
    });


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