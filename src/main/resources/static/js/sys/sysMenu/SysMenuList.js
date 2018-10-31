var sysMenuModle = (function () {
    $('#SysMenutable').bootstrapTable({
        url: '/sysMenu/getSysMenuData',
        queryParamsType: '',              //默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
        queryParams: queryParams,
        uniqueId: "id",
        method: "post",
        contentType: "application/x-www-form-urlencoded",
        pagination: true,
        pageNumber: 1,
        pageSize: 5,
        pageList: [10, 20, 50, 100],
        sidePagination: "server",         //分页方式：client客户端分页，server服务端分页（*）
        striped: false,                   //是否显示行间隔色
        cache: false,
        uniqueId: "id",                       //每一行的唯一标识，一般为主键列
        height: 500,
        paginationPreText: "上一页",
        paginationNextText: "下一页",
        search: false,
        showColumns: true,
        showRefresh: true,
        detailView: true,
        columns: [
            {checkbox: true, width: '5%'},
            {
                field: 'id',
                title: '',
                sortable: true
            },

            {
                field: 'menuName',
                title: '菜单名称',
                sortable: true
            },

            {
                field: 'menuLevel',
                title: '等级',
                sortable: true
            },

            {
                field: 'menuParent',
                title: '父级',
                sortable: true
            },

            {
                field: 'menuOrder',
                title: '排序',
                sortable: true
            },

            {
                field: 'menuChild',
                title: '子级',
                sortable: true
            },

            {
                field: 'memo',
                title: '描述',
                sortable: true
            },

            {
                field: 'menuUrl',
                title: '地址',
                sortable: true
            },

            {
                title: '操作',
                field: 'id',
                width: '20%',
                formatter: opeate
            }
        ]
    });

    function opeate(value, row, index) {
        var html = '<a title="修改" href="javascript:void(0)" onclick="sysMenuAddEdit.toUpdate(' + row.id + ',\'edit\')"><i class="fa fa-pencil-square-o fa-lg" aria-hidden="true"></i></a>';
        html += '&nbsp;&nbsp;&nbsp;&nbsp;<a title="查看" href="javascript:void(0)" onclick="sysMenuAddEdit.toUpdate(' + row.id + ',\'view\')"><i class="fa fa-bars fa-lg" aria-hidden="true"></i></a>';
        html += '&nbsp;&nbsp;&nbsp;&nbsp;<a title="删除" href="javascript:void(0)" onclick="sysMenuAddEdit.doDel(' + row.id + ')" ><i class="fa fa-times fa-lg" aria-hidden="true"></i></a>';
        return html;
    }


//查询条件
    function queryParams(params) {
        return {
            pageSize: params.pageSize,
            pageIndex: params.pageNumber,
        };
    }

//查询事件
    function SearchData() {
        $('#SysMenutable').bootstrapTable('refresh', {pageNumber: 1});
    }

    return {
        SearchData: SearchData
    }
})();

