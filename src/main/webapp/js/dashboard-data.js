$(function() {

	// 求集群使用相关信息
	var ret = callByAJax("hadoop/hadoop_getHdfsDashBoard.action", {})
	Morris.Donut({
        element: 'morris-donut-chart-hdfs',
        data:ret ,
        resize: true
    });
    /*Morris.Donut({
        element: 'morris-donut-chart-hdfs',
        data: [{
            label: "Download Sales",
            value: 12
        }, {
            label: "In-Store Sales",
            value: 30
        }, {
            label: "Mail-Order Sales",
            value: 20
        }],
        resize: true
    });*/
	
	
    

});
