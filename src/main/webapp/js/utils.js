//调用ajax同步提交
//任务返回成功，则提示成功，否则提示失败的信息
function callByAJax(url,data_){
	var result;
	$.ajax({
		url : url,
		data: data_,
		async:false,
		dataType:"json",
		context : document.body,
		success : function(data) {
			result=data;
		}
	});
//	console.info("result:"+result);
	return result;
}